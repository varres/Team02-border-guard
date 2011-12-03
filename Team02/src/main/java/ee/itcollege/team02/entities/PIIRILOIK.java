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
public class PIIRILOIK extends BaseEntity {

    @NotNull
    @Size(max = 20)
    private String kood;

    @NotNull
    @Size(max = 60)
    private String nimetus;

    @NotNull
    private String GPS_koordinaadid;

    @NotNull
    private String kommentaar;

	public String getAvaja() {
		return avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}

	public Date getAvatud() {
		return avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}

	public String getMuutja() {
		return muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}

	public Date getMuudetud() {
		return muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}

	public String getSulgeja() {
		return sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}

	public Date getSuletud() {
		return suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}
    
    @Transactional
	public void remove() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userName = auth.getName();
	        if (this.entityManager == null) this.entityManager = entityManager();
	        if (this.entityManager.contains(this)) {
	        	
	        	this.setSulgeja(userName);
	        	this.setSuletud(new Date());
	        	this.merge();
	            //this.entityManager.remove(this);
	        } else {
	        	this.setSulgeja(userName);
	        	this.setSuletud(new Date());
	        	this.merge();
	            //BaseEntity attached = BaseEntity.findBaseEntity(this.id);
	            //this.entityManager.remove(attached);
	        }		
	}
    
    public static List<PIIRILOIK> findAllPIIRILOIKS() {
    	List<PIIRILOIK> items = entityManager().createQuery("SELECT o FROM PIIRILOIK o", PIIRILOIK.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		PIIRILOIK item = (PIIRILOIK) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "piiriloik")
    private Set<INTSIDENT> INTSIDENTs = new HashSet<INTSIDENT>();
}
