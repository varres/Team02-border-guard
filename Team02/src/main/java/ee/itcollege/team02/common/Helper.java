package ee.itcollege.team02.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import ee.itcollege.team02.entities.INTSIDENDI_LIIK;
import ee.itcollege.team02.entities.INTSIDENT;
import ee.itcollege.team02.entities.ISIKU_SEADUS_INTSIDENDIS;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.KODAKONDSUS;
import ee.itcollege.team02.entities.OBJEKT;
import ee.itcollege.team02.entities.PIIRILOIK;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;
import ee.itcollege.team02.entities.PIIRIVALVUR;
import ee.itcollege.team02.entities.RIIK;
import ee.itcollege.team02.entities.SEADUS;
import ee.itcollege.team02.entities.SEADUSE_PUNKT;
import ee.itcollege.team02.entities.VAHTKOND;
import ee.itcollege.team02.entities.VAHTKOND_INTSIDENDIS;

public class Helper {
	public static boolean IsSurrogateDate(Date date){
		SimpleDateFormat simpleDateformatYear = new SimpleDateFormat("yyyy");
		SimpleDateFormat simpleDateformatMonth = new SimpleDateFormat("MM");
		SimpleDateFormat simpleDateformatDay = new SimpleDateFormat("d");
		
		String year = simpleDateformatYear.format(date);
		String month = simpleDateformatMonth.format(date);
		String day = simpleDateformatDay.format(date);
		
		if(year.equals("9999") && month.equals("12") && day.equals("31")){
			return true;
		}else{
			return false;
		}
		
	}
	
