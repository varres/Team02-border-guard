package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Set;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.PIIRIVALVUR_INTSIDENDIS;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class PIIRIVALVUR extends BaseEntity{

    @NotNull
    @Size(max = 20)
    private String isikukood;

    @NotNull
    @Size(max = 25)
    private String eesnimed;

    @NotNull
    @Size(max = 35)
    private String perekonnanimi;

    @NotNull
    @Size(max = 1)
    private String sugu;

    @NotNull
    @Size(max = 20)
    private String soduri_kood;

    @NotNull
    private String kommentaar;

	
    public static List<PIIRIVALVUR> findAllPIIRIVALVURS() {
    	List<PIIRIVALVUR> items = entityManager().createQuery("SELECT o FROM PIIRIVALVUR o", PIIRIVALVUR.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		PIIRIVALVUR item = (PIIRIVALVUR) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "piirivalvur")
    private Set<PIIRIVALVUR_INTSIDENDIS> PIIRIVALVUR_INTSIDENDISs = new HashSet<PIIRIVALVUR_INTSIDENDIS>();
}
