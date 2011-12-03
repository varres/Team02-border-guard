package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Set;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.OBJEKT_INTSIDENDIS;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;

@RooJavaBean
@RooToString
@RooEntity
public class OBJEKT extends BaseEntity {

    @NotNull
    @Size(max = 100)
    private String nimetus;

    private String kommentaar;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "objekt")
    private Set<OBJEKT_INTSIDENDIS> OBJEKT_INTSIDENDISs = new HashSet<OBJEKT_INTSIDENDIS>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "objekt")
    private Set<PIIRIRIKKUJA> PIIRIRIKKUJAs = new HashSet<PIIRIRIKKUJA>();
    
    
    
    public static List<OBJEKT> findAllOBJEKTS() {
    	List<OBJEKT> items = entityManager().createQuery("SELECT o FROM OBJEKT o", OBJEKT.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		OBJEKT item = (OBJEKT) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }
}
