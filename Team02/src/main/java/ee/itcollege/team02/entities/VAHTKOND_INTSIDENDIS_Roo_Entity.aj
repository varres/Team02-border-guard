// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.entities;

import ee.itcollege.team02.entities.VAHTKOND_INTSIDENDIS;
import java.lang.Long;
import java.util.List;
import javax.persistence.Entity;

privileged aspect VAHTKOND_INTSIDENDIS_Roo_Entity {
    
    declare @type: VAHTKOND_INTSIDENDIS: @Entity;
    
    public static long VAHTKOND_INTSIDENDIS.countVAHTKOND_INTSIDENDISs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM VAHTKOND_INTSIDENDIS o", Long.class).getSingleResult();
    }
    
    public static VAHTKOND_INTSIDENDIS VAHTKOND_INTSIDENDIS.findVAHTKOND_INTSIDENDIS(Long id) {
        if (id == null) return null;
        return entityManager().find(VAHTKOND_INTSIDENDIS.class, id);
    }
    
    public static List<VAHTKOND_INTSIDENDIS> VAHTKOND_INTSIDENDIS.findVAHTKOND_INTSIDENDISEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM VAHTKOND_INTSIDENDIS o", VAHTKOND_INTSIDENDIS.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
