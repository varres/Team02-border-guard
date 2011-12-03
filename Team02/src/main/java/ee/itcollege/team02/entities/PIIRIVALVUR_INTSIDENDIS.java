package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.INTSIDENT;
import javax.persistence.ManyToOne;
import ee.itcollege.team02.entities.PIIRIVALVUR;
import ee.itcollege.team02.entities.VAHTKOND_INTSIDENDIS;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class PIIRIVALVUR_INTSIDENDIS extends BaseEntity{

    @ManyToOne
    private INTSIDENT intsident;

    @ManyToOne
    private PIIRIVALVUR piirivalvur;

    @NotNull
    @ManyToOne
    private VAHTKOND_INTSIDENDIS vahtkond_intsidendis;

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

	
    public static List<PIIRIVALVUR_INTSIDENDIS> findAllPIIRIVALVUR_INTSIDENDISs() {
    	List<PIIRIVALVUR_INTSIDENDIS> items = entityManager().createQuery("SELECT o FROM PIIRIVALVUR_INTSIDENDIS o", PIIRIVALVUR_INTSIDENDIS.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		PIIRIVALVUR_INTSIDENDIS item = (PIIRIVALVUR_INTSIDENDIS) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }
}
