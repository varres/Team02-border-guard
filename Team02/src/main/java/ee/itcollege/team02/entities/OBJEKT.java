package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Set;
import ee.itcollege.team02.entities.OBJEKT_INTSIDENDIS;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;

@RooJavaBean
@RooToString
@RooEntity
public class OBJEKT {

    @NotNull
    private Integer objekt_ID;

    @NotNull
    @Size(max = 100)
    private String nimetus;

    private String kommentaar;

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "objekt")
    private Set<OBJEKT_INTSIDENDIS> OBJEKT_INTSIDENDISs = new HashSet<OBJEKT_INTSIDENDIS>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "objekt")
    private Set<PIIRIRIKKUJA> PIIRIRIKKUJAs = new HashSet<PIIRIRIKKUJA>();
}
