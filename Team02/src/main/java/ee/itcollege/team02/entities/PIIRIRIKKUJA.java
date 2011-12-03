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

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.OBJEKT;
import javax.persistence.ManyToOne;
import java.util.Set;
import ee.itcollege.team02.entities.KODAKONDSUS;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;

@RooJavaBean
@RooToString
@RooEntity
public class PIIRIRIKKUJA extends BaseEntity {

    @NotNull
    @Size(max = 20)
    private String isikukood;

    @NotNull
    @Size(max = 25)
    private String eesnimi;

    @NotNull
    @Size(max = 35)
    private String perek_nimi;

    @NotNull
    @Size(max = 1)
    private String sugu;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date synniaeg;

    @ManyToOne
    private OBJEKT objekt;

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
	
    public static List<PIIRIRIKKUJA> findAllPIIRIRIKKUJAS() {
    	List<PIIRIRIKKUJA> items = entityManager().createQuery("SELECT o FROM PIIRIRIKKUJA o", PIIRIRIKKUJA.class).getResultList();
    	for (int i = items.size() - 1; i >= 0; i--) 
    	{ 
    		PIIRIRIKKUJA item = (PIIRIRIKKUJA) items.get(i);
    	    if (!Helper.IsSurrogateDate(item.getSuletud())){ 
    	    	items.remove(i); 
    	    }    	
    	} 
    	return items;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "piiririkkuja")
    private Set<KODAKONDSUS> KODAKONDSUSs = new HashSet<KODAKONDSUS>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "piiririkkuja")
    private Set<ISIK_INTSIDENDIS> ISIK_INTSIDENDISs = new HashSet<ISIK_INTSIDENDIS>();
}
