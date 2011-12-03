package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

import ee.itcollege.team02.common.Helper;

@RooJavaBean
@RooToString
@RooEntity
public class VAHTKOND extends BaseEntity {

    @NotNull
    @Size(max = 20)
    private String kood;

    @NotNull
    @Size(max = 60)
    private String nimetus;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date alates;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date kuni;

    @NotNull
    private String kommentaar;



	
    public static List<VAHTKOND> findAllVAHTKONDS() {
    	List<VAHTKOND> items = entityManager().createQuery("SELECT o FROM VAHTKOND o", VAHTKOND.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		VAHTKOND item = (VAHTKOND) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vahtkond")
    private Set<VAHTKOND_INTSIDENDIS> VAHTKOND_INTSIDENDISs = new HashSet<VAHTKOND_INTSIDENDIS>();
}
