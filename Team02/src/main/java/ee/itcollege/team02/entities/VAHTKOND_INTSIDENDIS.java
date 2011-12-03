package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Size;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.INTSIDENT;
import javax.persistence.ManyToOne;
import java.util.Set;
import ee.itcollege.team02.entities.PIIRIVALVUR_INTSIDENDIS;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class VAHTKOND_INTSIDENDIS  extends BaseEntity{

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date alates;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date kuni;

    @NotNull
    private String kirjeldus;

    private String kommentaar;

	
    public static List<VAHTKOND_INTSIDENDIS> findAllVAHTKOND_INTSIDENDISs() {
    	List<VAHTKOND_INTSIDENDIS> items =  entityManager().createQuery("SELECT o FROM VAHTKOND_INTSIDENDIS o", VAHTKOND_INTSIDENDIS.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		VAHTKOND_INTSIDENDIS item = (VAHTKOND_INTSIDENDIS) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }
	
	

    @ManyToOne
    private INTSIDENT intsident;
    
    @ManyToOne
    private VAHTKOND vahtkond;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vahtkond_intsidendis")
    private Set<PIIRIVALVUR_INTSIDENDIS> PIIRIVALVUR_INTSIDENDISs = new HashSet<PIIRIVALVUR_INTSIDENDIS>();
}
