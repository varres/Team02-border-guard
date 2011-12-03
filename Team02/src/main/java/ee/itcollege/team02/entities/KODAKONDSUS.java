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
import ee.itcollege.team02.entities.RIIK;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@RooJavaBean
@RooToString
@RooEntity
public class KODAKONDSUS extends BaseEntity {

    @ManyToOne
    private PIIRIRIKKUJA piiririkkuja;

    @ManyToOne
    private RIIK riik;

    @NotNull
    @Size(max = 20)
    private String isikukood;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date alates;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date kuni;

    private String kommentaar;


    public static List<KODAKONDSUS> findAllKODAKONDSUS() {
    	List<KODAKONDSUS> items = entityManager().createQuery("SELECT o FROM KODAKONDSUS o", KODAKONDSUS.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		KODAKONDSUS item = (KODAKONDSUS) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }

}
