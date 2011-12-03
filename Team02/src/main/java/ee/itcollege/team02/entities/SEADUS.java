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
import ee.itcollege.team02.entities.SEADUSE_PUNKT;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class SEADUS extends BaseEntity {
    @NotNull
    @Size(max = 20)
    private String kood;

    @NotNull
    @Size(max = 20)
    private String nimetus;

    @NotNull
    @Size(max = 20)
    private String kehtiv_alates;

    @NotNull
    @Size(max = 20)
    private String kehtiv_kuni;

    @NotNull
    @Size(max = 20)
    private String kommentaar;
    

	
    public static List<SEADUS> findAllSEADUS() {
    	List<SEADUS> items = entityManager().createQuery("SELECT o FROM SEADUS o", SEADUS.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		SEADUS item = (SEADUS) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seadus")
    private Set<SEADUSE_PUNKT> SEADUSE_PUNKTs = new HashSet<SEADUSE_PUNKT>();
}
