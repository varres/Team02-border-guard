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
import ee.itcollege.team02.entities.INTSIDENT;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class INTSIDENDI_LIIK extends BaseEntity {

    @NotNull
    @Size(max = 20)
    private String kood;

    @NotNull
    @Size(max = 60)
    private String nimetus;

    @NotNull
    private String kommentaar;
    

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intsidendi_liik")
    private Set<INTSIDENT> INTSIDENTs = new HashSet<INTSIDENT>();

    
    public static List<INTSIDENDI_LIIK> findAllINTSIDENDI_LIIKs() {
    	List<INTSIDENDI_LIIK> items = entityManager().createQuery("SELECT o FROM INTSIDENDI_LIIK o", INTSIDENDI_LIIK.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		INTSIDENDI_LIIK item = (INTSIDENDI_LIIK) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }

}
