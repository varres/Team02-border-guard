// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.entities;

import ee.itcollege.team02.entities.PIIRIRIKKUJA;
import ee.itcollege.team02.entities.RIIK;
import java.lang.String;
import java.util.Date;

privileged aspect KODAKONDSUS_Roo_JavaBean {
    
    public PIIRIRIKKUJA KODAKONDSUS.getPiiririkkuja() {
        return this.piiririkkuja;
    }
    
    public void KODAKONDSUS.setPiiririkkuja(PIIRIRIKKUJA piiririkkuja) {
        this.piiririkkuja = piiririkkuja;
    }
    
    public RIIK KODAKONDSUS.getRiik() {
        return this.riik;
    }
    
    public void KODAKONDSUS.setRiik(RIIK riik) {
        this.riik = riik;
    }
    
    public String KODAKONDSUS.getIsikukood() {
        return this.isikukood;
    }
    
    public void KODAKONDSUS.setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }
    
    public Date KODAKONDSUS.getAlates() {
        return this.alates;
    }
    
    public void KODAKONDSUS.setAlates(Date alates) {
        this.alates = alates;
    }
    
    public Date KODAKONDSUS.getKuni() {
        return this.kuni;
    }
    
    public void KODAKONDSUS.setKuni(Date kuni) {
        this.kuni = kuni;
    }
    
    public String KODAKONDSUS.getKommentaar() {
        return this.kommentaar;
    }
    
    public void KODAKONDSUS.setKommentaar(String kommentaar) {
        this.kommentaar = kommentaar;
    }
    
}
