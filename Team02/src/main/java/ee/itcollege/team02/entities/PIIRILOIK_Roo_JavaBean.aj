// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.entities;

import ee.itcollege.team02.entities.INTSIDENT;
import java.lang.String;
import java.util.Set;

privileged aspect PIIRILOIK_Roo_JavaBean {
    
    public String PIIRILOIK.getKood() {
        return this.kood;
    }
    
    public void PIIRILOIK.setKood(String kood) {
        this.kood = kood;
    }
    
    public String PIIRILOIK.getNimetus() {
        return this.nimetus;
    }
    
    public void PIIRILOIK.setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }
    
    public String PIIRILOIK.getGPS_koordinaadid() {
        return this.GPS_koordinaadid;
    }
    
    public void PIIRILOIK.setGPS_koordinaadid(String GPS_koordinaadid) {
        this.GPS_koordinaadid = GPS_koordinaadid;
    }
    
    public String PIIRILOIK.getKommentaar() {
        return this.kommentaar;
    }
    
    public void PIIRILOIK.setKommentaar(String kommentaar) {
        this.kommentaar = kommentaar;
    }
    
    public Set<INTSIDENT> PIIRILOIK.getINTSIDENTs() {
        return this.INTSIDENTs;
    }
    
    public void PIIRILOIK.setINTSIDENTs(Set<INTSIDENT> INTSIDENTs) {
        this.INTSIDENTs = INTSIDENTs;
    }
    
}
