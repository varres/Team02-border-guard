// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.entities;

import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import java.lang.Long;
import java.util.List;
import javax.persistence.Entity;

privileged aspect ISIK_INTSIDENDIS_Roo_Entity {
    
    declare @type: ISIK_INTSIDENDIS: @Entity;
    
    public static long ISIK_INTSIDENDIS.countISIK_INTSIDENDISs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM ISIK_INTSIDENDIS o", Long.class).getSingleResult();
    }
    
    public static ISIK_INTSIDENDIS ISIK_INTSIDENDIS.findISIK_INTSIDENDIS(Long id) {
        if (id == null) return null;
        return entityManager().find(ISIK_INTSIDENDIS.class, id);
    }
    
    public static List<ISIK_INTSIDENDIS> ISIK_INTSIDENDIS.findISIK_INTSIDENDISEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM ISIK_INTSIDENDIS o", ISIK_INTSIDENDIS.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