	 public static void addAndmed() {
	    	
	    	///1 START
	    	INTSIDENDI_LIIK uusINTSIDENDI_LIIK = new INTSIDENDI_LIIK();
	    	
	    	uusINTSIDENDI_LIIK.setAvaja("Margus Mets");  
	    	uusINTSIDENDI_LIIK.setAvatud(new GregorianCalendar(2001, 02, 05, 00, 00).getTime());    
	    	  
	    	uusINTSIDENDI_LIIK.setMuutja("test2");
	    	uusINTSIDENDI_LIIK.setSuletud(new GregorianCalendar(9999, 12, 31, 00, 00).getTime());
	    	
	    	uusINTSIDENDI_LIIK.setSulgeja("test3");
	    	uusINTSIDENDI_LIIK.setMuudetud(new GregorianCalendar(9999, 12, 31, 00, 00).getTime());
	    	  	
	    	uusINTSIDENDI_LIIK.setKommentaar("Mittedeklareeritud reisijate/ainete üleveo üritus");
	    	uusINTSIDENDI_LIIK.setKood("38E");
	    	uusINTSIDENDI_LIIK.setNimetus("Salakaubavedu");   	
	    	///1 END
	    	
	    	
	    	///2 START
	    	INTSIDENDI_LIIK uusINTSIDENDI_LIIK1 = new INTSIDENDI_LIIK();
	    	
	    	uusINTSIDENDI_LIIK1.setAvaja("Heli Põld");
	    	uusINTSIDENDI_LIIK1.setAvatud(new GregorianCalendar(2000, 01, 02, 00, 00).getTime());
	    	
	    	uusINTSIDENDI_LIIK1.setMuutja("Kaido Maru");
	    	uusINTSIDENDI_LIIK1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	       	uusINTSIDENDI_LIIK1.setSulgeja("test3");
	    	uusINTSIDENDI_LIIK1.setMuudetud(new GregorianCalendar(2001, 04, 02, 12, 05).getTime());
	    	
	    	uusINTSIDENDI_LIIK1.setKommentaar("piiri ületamine vales kohas");
	    	uusINTSIDENDI_LIIK1.setKood("42A");
	    	uusINTSIDENDI_LIIK1.setNimetus("Piiri rikkumine");
	    	///2 END
	    	
	    	
	    	///2 START
	    	INTSIDENDI_LIIK uusINTSIDENDI_LIIK2 = new INTSIDENDI_LIIK();
	    	
	    	uusINTSIDENDI_LIIK2.setAvaja("Kaido Muru");
	    	uusINTSIDENDI_LIIK2.setAvatud(new GregorianCalendar(2002, 04, 07, 00, 00).getTime());
	    	
	    	uusINTSIDENDI_LIIK2.setMuutja("test2");
	    	uusINTSIDENDI_LIIK2.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	       	uusINTSIDENDI_LIIK2.setSulgeja("test3");
	    	uusINTSIDENDI_LIIK2.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusINTSIDENDI_LIIK2.setKommentaar("piirivalve ründamine relvaga/relvata");
	    	uusINTSIDENDI_LIIK2.setKood("42A");
	    	uusINTSIDENDI_LIIK2.setNimetus("Rünnak");
	    	///2 END
	    	
	    	/// 3 START
	    	RIIK uusRIIK = new RIIK();
	    	
	    	uusRIIK.setAvaja("Merli Maja");
	    	uusRIIK.setAvatud(new GregorianCalendar(2006, 02, 05, 00, 00).getTime());
	    	
	    	uusRIIK.setMuutja("test2");
	    	uusRIIK.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusRIIK.setSulgeja("test3");
	    	uusRIIK.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	uusRIIK.setISO_kood("ISO-8859-5");
	    	uusRIIK.setANSI_kood("IBM855");
	    	/// 3 END
	    	
	    	
	    	/// 4 START
	    	RIIK uusRIIK1 = new RIIK();
	    	
	    	uusRIIK1.setAvaja("Marli Kaja");
	    	uusRIIK1.setAvatud(new GregorianCalendar(2006, 04, 05, 00, 00).getTime());
	    	
	    	uusRIIK1.setMuutja("test2");
	    	uusRIIK1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusRIIK1.setSulgeja("test3");
	    	uusRIIK1.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	uusRIIK1.setISO_kood("ISO 3166-2");
	    	uusRIIK1.setANSI_kood("IA5 Swedish");
	    	/// 4 END
	    	
	    	

	    	/// 5 START  	
	    	OBJEKT uusOBJEKT = new OBJEKT();
	    	
	    	uusOBJEKT.setAvaja("Merli Maja");
	    	uusOBJEKT.setAvatud(new GregorianCalendar(2006, 02, 05, 00, 00).getTime());
	    	
	    	uusOBJEKT.setMuutja("test2");
	    	uusOBJEKT.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusOBJEKT.setSulgeja("test3");
	    	uusOBJEKT.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusOBJEKT.setNimetus("Küün");
	    	/// 5 END
	    	
	    	
	    	///6 START
	    	PIIRIRIKKUJA uusPIIRIRIKKUJA = new PIIRIRIKKUJA();
	    	
	    	uusPIIRIRIKKUJA.setAvaja("Merli Maja");
	    	uusPIIRIRIKKUJA.setAvatud(new GregorianCalendar(2006, 02, 05, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA.setMuutja("test2");
	    	uusPIIRIRIKKUJA.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA.setSulgeja("test3");
	    	uusPIIRIRIKKUJA.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA.setEesnimi("Fedja");   	
	    	uusPIIRIRIKKUJA.setObjekt(uusOBJEKT); //SEOS!
	    	uusPIIRIRIKKUJA.setPerek_nimi("Kuzmin");
	    	uusPIIRIRIKKUJA.setSugu("M");
	    	uusPIIRIRIKKUJA.setIsikukood("M327232372");
	    	uusPIIRIRIKKUJA.setSynniaeg(new GregorianCalendar(1926, 04, 05, 00, 00).getTime());
	    	///6 END
	    	
	    	///6 START
	    	PIIRIRIKKUJA uusPIIRIRIKKUJA1 = new PIIRIRIKKUJA();
	    	
	    	uusPIIRIRIKKUJA1.setAvaja("Signe Savi");
	    	uusPIIRIRIKKUJA1.setAvatud(new GregorianCalendar(2007, 02, 05, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA1.setMuutja("test2");
	    	uusPIIRIRIKKUJA1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA1.setSulgeja("test3");
	    	uusPIIRIRIKKUJA1.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA1.setEesnimi("AKE");   	
	    	uusPIIRIRIKKUJA1.setObjekt(uusOBJEKT); //SEOS!
	    	uusPIIRIRIKKUJA1.setPerek_nimi("HAMMSTRJOM");
	    	uusPIIRIRIKKUJA1.setSugu("M");
	    	uusPIIRIRIKKUJA1.setIsikukood("SW2300003");
	    	uusPIIRIRIKKUJA1.setSynniaeg(new GregorianCalendar(1976, 04, 05, 00, 00).getTime());
	    	///6 END
	    	
	    	///6 START
	    	PIIRIRIKKUJA uusPIIRIRIKKUJA2 = new PIIRIRIKKUJA();
	    	
	    	uusPIIRIRIKKUJA2.setAvaja("Kim Tame");
	    	uusPIIRIRIKKUJA2.setAvatud(new GregorianCalendar(2006, 02, 05, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA2.setMuutja("test2");
	    	uusPIIRIRIKKUJA2.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA2.setSulgeja("test3");
	    	uusPIIRIRIKKUJA2.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIRIKKUJA2.setEesnimi("Parmo");   	
	    	uusPIIRIRIKKUJA2.setObjekt(uusOBJEKT); //SEOS!
	    	uusPIIRIRIKKUJA2.setPerek_nimi("Muhvilainen");
	    	uusPIIRIRIKKUJA2.setSugu("M");
	    	uusPIIRIRIKKUJA2.setIsikukood("778800230");
	    	uusPIIRIRIKKUJA2.setSynniaeg(new GregorianCalendar(1944, 02, 02, 00, 00).getTime());
	    	///6 END
	    	


	    	/// 7 START
	    	KODAKONDSUS uusKODAKONDSUS = new KODAKONDSUS ();
	    	
	    	uusKODAKONDSUS.setAvaja("Kaido Muru");
	    	uusKODAKONDSUS.setAvatud(new GregorianCalendar(2002, 04, 07, 00, 00).getTime());
	    	
	    	uusKODAKONDSUS.setMuutja("test2");
	    	uusKODAKONDSUS.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	       	uusKODAKONDSUS.setSulgeja("test3");
	    	uusKODAKONDSUS.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusKODAKONDSUS.setPiiririkkuja(uusPIIRIRIKKUJA);  //SEOS!
	    	uusKODAKONDSUS.setIsikukood("327232372");
	    	
	    	uusKODAKONDSUS.setAlates(new GregorianCalendar(1950, 01, 01, 00, 00).getTime());
	    	uusKODAKONDSUS.setKuni(new GregorianCalendar(2020, 01, 01, 00, 00).getTime());
	    	//SEOS!
	    	uusKODAKONDSUS.setRiik(uusRIIK1);
	    	/// 7 END
	    	
	    	
	    	///8 START
	    	PIIRILOIK uusPIIRILOIK1 = new PIIRILOIK();
	    	
	    	uusPIIRILOIK1.setAvaja("Margus Mets"); 
	    	uusPIIRILOIK1.setAvatud(new GregorianCalendar(2001, 02, 05, 00, 00).getTime());
	    	  	
	    	uusPIIRILOIK1.setMuutja("test2");
	    	uusPIIRILOIK1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRILOIK1.setSulgeja("test3");
	    	uusPIIRILOIK1.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	   	
	    	uusPIIRILOIK1.setNimetus("Narva Raba");
	    	uusPIIRILOIK1.setGPS_koordinaadid("22 long 11 lat");
	    	uusPIIRILOIK1.setKommentaar("Suur soo ja raba");
	    	uusPIIRILOIK1.setKood("Narva 1A");
	    	///8 END
	    	
	    	
	    	///8 START
	    	PIIRILOIK uusPIIRILOIK2 = new PIIRILOIK();
	    	
	    	uusPIIRILOIK2.setAvaja("Siim Sikk"); 
	    	uusPIIRILOIK2.setAvatud(new GregorianCalendar(2001, 02, 05, 00, 00).getTime());
	    	  	
	    	uusPIIRILOIK2.setMuutja("test2");
	    	uusPIIRILOIK2.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRILOIK2.setSulgeja("test3");
	    	uusPIIRILOIK2.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	   	
	    	uusPIIRILOIK2.setNimetus("Peipsi järv");
	    	uusPIIRILOIK2.setGPS_koordinaadid("31 long 48 lat");
	    	uusPIIRILOIK2.setKommentaar("Suur veekogu");
	    	uusPIIRILOIK2.setKood("Peipsi 1A");
	    	///8 END
	    	
	    	
	    	///8 START
	    	PIIRILOIK uusPIIRILOIK3 = new PIIRILOIK();
	    	
	    	uusPIIRILOIK3.setAvaja("Reimo Mudilane"); 
	    	uusPIIRILOIK3.setAvatud(new GregorianCalendar(2001, 02, 05, 00, 00).getTime());
	    	  	
	    	uusPIIRILOIK3.setMuutja("test2");
	    	uusPIIRILOIK3.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRILOIK3.setSulgeja("test3");
	    	uusPIIRILOIK3.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	   	
	    	uusPIIRILOIK3.setNimetus("Narva tee");
	    	uusPIIRILOIK3.setGPS_koordinaadid("37 long 47 lat");
	    	uusPIIRILOIK3.setKommentaar("Suur tee, järjekorrad");
	    	uusPIIRILOIK3.setKood("Narva 2A");
	    	///8 END
	    	
	    	///8 START
	    	PIIRILOIK uusPIIRILOIK4 = new PIIRILOIK();
	    	
	    	uusPIIRILOIK4.setAvaja("Ilmar Jänes"); 
	    	uusPIIRILOIK4.setAvatud(new GregorianCalendar(2001, 02, 05, 00, 00).getTime());
	    	  	
	    	uusPIIRILOIK4.setMuutja("test2");
	    	uusPIIRILOIK4.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRILOIK4.setSulgeja("test3");
	    	uusPIIRILOIK4.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	   	
	    	uusPIIRILOIK4.setNimetus("Võru mets");
	    	uusPIIRILOIK4.setGPS_koordinaadid("66 long 17 lat");
	    	uusPIIRILOIK4.setKommentaar("Palju jäneseid");
	    	uusPIIRILOIK4.setKood("Võru 1");
	    	///8 END
	    	
	    	
	    	
	    	///9 START
	    	INTSIDENT newIntsident1 = new INTSIDENT();
	    	
	    	newIntsident1.setAvaja("Kaido Kivi"); 
	    	newIntsident1.setAvatud(new GregorianCalendar(2002, 07, 07, 10, 00).getTime());
	    	  	
	    	newIntsident1.setMuutja("test2");
	    	newIntsident1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	newIntsident1.setSulgeja("test3");
	    	newIntsident1.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	
	    	newIntsident1.setKood("A12-S-2");
	    	newIntsident1.setIntsidendi_liik(uusINTSIDENDI_LIIK2);     	//SEOS!
	    	newIntsident1.setPiiriloik(uusPIIRILOIK2);    	//SEOS!
	    	newIntsident1.setNimetus("Tuuker tuli veest");
	    	newIntsident1.setGPS_latituud(13.32);
	    	newIntsident1.setGPS_longituud(99.77);
	    	
	    	newIntsident1.setToimumise_algus(new GregorianCalendar(2002, 05, 05, 21, 00).getTime());
	    	newIntsident1.setToimumise_lopp(new GregorianCalendar(2002, 05, 06, 1, 55).getTime());
	    	
	    	
	    	newIntsident1.setKirjeldus("Hirmus oli");
	    	newIntsident1.setKommentaar("Tuuker pääses minema");;    	
	    	///9 END
	    	
	    	///9 START
	    	INTSIDENT newIntsident2 = new INTSIDENT();
	    	
	    	newIntsident2.setAvaja("Paavo Sammal"); 
	    	newIntsident2.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	newIntsident2.setMuutja("test2");
	    	newIntsident2.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	newIntsident2.setSulgeja("test3");
	    	newIntsident2.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	
	    	newIntsident2.setKood("F15-N-2");
	    	newIntsident2.setIntsidendi_liik(uusINTSIDENDI_LIIK);     	//SEOS!
	    	newIntsident2.setPiiriloik(uusPIIRILOIK3);    	//SEOS!
	    	newIntsident2.setNimetus("Mäger lasi puusse");
	    	newIntsident2.setGPS_latituud(42.32);
	    	newIntsident2.setGPS_longituud(32.77);
	    	
	    	newIntsident2.setToimumise_algus(new GregorianCalendar(2004, 05, 05, 21, 00).getTime());
	    	newIntsident2.setToimumise_lopp(new GregorianCalendar(2004, 05, 05, 21, 15).getTime());
	    	
	    	
	    	newIntsident2.setKirjeldus("Mägra värk");
	    	newIntsident2.setKommentaar("Mäger mängis mäkra");;    	
	    	///9 END
	    	
	    	///9 START
	    	INTSIDENT newIntsident3 = new INTSIDENT();
	    	
	    	newIntsident3.setAvaja("Kaido Kivi"); 
	    	newIntsident3.setAvatud(new GregorianCalendar(2010, 01, 01, 30, 00).getTime());
	    	  	
	    	newIntsident3.setMuutja("test2");
	    	newIntsident3.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	newIntsident3.setSulgeja("test3");
	    	newIntsident3.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	
	    	newIntsident3.setKood("P32-S-6");
	    	newIntsident3.setIntsidendi_liik(uusINTSIDENDI_LIIK2);     	//SEOS!
	    	newIntsident3.setPiiriloik(uusPIIRILOIK4);    	//SEOS!
	    	newIntsident3.setNimetus("Kohtumine setoga");
	    	newIntsident3.setGPS_latituud(69.12);
	    	newIntsident3.setGPS_longituud(27.08);
	    	
	    	newIntsident3.setToimumise_algus(new GregorianCalendar(2009, 06, 02, 21, 00).getTime());
	    	newIntsident3.setToimumise_lopp(new GregorianCalendar(2009, 06, 02, 21, 15).getTime());
	    	
	    	
	    	newIntsident3.setKirjeldus("Väga kohutav oli");
	    	newIntsident3.setKommentaar("Seto laulis terve tee");;    	
	    	///9 END
	    	
	    	///9 START
	    	INTSIDENT newIntsident4 = new INTSIDENT();
	    	
	    	newIntsident4.setAvaja("Anne Samakas"); 
	    	newIntsident4.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	newIntsident4.setMuutja("Kuiv Pohlik");
	    	newIntsident4.setSuletud(new GregorianCalendar(2004, 06, 06, 12, 30).getTime());
	    	
	    	newIntsident4.setSulgeja("Anne Samakas");
	    	newIntsident4.setMuudetud(new GregorianCalendar(2004, 06, 06, 12, 50).getTime());
	    	
	    	
	    	newIntsident4.setKood("R2-D2");
	    	newIntsident4.setIntsidendi_liik(uusINTSIDENDI_LIIK);     	//SEOS!
	    	newIntsident4.setPiiriloik(uusPIIRILOIK3);    	//SEOS!
	    	newIntsident4.setNimetus("Salaviina smugeldamine");
	    	newIntsident4.setGPS_latituud(08.19);
	    	newIntsident4.setGPS_longituud(43.22);
	    	
	    	newIntsident4.setToimumise_algus(new GregorianCalendar(2003, 02, 04, 11, 10).getTime());
	    	newIntsident4.setToimumise_lopp(new GregorianCalendar(2003, 02, 04, 11, 25).getTime());
	    	
	    	
	    	newIntsident4.setKirjeldus("Tore oli");
	    	newIntsident4.setKommentaar("Jõime ära");;    	
	    	///9 END
	    	
	    	///9 START
	    	INTSIDENT newIntsident5 = new INTSIDENT();
	    	
	    	newIntsident5.setAvaja("Voldemar Must"); 
	    	newIntsident5.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	newIntsident5.setMuutja("test2");
	    	newIntsident5.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	newIntsident5.setSulgeja("test3");
	    	newIntsident5.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	
	    	newIntsident5.setKood("B10-10-1");
	    	newIntsident5.setIntsidendi_liik(uusINTSIDENDI_LIIK);     	//SEOS!
	    	newIntsident5.setPiiriloik(uusPIIRILOIK3);    	//SEOS!
	    	newIntsident5.setNimetus("Salasuitsu juhtum");
	    	newIntsident5.setGPS_latituud(22.32);
	    	newIntsident5.setGPS_longituud(42.23);
	    	
	    	newIntsident5.setToimumise_algus(new GregorianCalendar(2010, 01, 02, 13, 30).getTime());
	    	newIntsident5.setToimumise_lopp(new GregorianCalendar(2010, 01, 03, 13, 38).getTime());
	    	
	    	
	    	newIntsident5.setKirjeldus("Ei olnudki salasigaretid");
	    	newIntsident5.setKommentaar("Piinlik lugu oli");;    	
	    	///9 END
	    	
	    	///9 START
	    	INTSIDENT newIntsident6 = new INTSIDENT();
	    	
	    	newIntsident6.setAvaja("Marko Mägi"); 
	    	newIntsident6.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	newIntsident6.setMuutja("test2");
	    	newIntsident6.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	newIntsident6.setSulgeja("test3");
	    	newIntsident6.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	
	    	newIntsident6.setKood("U-96-2");
	    	newIntsident6.setIntsidendi_liik(uusINTSIDENDI_LIIK2);     	//SEOS!
	    	newIntsident6.setPiiriloik(uusPIIRILOIK3);    	//SEOS!
	    	newIntsident6.setNimetus("Kohtumine allveelaevaga");
	    	newIntsident6.setGPS_latituud(02.02);
	    	newIntsident6.setGPS_longituud(02.70);
	    	
	    	newIntsident6.setToimumise_algus(new GregorianCalendar(2006, 03, 03, 18, 00).getTime());
	    	newIntsident6.setToimumise_lopp(new GregorianCalendar(2006, 04, 02, 16, 25).getTime());
	    	
	    	
	    	newIntsident6.setKirjeldus("Tore oli");
	    	newIntsident6.setKommentaar("Lasime põhja");;    	
	    	///9 END
	    	
	    	///9 START
	    	INTSIDENT newIntsident7 = new INTSIDENT();
	    	
	    	newIntsident7.setAvaja("Kaido Sammalselg"); 
	    	newIntsident7.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	newIntsident7.setMuutja("test2");
	    	newIntsident7.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	newIntsident7.setSulgeja("test3");
	    	newIntsident7.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	
	    	newIntsident7.setKood("PPP-1-5");
	    	newIntsident7.setIntsidendi_liik(uusINTSIDENDI_LIIK2);     	//SEOS!
	    	newIntsident7.setPiiriloik(uusPIIRILOIK2);    	//SEOS!
	    	newIntsident7.setNimetus("Hai ründas");
	    	newIntsident7.setGPS_latituud(10.32);
	    	newIntsident7.setGPS_longituud(22.77);
	    	
	    	newIntsident7.setToimumise_algus(new GregorianCalendar(2005, 03, 01, 12, 00).getTime());
	    	newIntsident7.setToimumise_lopp(new GregorianCalendar(2005, 04, 02, 12, 25).getTime());
	    	
	    	
	    	newIntsident7.setKirjeldus("Hai hammustas mitu korda");
	    	newIntsident7.setKommentaar("Valus oli");;    	
	    	///9 END
	    	
	    	
	    	///10 START
	    	SEADUS uusSEADUS = new SEADUS();
	    	
	    	uusSEADUS.setAvaja("Margus Meri"); 
	    	uusSEADUS.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	uusSEADUS.setMuutja("test2");
	    	uusSEADUS.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUS.setSulgeja("test3");
	    	uusSEADUS.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUS.setKood("BFG");
	    	uusSEADUS.setKehtiv_alates("12.10.2003");
	    	uusSEADUS.setKehtiv_kuni("4.3.2024");
	    	uusSEADUS.setNimetus("Relvaseadus");
	    	uusSEADUS.setKommentaar("sõita saab tankiga");
	    	///10 END
	    	
	    	
	    	///11 START
	    	SEADUS uusSEADUS1 = new SEADUS();
	    	
	    	uusSEADUS1.setAvaja("Vilja Põld"); 
	    	uusSEADUS1.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	uusSEADUS1.setMuutja("test2");
	    	uusSEADUS1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUS1.setSulgeja("test3");
	    	uusSEADUS1.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUS1.setKood("DND");
	    	uusSEADUS1.setKehtiv_alates("1.1.2002");
	    	uusSEADUS1.setKehtiv_kuni("2.3.2017");   	
	    	uusSEADUS1.setNimetus("Piiriseadus");
	    	uusSEADUS1.setKommentaar("Piiri kontrollivärk");
	    	///11 END
	    	
	    	
	    	///11 START
	    	SEADUS uusSEADUS2 = new SEADUS();
	    	
	    	uusSEADUS2.setAvaja("Marja Väli"); 
	    	uusSEADUS2.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	uusSEADUS2.setMuutja("test2");
	    	uusSEADUS2.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUS2.setSulgeja("test3");
	    	uusSEADUS2.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUS2.setKood("MRR");
	    	uusSEADUS2.setKehtiv_alates("2.7.2001");
	    	uusSEADUS2.setKehtiv_kuni("5.3.2045");
	    	
	    	uusSEADUS2.setNimetus("Looduskaitseseadus");
	    	uusSEADUS2.setKommentaar("Loomi kaitsta");
	    	
	    	///11 END
	    	
	    	///12 START
	    	SEADUSE_PUNKT uusSEADUSE_PUNKT = new SEADUSE_PUNKT();
	    	uusSEADUSE_PUNKT.setAvaja("Külli Li Käru"); 
	    	uusSEADUSE_PUNKT.setAvatud(new GregorianCalendar(2010, 04, 06, 10, 00).getTime());
	    	  	
	    	uusSEADUSE_PUNKT.setMuutja("test2");
	    	uusSEADUSE_PUNKT.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUSE_PUNKT.setSulgeja("test3");
	    	uusSEADUSE_PUNKT.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	uusSEADUSE_PUNKT.setKehtiv_alates("2.7.2001");
	    	uusSEADUSE_PUNKT.setKehtiv_kuni("5.3.2045");
	    	uusSEADUSE_PUNKT.setPais("4.3");
	    	uusSEADUSE_PUNKT.setParagrahv("4");
	    	uusSEADUSE_PUNKT.setSeadus(uusSEADUS2); //SEOS! 
	    	uusSEADUSE_PUNKT.setYlemus_seaduse_punkt(uusSEADUS); //SEOS! 
	    	uusSEADUSE_PUNKT.setKommentaar("Põtra ei tohi lasta");
	    	uusSEADUSE_PUNKT.setTekst("Põdrad on lahedad");
	    	///12 END
	    	
	    	///13 START
	    	SEADUSE_PUNKT uusSEADUSE_PUNKT2 = new SEADUSE_PUNKT();
	    	uusSEADUSE_PUNKT2.setAvaja("Kesse Siim Käib"); 
	    	uusSEADUSE_PUNKT2.setAvatud(new GregorianCalendar(2010, 04, 06, 10, 00).getTime());
	    	  	
	    	uusSEADUSE_PUNKT2.setMuutja("test2");
	    	uusSEADUSE_PUNKT2.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUSE_PUNKT2.setSulgeja("test3");
	    	uusSEADUSE_PUNKT2.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	uusSEADUSE_PUNKT2.setKehtiv_alates("2.7.1921");
	    	uusSEADUSE_PUNKT2.setKehtiv_kuni("5.3.2045");
	    	uusSEADUSE_PUNKT2.setPais("2.3");
	    	uusSEADUSE_PUNKT2.setParagrahv("5");
	    	uusSEADUSE_PUNKT2.setSeadus(uusSEADUS2); //SEOS! 
	    	uusSEADUSE_PUNKT2.setYlemus_seaduse_punkt(uusSEADUS); //SEOS! 
	    	uusSEADUSE_PUNKT2.setKommentaar("Karu ei tohi lasta");
	    	uusSEADUSE_PUNKT2.setTekst("Karud ka lahedad");
	    	///13 END
	    	
	    	///14 START
	    	SEADUSE_PUNKT uusSEADUSE_PUNKT3 = new SEADUSE_PUNKT();
	    	uusSEADUSE_PUNKT3.setAvaja("Kusti Põlev"); 
	    	uusSEADUSE_PUNKT3.setAvatud(new GregorianCalendar(2010, 04, 06, 10, 00).getTime());
	    	  	
	    	uusSEADUSE_PUNKT3.setMuutja("test2");
	    	uusSEADUSE_PUNKT3.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusSEADUSE_PUNKT3.setSulgeja("test3");
	    	uusSEADUSE_PUNKT3.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	uusSEADUSE_PUNKT3.setKehtiv_alates("1.1.1935");
	    	uusSEADUSE_PUNKT3.setKehtiv_kuni("4.12.2025");
	    	uusSEADUSE_PUNKT3.setPais("6.3");
	    	uusSEADUSE_PUNKT3.setParagrahv("7");
	    	uusSEADUSE_PUNKT3.setSeadus(uusSEADUS1); //SEOS! 
	    	uusSEADUSE_PUNKT3.setYlemus_seaduse_punkt(uusSEADUS); //SEOS! 
	    	uusSEADUSE_PUNKT3.setKommentaar("Relvaga ei tohi");
	    	uusSEADUSE_PUNKT3.setTekst("Relvata ka ei tohi");
	    	///14 END
	    	
	    	
	    	///15 START
	    	PIIRIVALVUR uusPIIRIVALVUR = new PIIRIVALVUR();
	    	uusPIIRIVALVUR.setAvaja("Koju Keri"); 
	    	uusPIIRIVALVUR.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	uusPIIRIVALVUR.setMuutja("test2");
	    	uusPIIRIVALVUR.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIVALVUR.setSulgeja("test3");
	    	uusPIIRIVALVUR.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIVALVUR.setEesnimed("Karl Kusti");
	    	uusPIIRIVALVUR.setIsikukood("37603046765");
	    	uusPIIRIVALVUR.setKommentaar("Kusti on väga tulbli olnud");
	    	uusPIIRIVALVUR.setPerekonnanimi("Väljataga");
	    	uusPIIRIVALVUR.setSoduri_kood("11001100");
	    	uusPIIRIVALVUR.setSugu("M");
	    	///15 END
	    	
	    	
	    	///16 START
	    	PIIRIVALVUR uusPIIRIVALVUR2 = new PIIRIVALVUR();
	    	uusPIIRIVALVUR2.setAvaja("Signe Laut"); 
	    	uusPIIRIVALVUR2.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	uusPIIRIVALVUR2.setMuutja("test2");
	    	uusPIIRIVALVUR2.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIVALVUR2.setSulgeja("test3");
	    	uusPIIRIVALVUR2.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIVALVUR2.setEesnimed("Voldemart");
	    	uusPIIRIVALVUR2.setIsikukood("37204041112");
	    	uusPIIRIVALVUR2.setKommentaar("ei oska piiri pidada");
	    	uusPIIRIVALVUR2.setPerekonnanimi("Must");
	    	uusPIIRIVALVUR2.setSoduri_kood("11001102");
	    	uusPIIRIVALVUR2.setSugu("M");
	    	///16 END
	    	
	    	
	    	///17 START
	    	PIIRIVALVUR uusPIIRIVALVUR3 = new PIIRIVALVUR();
	    	uusPIIRIVALVUR3.setAvaja("Margus Mägi"); 
	    	uusPIIRIVALVUR3.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	uusPIIRIVALVUR3.setMuutja("test2");
	    	uusPIIRIVALVUR3.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIVALVUR3.setSulgeja("test3");
	    	uusPIIRIVALVUR3.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusPIIRIVALVUR3.setEesnimed("Mihkel");
	    	uusPIIRIVALVUR3.setIsikukood("39102124461");
	    	uusPIIRIVALVUR3.setKommentaar("Mihkel oskab lasta");
	    	uusPIIRIVALVUR3.setPerekonnanimi("Laud");
	    	uusPIIRIVALVUR3.setSoduri_kood("11001422");
	    	uusPIIRIVALVUR3.setSugu("M");
	    	///17 END
	    	
	    	
	    	///18 START
	    	VAHTKOND uusVAHTKOND = new VAHTKOND();
	    	uusVAHTKOND.setAvaja("Margus Mägi"); 
	    	uusVAHTKOND.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	  	
	    	uusVAHTKOND.setMuutja("Mihkel Soo");
	    	uusVAHTKOND.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusVAHTKOND.setSulgeja("test3");
	    	uusVAHTKOND.setMuudetud(new GregorianCalendar(2006, 04, 07, 00, 00).getTime());
	    	uusVAHTKOND.setKommentaar("Vihased vennad");
	    	uusVAHTKOND.setKood("ZZBBZZ");
	    	uusVAHTKOND.setAlates(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	uusVAHTKOND.setKuni(new GregorianCalendar(2012, 05, 06, 10, 00).getTime());
	    	uusVAHTKOND.setNimetus("Jäärgibrigaad");
	    	///18 END
	    	
	    	
	    	///19 START
	    	VAHTKOND uusVAHTKOND1 = new VAHTKOND();
	    	uusVAHTKOND1.setAvaja("Siim Sammal"); 
	    	uusVAHTKOND1.setAvatud(new GregorianCalendar(2007, 02, 04, 12, 00).getTime());
	    	  	
	    	uusVAHTKOND1.setMuutja("Vildeku Valdeku");
	    	uusVAHTKOND1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusVAHTKOND1.setSulgeja("test3");
	    	uusVAHTKOND1.setMuudetud(new GregorianCalendar(2008, 01, 01, 20, 00).getTime());
	    	uusVAHTKOND1.setKommentaar("Vajab lisamehi");
	    	uusVAHTKOND1.setKood("T82KILL");
	    	uusVAHTKOND1.setAlates(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	uusVAHTKOND1.setKuni(new GregorianCalendar(2012, 05, 06, 10, 00).getTime());
	    	uusVAHTKOND1.setNimetus("Tankipatrull");
	    	///19 END
	    	
	    	
	    	///20 START
	    	VAHTKOND_INTSIDENDIS uusVAHTKOND_INTSIDENDIS = new VAHTKOND_INTSIDENDIS();
	    	
	    	uusVAHTKOND_INTSIDENDIS.setAvaja("Rasmus Tuvike"); 
	    	uusVAHTKOND_INTSIDENDIS.setAvatud(new GregorianCalendar(2008, 03, 05, 12, 00).getTime());
	    	  	
	    	uusVAHTKOND_INTSIDENDIS.setMuutja("Metsik Sammalhabe");
	    	uusVAHTKOND_INTSIDENDIS.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS.setSulgeja("test3");
	    	uusVAHTKOND_INTSIDENDIS.setMuudetud(new GregorianCalendar(2009, 04, 04, 20, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS.setIntsident(newIntsident1); //SEOS
	    	uusVAHTKOND_INTSIDENDIS.setAlates(new GregorianCalendar(2010, 03, 03, 20, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS.setKirjeldus("Kõik olid väga vaprad");
	    	uusVAHTKOND_INTSIDENDIS.setKuni(new GregorianCalendar(2011, 03, 03, 20, 00).getTime());
	    	///20 END
	    	
	    	///21 START
	    	VAHTKOND_INTSIDENDIS uusVAHTKOND_INTSIDENDIS1 = new VAHTKOND_INTSIDENDIS();
	    	
	    	uusVAHTKOND_INTSIDENDIS1.setAvaja("Riivo Mägine"); 
	    	uusVAHTKOND_INTSIDENDIS1.setAvatud(new GregorianCalendar(2002, 01, 01, 9, 37).getTime());
	    	  	
	    	uusVAHTKOND_INTSIDENDIS1.setMuutja("Hannes Pooltoob");
	    	uusVAHTKOND_INTSIDENDIS1.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS1.setSulgeja("test3");
	    	uusVAHTKOND_INTSIDENDIS1.setMuudetud(new GregorianCalendar(2002, 04, 04, 20, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS1.setIntsident(newIntsident4); //SEOS
	    	uusVAHTKOND_INTSIDENDIS1.setAlates(new GregorianCalendar(2010, 03, 03, 20, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS1.setKirjeldus("Kus, mis, kes?");
	    	uusVAHTKOND_INTSIDENDIS1.setKuni(new GregorianCalendar(2011, 03, 03, 20, 00).getTime());
	    	///21 END
	    	
	    	///22 START
	    	VAHTKOND_INTSIDENDIS uusVAHTKOND_INTSIDENDIS2 = new VAHTKOND_INTSIDENDIS();
	    	
	    	uusVAHTKOND_INTSIDENDIS2.setAvaja("Siim Kuupea"); 
	    	uusVAHTKOND_INTSIDENDIS2.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusVAHTKOND_INTSIDENDIS2.setMuutja("Merit Merkel");
	    	uusVAHTKOND_INTSIDENDIS2.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS2.setSulgeja("test3");
	    	uusVAHTKOND_INTSIDENDIS2.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS2.setIntsident(newIntsident2); //SEOS
	    	uusVAHTKOND_INTSIDENDIS2.setAlates(new GregorianCalendar(2010, 03, 03, 20, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS2.setKirjeldus("Relvad ei töödanud");
	    	uusVAHTKOND_INTSIDENDIS2.setKuni(new GregorianCalendar(2011, 03, 03, 20, 00).getTime());
	    	///22 END
	    	
	    	
	    	//23 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS = new ISIK_INTSIDENDIS();
	    	
	    	uusISIK_INTSIDENDIS.setAvaja("Maili Murakas"); 
	    	uusISIK_INTSIDENDIS.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusISIK_INTSIDENDIS.setMuutja("Jaan Kork");
	    	uusISIK_INTSIDENDIS.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIK_INTSIDENDIS.setSulgeja("test3");
	    	uusISIK_INTSIDENDIS.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusISIK_INTSIDENDIS.setIntsident(newIntsident1); // SEOS
	    	uusISIK_INTSIDENDIS.setKirjeldus("Tuuker võitis");
	    	uusISIK_INTSIDENDIS.setPiiririkkuja(uusPIIRIRIKKUJA1); //SEOS
	    	uusISIK_INTSIDENDIS.setAlates(new GregorianCalendar(2010, 03, 03, 5, 00).getTime());
	    	uusISIK_INTSIDENDIS.setKuni(new GregorianCalendar(2011, 02, 02, 12, 00).getTime());
	    	uusISIK_INTSIDENDIS.setKommentaar("Tuleb allveelaev muretseda");
	    	//23 END
	    	
	    	
	    	//24 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS1 = new ISIK_INTSIDENDIS();
	    	
	    	uusISIK_INTSIDENDIS1.setAvaja("Siimo Suurjärv"); 
	    	uusISIK_INTSIDENDIS1.setAvatud(new GregorianCalendar(2001, 04, 05, 9, 37).getTime());
	    	  	
	    	uusISIK_INTSIDENDIS1.setMuutja("Raido Külm");
	    	uusISIK_INTSIDENDIS1.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIK_INTSIDENDIS1.setSulgeja("test3");
	    	uusISIK_INTSIDENDIS1.setMuudetud(new GregorianCalendar(2002, 02, 03, 12, 30).getTime());
	    	
	    	uusISIK_INTSIDENDIS1.setIntsident(newIntsident3); // SEOS
	    	uusISIK_INTSIDENDIS1.setKirjeldus("Laulsid koos");
	    	uusISIK_INTSIDENDIS1.setPiiririkkuja(uusPIIRIRIKKUJA2); //SEOS
	    	uusISIK_INTSIDENDIS1.setAlates(new GregorianCalendar(2010, 03, 03, 5, 00).getTime());
	    	uusISIK_INTSIDENDIS1.setKuni(new GregorianCalendar(2011, 02, 02, 12, 00).getTime());
	    	uusISIK_INTSIDENDIS1.setKommentaar("Tuleb laulma õpetada");
	    	//24 END
	    	
	    	//25 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS2 = new ISIK_INTSIDENDIS();
	    	
	    	uusISIK_INTSIDENDIS2.setAvaja("Riho Rõõm"); 
	    	uusISIK_INTSIDENDIS2.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusISIK_INTSIDENDIS2.setMuutja("Kerli Piim");
	    	uusISIK_INTSIDENDIS2.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIK_INTSIDENDIS2.setSulgeja("test3");
	    	uusISIK_INTSIDENDIS2.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusISIK_INTSIDENDIS2.setIntsident(newIntsident4); // SEOS
	    	uusISIK_INTSIDENDIS2.setKirjeldus("Jälle ta oma salaviinaga");
	    	uusISIK_INTSIDENDIS2.setPiiririkkuja(uusPIIRIRIKKUJA1); //SEOS
	    	uusISIK_INTSIDENDIS2.setAlates(new GregorianCalendar(2009, 03, 03, 5, 00).getTime());
	    	uusISIK_INTSIDENDIS2.setKuni(new GregorianCalendar(2009, 03, 03, 12, 00).getTime());
	    	uusISIK_INTSIDENDIS2.setKommentaar("Saime ta õnneks kätte. *HIC*!");
	    	//25 END
	    	
	    	//26 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS3 = new ISIK_INTSIDENDIS();
	    	
	    	uusISIK_INTSIDENDIS3.setAvaja("Rando Maru"); 
	    	uusISIK_INTSIDENDIS3.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusISIK_INTSIDENDIS3.setMuutja("Kivi Karu");
	    	uusISIK_INTSIDENDIS3.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIK_INTSIDENDIS3.setSulgeja("test3");
	    	uusISIK_INTSIDENDIS3.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusISIK_INTSIDENDIS3.setIntsident(newIntsident5); // SEOS
	    	uusISIK_INTSIDENDIS3.setKirjeldus("Kus suitsu, seal tuld");
	    	uusISIK_INTSIDENDIS3.setPiiririkkuja(uusPIIRIRIKKUJA1); //SEOS
	    	uusISIK_INTSIDENDIS3.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIK_INTSIDENDIS3.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());
	    	uusISIK_INTSIDENDIS3.setKommentaar("Seekord oli vaid suitsu");
	    	//26 END
	    	
	    	
	    	//27 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS.setAvaja("Mihkel Muru"); 
	    	uusISIKU_SEADUS_INTSIDENDIS.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusISIKU_SEADUS_INTSIDENDIS.setMuutja("Marti Haro");
	    	uusISIKU_SEADUS_INTSIDENDIS.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS.setSulgeja("test3");
	    	uusISIKU_SEADUS_INTSIDENDIS.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS.setIsik_intsidendis(uusISIK_INTSIDENDIS3); //SEOS
	    	uusISIKU_SEADUS_INTSIDENDIS.setSeaduse_punkt(uusSEADUSE_PUNKT3);  //SEOS
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS.setKirjeldus("Valus seadus");
	    	uusISIKU_SEADUS_INTSIDENDIS.setKommentaar("Ära tee kui ei tohi");
	    	//27 END
	    	
	    	//28 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS1 = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS1.setAvaja("Siim Kaev"); 
	    	uusISIKU_SEADUS_INTSIDENDIS1.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusISIKU_SEADUS_INTSIDENDIS1.setMuutja("Ester Kreem");
	    	uusISIKU_SEADUS_INTSIDENDIS1.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS1.setSulgeja("test3");
	    	uusISIKU_SEADUS_INTSIDENDIS1.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS1.setAlates(new GregorianCalendar(205, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS1.setKuni(new GregorianCalendar(2005, 04, 04, 9, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS1.setIsik_intsidendis(uusISIK_INTSIDENDIS1);  //SEOS
	    	uusISIKU_SEADUS_INTSIDENDIS1.setSeaduse_punkt(uusSEADUSE_PUNKT);  //SEOS
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS1.setKirjeldus("Tore seadus");
	    	uusISIKU_SEADUS_INTSIDENDIS1.setKommentaar("Vangi paneme järgmine kord");
	    	//28 END
	    	
	    	//29 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS2 = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS2.setAvaja("Epp Pain"); 
	    	uusISIKU_SEADUS_INTSIDENDIS2.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusISIKU_SEADUS_INTSIDENDIS2.setMuutja("Kristi Torture");
	    	uusISIKU_SEADUS_INTSIDENDIS2.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS2.setSulgeja("test3");
	    	uusISIKU_SEADUS_INTSIDENDIS2.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS2.setAlates(new GregorianCalendar(209, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS2.setKuni(new GregorianCalendar(209, 04, 04, 9, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS2.setIsik_intsidendis(uusISIK_INTSIDENDIS2);  //SEOS
	    	uusISIKU_SEADUS_INTSIDENDIS2.setSeaduse_punkt(uusSEADUSE_PUNKT2);  //SEOS
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS2.setKirjeldus("Rumal seadus");
	    	uusISIKU_SEADUS_INTSIDENDIS2.setKommentaar("Ära torgi");
	    	//29 END
	    	
	    	
	    	//30 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS3 = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS3.setAvaja("Rasmus Kraav"); 
	    	uusISIKU_SEADUS_INTSIDENDIS3.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusISIKU_SEADUS_INTSIDENDIS3.setMuutja("Signe Hai");
	    	uusISIKU_SEADUS_INTSIDENDIS3.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS3.setSulgeja("test3");
	    	uusISIKU_SEADUS_INTSIDENDIS3.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS3.setAlates(new GregorianCalendar(2002, 02, 02, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS3.setKuni(new GregorianCalendar(2022, 03, 03, 9, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS3.setIsik_intsidendis(uusISIK_INTSIDENDIS3);  //SEOS
	    	uusISIKU_SEADUS_INTSIDENDIS3.setSeaduse_punkt(uusSEADUSE_PUNKT3);  //SEOS
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS3.setKirjeldus("Valus seadus");
	    	uusISIKU_SEADUS_INTSIDENDIS3.setKommentaar("Ära tee kui ei tohi");
	    	//30 END
	    	
	    	
	    	//31 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS4 = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS4.setAvaja("Viktor Räim"); 
	    	uusISIKU_SEADUS_INTSIDENDIS4.setAvatud(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	  	
	    	uusISIKU_SEADUS_INTSIDENDIS4.setMuutja("Epp Loom");
	    	uusISIKU_SEADUS_INTSIDENDIS4.setSuletud(new GregorianCalendar(9999, 01, 01, 11, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS4.setSulgeja("test3");
	    	uusISIKU_SEADUS_INTSIDENDIS4.setMuudetud(new GregorianCalendar(2006, 02, 02, 20, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS4.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS4.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS4.setIsik_intsidendis(uusISIK_INTSIDENDIS);
	    	uusISIKU_SEADUS_INTSIDENDIS4.setSeaduse_punkt(uusSEADUSE_PUNKT);
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS4.setKirjeldus("Raske rakendada");
	    	uusISIKU_SEADUS_INTSIDENDIS4.setKommentaar("Aga rakendasime ikkagi");
	    	//31 END
	    	
	    	
	    	
	    	
	    	/// Anmdebaasi kirjutamine, järjekord tähtis, kõige lõpus kirjutamine seepärast et linkida valmistehtud objekte omavahel enne andmebaasi kirjutamist
	    	uusPIIRIVALVUR.persist();
	    	uusPIIRIVALVUR2.persist();
	    	uusPIIRIVALVUR3.persist();
	    	
	    	uusINTSIDENDI_LIIK.persist();
	    	uusINTSIDENDI_LIIK1.persist();
	    	uusINTSIDENDI_LIIK2.persist();
	    	uusSEADUS.persist();
	    	uusSEADUS1.persist();
	    	uusSEADUS2.persist();
	    	uusSEADUSE_PUNKT.persist();
	    	uusSEADUSE_PUNKT2.persist();
	    	uusSEADUSE_PUNKT3.persist();
	    	uusPIIRILOIK1.persist();  
	    	uusPIIRILOIK2.persist();
	    	uusPIIRILOIK3.persist();
	    	uusPIIRILOIK4.persist();

	    	uusRIIK.persist();
	    	uusRIIK1.persist();
	    	uusOBJEKT.persist();
	    	uusPIIRIRIKKUJA.persist();
	    	uusPIIRIRIKKUJA1.persist();
	    	uusPIIRIRIKKUJA2.persist();
	    	
	    	uusKODAKONDSUS.persist();
	    	newIntsident1.persist();
	    	newIntsident2.persist();
	    	newIntsident3.persist();
	    	newIntsident4.persist();
	    	newIntsident5.persist();
	    	newIntsident6.persist();
	    	newIntsident7.persist();
	    	
	    	uusVAHTKOND.persist();
	    	uusVAHTKOND1.persist();
	    	
	    	// SEOS VAHTKONNA ja VAHTKOND_INTSIDENDIS vahel puudub?
	    	uusVAHTKOND_INTSIDENDIS.persist();
	    	uusVAHTKOND_INTSIDENDIS1.persist();
	    	uusVAHTKOND_INTSIDENDIS2.persist();

	    	uusISIK_INTSIDENDIS.persist();
	    	uusISIK_INTSIDENDIS1.persist();
	    	uusISIK_INTSIDENDIS2.persist();
	    	uusISIK_INTSIDENDIS3.persist();
	    	
	    	uusISIKU_SEADUS_INTSIDENDIS.persist();
	    	uusISIKU_SEADUS_INTSIDENDIS1.persist();
	    	uusISIKU_SEADUS_INTSIDENDIS2.persist();
	    	uusISIKU_SEADUS_INTSIDENDIS3.persist();
	    	uusISIKU_SEADUS_INTSIDENDIS4.persist();
	    	
	    }

	
}
