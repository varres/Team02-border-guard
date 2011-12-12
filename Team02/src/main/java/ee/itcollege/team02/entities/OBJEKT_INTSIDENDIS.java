package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.INTSIDENT;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class OBJEKT_INTSIDENDIS extends BaseEntity{

    @ManyToOne
    private INTSIDENT intsident;

    @ManyToOne
    private OBJEKT objekt;

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


    public static List<OBJEKT_INTSIDENDIS> findAllOBJEKT_INTSIDENDISs() {
    	List<OBJEKT_INTSIDENDIS> items = entityManager().createQuery("SELECT o FROM OBJEKT_INTSIDENDIS o", OBJEKT_INTSIDENDIS.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		OBJEKT_INTSIDENDIS item = (OBJEKT_INTSIDENDIS) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }

    public static List<OBJEKT_INTSIDENDIS> findIntsidentObjects(Long intsidentId) {
    	return entityManager().createQuery("SELECT o FROM OBJEKT_INTSIDENDIS o WHERE o.intsident.id = :intsidentId AND o.suletud > :date", OBJEKT_INTSIDENDIS.class).setParameter("intsidentId", intsidentId).setParameter("date", getDate()).getResultList();
    }

}
