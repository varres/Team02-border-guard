package ee.itcollege.team02.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PersistenceContext;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

import ee.itcollege.team02.common.Helper;


@MappedSuperclass
@RooToString
@RooEntity(mappedSuperclass = true)
public abstract class BaseEntity {
	
    @PersistenceContext
    transient EntityManager entityManager;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
    
	public static final EntityManager entityManager() {
        EntityManager em = new INTSIDENT() {
        }.entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
	}

    @PrePersist
    public void recordCreated() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userName = auth.getName();
        
        avatud = new Date();
        avaja = userName;
        try {
			muudetud = new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
        muutja = "SURROGATEUSER";
        try {
			suletud = new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
        sulgeja = "SURROGATEUSER";
    }

    @PreUpdate
    public void recordModified() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userName = auth.getName();
        
        muudetud = new Date();
        muutja = userName;
    }

    @PreRemove
    public void preventRemove() {
        throw new SecurityException("Removing of database items is prohibited!");
    }
    
	@NotNull
    @Size(max = 32)
	private String avaja;
	

	@NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date avatud;

    @NotNull
    @Size(max = 32)
    private String muutja;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date muudetud;

    @NotNull
    @Size(max = 32)
    private String sulgeja;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date suletud;
    
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
	        	
	        	sulgeja = userName;
	        	suletud = new Date();
	        	this.merge();
	            //this.entityManager.remove(this);
	        } else {
	        	sulgeja = userName;
	        	suletud = new Date();
	        	this.merge();
	            //BaseEntity attached = BaseEntity.findBaseEntity(this.id);
	            //this.entityManager.remove(attached);
	        }		
    }
    
	protected static  Date getDate() {
		return new Date();
	}
    
}
