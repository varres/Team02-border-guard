// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.entities;

import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.SEADUSE_PUNKT;
import java.lang.String;
import java.util.Date;

privileged aspect ISIKU_SEADUS_INTSIDENDIS_Roo_JavaBean {
    
    public SEADUSE_PUNKT ISIKU_SEADUS_INTSIDENDIS.getSeaduse_punkt() {
        return this.seaduse_punkt;
    }
    
    public void ISIKU_SEADUS_INTSIDENDIS.setSeaduse_punkt(SEADUSE_PUNKT seaduse_punkt) {
        this.seaduse_punkt = seaduse_punkt;
    }
    
    public ISIK_INTSIDENDIS ISIKU_SEADUS_INTSIDENDIS.getIsik_intsidendis() {
        return this.isik_intsidendis;
    }
    
    public void ISIKU_SEADUS_INTSIDENDIS.setIsik_intsidendis(ISIK_INTSIDENDIS isik_intsidendis) {
        this.isik_intsidendis = isik_intsidendis;
    }
    
    public Date ISIKU_SEADUS_INTSIDENDIS.getAlates() {
        return this.alates;
    }
    
    public void ISIKU_SEADUS_INTSIDENDIS.setAlates(Date alates) {
        this.alates = alates;
    }
    
    public Date ISIKU_SEADUS_INTSIDENDIS.getKuni() {
        return this.kuni;
    }
    
    public void ISIKU_SEADUS_INTSIDENDIS.setKuni(Date kuni) {
        this.kuni = kuni;
    }
    
    public String ISIKU_SEADUS_INTSIDENDIS.getKirjeldus() {
        return this.kirjeldus;
    }
    
    public void ISIKU_SEADUS_INTSIDENDIS.setKirjeldus(String kirjeldus) {
        this.kirjeldus = kirjeldus;
    }
    
    public String ISIKU_SEADUS_INTSIDENDIS.getKommentaar() {
        return this.kommentaar;
    }
    
    public void ISIKU_SEADUS_INTSIDENDIS.setKommentaar(String kommentaar) {
        this.kommentaar = kommentaar;
    }
    
}
