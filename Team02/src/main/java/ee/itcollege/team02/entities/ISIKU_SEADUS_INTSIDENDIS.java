package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.SEADUSE_PUNKT;
import javax.persistence.ManyToOne;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooEntity
public class ISIKU_SEADUS_INTSIDENDIS extends BaseEntity {

    @ManyToOne
    private SEADUSE_PUNKT seaduse_punkt;

    @ManyToOne
    private ISIK_INTSIDENDIS isik_intsidendis;

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

	
    public static List<ISIKU_SEADUS_INTSIDENDIS> findAllISIKU_SEADUS_INTSIDENDISs() {
    	List<ISIKU_SEADUS_INTSIDENDIS> items = entityManager().createQuery("SELECT o FROM ISIKU_SEADUS_INTSIDENDIS o", ISIKU_SEADUS_INTSIDENDIS.class).getResultList();
        for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
        	ISIKU_SEADUS_INTSIDENDIS item = (ISIKU_SEADUS_INTSIDENDIS) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }

}
