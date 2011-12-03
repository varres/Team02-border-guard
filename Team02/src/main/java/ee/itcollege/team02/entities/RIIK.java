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
import ee.itcollege.team02.entities.KODAKONDSUS;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

@RooJavaBean
@RooToString
@RooEntity
public class RIIK extends BaseEntity {

    @NotNull
    @Size(max = 20)
    private String ISO_kood;

    @NotNull
    @Size(max = 20)
    private String ANSI_kood;

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
	
    public static List<RIIK> findAllRIIKS() {
    	List<RIIK> items = entityManager().createQuery("SELECT o FROM RIIK o", RIIK.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		RIIK item = (RIIK) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "riik")
    private Set<KODAKONDSUS> KODAKONDSUSs = new HashSet<KODAKONDSUS>();
}
