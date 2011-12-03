package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.PIIRILOIK;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Digits;
import ee.itcollege.team02.entities.INTSIDENDI_LIIK;
import java.util.Set;
import ee.itcollege.team02.entities.VAHTKOND_INTSIDENDIS;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import ee.itcollege.team02.entities.PIIRIVALVUR_INTSIDENDIS;
import ee.itcollege.team02.entities.OBJEKT_INTSIDENDIS;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;

@RooJavaBean
@RooToString
@RooEntity
public class INTSIDENT extends BaseEntity {
	
    @PersistenceContext
    transient EntityManager entityManager;

    @NotNull
    @Size(max = 20)
    private String kood;

    @NotNull
    @Size(max = 100)
    private String nimetus;

    @ManyToOne
    private PIIRILOIK piiriloik;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date toimumise_algus;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date toimumise_lopp;

    @Digits(integer = 4, fraction = 5)
    private Double GPS_longituud;

    @Digits(integer = 4, fraction = 5)
    private Double GPS_latituud;

    @NotNull
    private String kirjeldus;

    private String kommentaar;

    @ManyToOne
    private INTSIDENDI_LIIK intsidendi_liik;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intsident")
    private Set<VAHTKOND_INTSIDENDIS> VAHTKOND_INTSIDENDISs = new HashSet<VAHTKOND_INTSIDENDIS>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intsident")
    private Set<PIIRIVALVUR_INTSIDENDIS> PIIRIVALVUR_INTSIDENDISs = new HashSet<PIIRIVALVUR_INTSIDENDIS>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intsident")
    private Set<OBJEKT_INTSIDENDIS> OBJEKT_INTSIDENDISs = new HashSet<OBJEKT_INTSIDENDIS>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intsident")
    private Set<ISIK_INTSIDENDIS> ISIK_INTSIDENDISs = new HashSet<ISIK_INTSIDENDIS>();


    public static List<INTSIDENT> findAllINTSIDENTS() {
    	List<INTSIDENT> items = entityManager().createQuery("SELECT o FROM INTSIDENT o", INTSIDENT.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		INTSIDENT item = (INTSIDENT) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }


}
