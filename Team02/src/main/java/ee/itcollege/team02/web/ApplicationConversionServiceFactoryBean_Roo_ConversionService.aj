// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.web;

import ee.itcollege.team02.entities.INTSIDENDI_LIIK;
import ee.itcollege.team02.entities.INTSIDENT;
import ee.itcollege.team02.entities.ISIKU_SEADUS_INTSIDENDIS;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.KODAKONDSUS;
import ee.itcollege.team02.entities.OBJEKT;
import ee.itcollege.team02.entities.OBJEKT_INTSIDENDIS;
import ee.itcollege.team02.entities.PIIRILOIK;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;
import ee.itcollege.team02.entities.PIIRIVALVUR;
import ee.itcollege.team02.entities.PIIRIVALVUR_INTSIDENDIS;
import ee.itcollege.team02.entities.RIIK;
import ee.itcollege.team02.entities.SEADUS;
import ee.itcollege.team02.entities.SEADUSE_PUNKT;
import ee.itcollege.team02.entities.VAHTKOND;
import ee.itcollege.team02.entities.VAHTKOND_INTSIDENDIS;
import java.lang.String;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(new INTSIDENDI_LIIKConverter());
        registry.addConverter(new INTSIDENTConverter());
        registry.addConverter(new ISIKU_SEADUS_INTSIDENDISConverter());
        registry.addConverter(new ISIK_INTSIDENDISConverter());
        registry.addConverter(new KODAKONDSUSConverter());
        registry.addConverter(new OBJEKTConverter());
        registry.addConverter(new OBJEKT_INTSIDENDISConverter());
        registry.addConverter(new PIIRILOIKConverter());
        registry.addConverter(new PIIRIRIKKUJAConverter());
        registry.addConverter(new PIIRIVALVURConverter());
        registry.addConverter(new PIIRIVALVUR_INTSIDENDISConverter());
        registry.addConverter(new RIIKConverter());
        registry.addConverter(new SEADUSConverter());
        registry.addConverter(new SEADUSE_PUNKTConverter());
        registry.addConverter(new VAHTKONDConverter());
        registry.addConverter(new VAHTKOND_INTSIDENDISConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.INTSIDENDI_LIIKConverter implements Converter<INTSIDENDI_LIIK, String> {
        public String convert(INTSIDENDI_LIIK iNTSIDENDI_LIIK) {
            return new StringBuilder().append(iNTSIDENDI_LIIK.getAvaja()).append(" ").append(iNTSIDENDI_LIIK.getAvatud()).append(" ").append(iNTSIDENDI_LIIK.getMuutja()).append(" ").append(iNTSIDENDI_LIIK.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.INTSIDENTConverter implements Converter<INTSIDENT, String> {
        public String convert(INTSIDENT iNTSIDENT) {
            return new StringBuilder().append(iNTSIDENT.getAvaja()).append(" ").append(iNTSIDENT.getAvatud()).append(" ").append(iNTSIDENT.getMuutja()).append(" ").append(iNTSIDENT.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.ISIKU_SEADUS_INTSIDENDISConverter implements Converter<ISIKU_SEADUS_INTSIDENDIS, String> {
        public String convert(ISIKU_SEADUS_INTSIDENDIS iSIKU_SEADUS_INTSIDENDIS) {
            return new StringBuilder().append(iSIKU_SEADUS_INTSIDENDIS.getAvaja()).append(" ").append(iSIKU_SEADUS_INTSIDENDIS.getAvatud()).append(" ").append(iSIKU_SEADUS_INTSIDENDIS.getMuutja()).append(" ").append(iSIKU_SEADUS_INTSIDENDIS.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.ISIK_INTSIDENDISConverter implements Converter<ISIK_INTSIDENDIS, String> {
        public String convert(ISIK_INTSIDENDIS iSIK_INTSIDENDIS) {
            return new StringBuilder().append(iSIK_INTSIDENDIS.getAvaja()).append(" ").append(iSIK_INTSIDENDIS.getAvatud()).append(" ").append(iSIK_INTSIDENDIS.getMuutja()).append(" ").append(iSIK_INTSIDENDIS.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.KODAKONDSUSConverter implements Converter<KODAKONDSUS, String> {
        public String convert(KODAKONDSUS kODAKONDSUS) {
            return new StringBuilder().append(kODAKONDSUS.getAvaja()).append(" ").append(kODAKONDSUS.getAvatud()).append(" ").append(kODAKONDSUS.getMuutja()).append(" ").append(kODAKONDSUS.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.OBJEKTConverter implements Converter<OBJEKT, String> {
        public String convert(OBJEKT oBJEKT) {
            return new StringBuilder().append(oBJEKT.getAvaja()).append(" ").append(oBJEKT.getAvatud()).append(" ").append(oBJEKT.getMuutja()).append(" ").append(oBJEKT.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.OBJEKT_INTSIDENDISConverter implements Converter<OBJEKT_INTSIDENDIS, String> {
        public String convert(OBJEKT_INTSIDENDIS oBJEKT_INTSIDENDIS) {
            return new StringBuilder().append(oBJEKT_INTSIDENDIS.getAvaja()).append(" ").append(oBJEKT_INTSIDENDIS.getAvatud()).append(" ").append(oBJEKT_INTSIDENDIS.getMuutja()).append(" ").append(oBJEKT_INTSIDENDIS.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.PIIRILOIKConverter implements Converter<PIIRILOIK, String> {
        public String convert(PIIRILOIK pIIRILOIK) {
            return new StringBuilder().append(pIIRILOIK.getAvaja()).append(" ").append(pIIRILOIK.getAvatud()).append(" ").append(pIIRILOIK.getMuutja()).append(" ").append(pIIRILOIK.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.PIIRIRIKKUJAConverter implements Converter<PIIRIRIKKUJA, String> {
        public String convert(PIIRIRIKKUJA pIIRIRIKKUJA) {
            return new StringBuilder().append(pIIRIRIKKUJA.getAvaja()).append(" ").append(pIIRIRIKKUJA.getAvatud()).append(" ").append(pIIRIRIKKUJA.getMuutja()).append(" ").append(pIIRIRIKKUJA.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.PIIRIVALVURConverter implements Converter<PIIRIVALVUR, String> {
        public String convert(PIIRIVALVUR pIIRIVALVUR) {
            return new StringBuilder().append(pIIRIVALVUR.getAvaja()).append(" ").append(pIIRIVALVUR.getAvatud()).append(" ").append(pIIRIVALVUR.getMuutja()).append(" ").append(pIIRIVALVUR.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.PIIRIVALVUR_INTSIDENDISConverter implements Converter<PIIRIVALVUR_INTSIDENDIS, String> {
        public String convert(PIIRIVALVUR_INTSIDENDIS pIIRIVALVUR_INTSIDENDIS) {
            return new StringBuilder().append(pIIRIVALVUR_INTSIDENDIS.getAvaja()).append(" ").append(pIIRIVALVUR_INTSIDENDIS.getAvatud()).append(" ").append(pIIRIVALVUR_INTSIDENDIS.getMuutja()).append(" ").append(pIIRIVALVUR_INTSIDENDIS.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.RIIKConverter implements Converter<RIIK, String> {
        public String convert(RIIK rIIK) {
            return new StringBuilder().append(rIIK.getAvaja()).append(" ").append(rIIK.getAvatud()).append(" ").append(rIIK.getMuutja()).append(" ").append(rIIK.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.SEADUSConverter implements Converter<SEADUS, String> {
        public String convert(SEADUS sEADUS) {
            return new StringBuilder().append(sEADUS.getAvaja()).append(" ").append(sEADUS.getAvatud()).append(" ").append(sEADUS.getMuutja()).append(" ").append(sEADUS.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.SEADUSE_PUNKTConverter implements Converter<SEADUSE_PUNKT, String> {
        public String convert(SEADUSE_PUNKT sEADUSE_PUNKT) {
            return new StringBuilder().append(sEADUSE_PUNKT.getAvaja()).append(" ").append(sEADUSE_PUNKT.getAvatud()).append(" ").append(sEADUSE_PUNKT.getMuutja()).append(" ").append(sEADUSE_PUNKT.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.VAHTKONDConverter implements Converter<VAHTKOND, String> {
        public String convert(VAHTKOND vAHTKOND) {
            return new StringBuilder().append(vAHTKOND.getAvaja()).append(" ").append(vAHTKOND.getAvatud()).append(" ").append(vAHTKOND.getMuutja()).append(" ").append(vAHTKOND.getMuudetud()).toString();
        }
        
    }
    
    static class ee.itcollege.team02.web.ApplicationConversionServiceFactoryBean.VAHTKOND_INTSIDENDISConverter implements Converter<VAHTKOND_INTSIDENDIS, String> {
        public String convert(VAHTKOND_INTSIDENDIS vAHTKOND_INTSIDENDIS) {
            return new StringBuilder().append(vAHTKOND_INTSIDENDIS.getAvaja()).append(" ").append(vAHTKOND_INTSIDENDIS.getAvatud()).append(" ").append(vAHTKOND_INTSIDENDIS.getMuutja()).append(" ").append(vAHTKOND_INTSIDENDIS.getMuudetud()).toString();
        }
        
    }
    
}
