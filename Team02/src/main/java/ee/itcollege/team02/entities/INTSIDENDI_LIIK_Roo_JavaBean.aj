// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.entities;

import ee.itcollege.team02.entities.INTSIDENT;
import java.lang.String;
import java.util.Set;

privileged aspect INTSIDENDI_LIIK_Roo_JavaBean {
    
    public String INTSIDENDI_LIIK.getKood() {
        return this.kood;
    }
    
    public void INTSIDENDI_LIIK.setKood(String kood) {
        this.kood = kood;
    }
    
    public String INTSIDENDI_LIIK.getNimetus() {
        return this.nimetus;
    }
    
    public void INTSIDENDI_LIIK.setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }
    
    public String INTSIDENDI_LIIK.getKommentaar() {
        return this.kommentaar;
    }
    
    public void INTSIDENDI_LIIK.setKommentaar(String kommentaar) {
        this.kommentaar = kommentaar;
    }
    
    public Set<INTSIDENT> INTSIDENDI_LIIK.getINTSIDENTs() {
        return this.INTSIDENTs;
    }
    
    public void INTSIDENDI_LIIK.setINTSIDENTs(Set<INTSIDENT> INTSIDENTs) {
        this.INTSIDENTs = INTSIDENTs;
    }
    
}
