// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.entities;

import ee.itcollege.team02.entities.KODAKONDSUS;
import java.lang.String;
import java.util.Set;

privileged aspect RIIK_Roo_JavaBean {
    
    public String RIIK.getISO_kood() {
        return this.ISO_kood;
    }
    
    public void RIIK.setISO_kood(String ISO_kood) {
        this.ISO_kood = ISO_kood;
    }
    
    public String RIIK.getANSI_kood() {
        return this.ANSI_kood;
    }
    
    public void RIIK.setANSI_kood(String ANSI_kood) {
        this.ANSI_kood = ANSI_kood;
    }
    
    public String RIIK.getKommentaar() {
        return this.kommentaar;
    }
    
    public void RIIK.setKommentaar(String kommentaar) {
        this.kommentaar = kommentaar;
    }
    
    public Set<KODAKONDSUS> RIIK.getKODAKONDSUSs() {
        return this.KODAKONDSUSs;
    }
    
    public void RIIK.setKODAKONDSUSs(Set<KODAKONDSUS> KODAKONDSUSs) {
        this.KODAKONDSUSs = KODAKONDSUSs;
    }
    
}
