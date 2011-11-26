package ee.itcollege.team02.entities;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import ee.itcollege.team02.entities.SEADUS;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import ee.itcollege.team02.entities.ISIKU_SEADUS_INTSIDENDIS;

@RooJavaBean
@RooToString
@RooEntity
public class SEADUSE_PUNKT {

    @NotNull
    private Integer seaduse_punkt_ID;

    @NotNull
    @ManyToOne
    private SEADUS seadus;

    @NotNull
    @Size(max = 20)
    private String paragrahv;

    @NotNull
    @Size(max = 20)
    private String pais;

    @NotNull
    @Size(max = 20)
    private String tekst;

    @NotNull
    @Size(max = 20)
    private String kehtiv_alates;

    @NotNull
    @Size(max = 20)
    private String kehtiv_kuni;

    @NotNull
    @Size(max = 20)
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ylemus_seaduse_punkt")
    private Set<ee.itcollege.team02.entities.SEADUSE_PUNKT> SEADUSE_PUNKTs = new HashSet<ee.itcollege.team02.entities.SEADUSE_PUNKT>();

    @ManyToOne
    private SEADUS ylemus_seaduse_punkt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seaduse_punkt")
    private Set<ISIKU_SEADUS_INTSIDENDIS> ISIKU_SEADUS_INTSIDENDISs = new HashSet<ISIKU_SEADUS_INTSIDENDIS>();
}
