package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Size;
import java.util.Set;
import ee.itcollege.team02.entities.ISIKU_SEADUS_INTSIDENDIS;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class ISIK_INTSIDENDIS extends BaseEntity {

    @ManyToOne
    private PIIRIRIKKUJA piiririkkuja;
    
    @ManyToOne
    private ee.itcollege.team02.entities.INTSIDENT intsident;

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


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isik_intsidendis")
    private Set<ISIKU_SEADUS_INTSIDENDIS> ISIKU_SEADUS_INTSIDENDISs = new HashSet<ISIKU_SEADUS_INTSIDENDIS>();
    
    public static List<ISIK_INTSIDENDIS> findAllISIK_INTSIDENDISs() {
    	List<ISIK_INTSIDENDIS> items = entityManager().createQuery("SELECT o FROM ISIK_INTSIDENDIS o", ISIK_INTSIDENDIS.class).getResultList();
        for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
        	ISIK_INTSIDENDIS item = (ISIK_INTSIDENDIS) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }
    
    public static List<ISIK_INTSIDENDIS> findIntsidentIsiks(Long intsidentId) {
    	return entityManager().createQuery("SELECT o FROM ISIK_INTSIDENDIS o WHERE o.intsident.id = :intsidentId AND o.suletud > :date", ISIK_INTSIDENDIS.class).setParameter("intsidentId", intsidentId).setParameter("date", getDate()).getResultList();
    }
    
}
