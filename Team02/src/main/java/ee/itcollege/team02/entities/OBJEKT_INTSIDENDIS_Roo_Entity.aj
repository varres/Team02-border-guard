// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.entities;

import ee.itcollege.team02.entities.OBJEKT_INTSIDENDIS;
import java.lang.Long;
import java.util.List;
import javax.persistence.Entity;

privileged aspect OBJEKT_INTSIDENDIS_Roo_Entity {
    
    declare @type: OBJEKT_INTSIDENDIS: @Entity;
    
    public static long OBJEKT_INTSIDENDIS.countOBJEKT_INTSIDENDISs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM OBJEKT_INTSIDENDIS o", Long.class).getSingleResult();
    }
    
    public static OBJEKT_INTSIDENDIS OBJEKT_INTSIDENDIS.findOBJEKT_INTSIDENDIS(Long id) {
        if (id == null) return null;
        return entityManager().find(OBJEKT_INTSIDENDIS.class, id);
    }
    
    public static List<OBJEKT_INTSIDENDIS> OBJEKT_INTSIDENDIS.findOBJEKT_INTSIDENDISEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM OBJEKT_INTSIDENDIS o", OBJEKT_INTSIDENDIS.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
