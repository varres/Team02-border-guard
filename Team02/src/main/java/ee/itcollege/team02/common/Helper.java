package ee.itcollege.team02.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import ee.itcollege.team02.entities.*;


public class Helper {
	public static boolean IsSurrogateDate(Date date){
		SimpleDateFormat simpleDateformatYear = new SimpleDateFormat("yyyy");
		SimpleDateFormat simpleDateformatMonth = new SimpleDateFormat("MM");
		SimpleDateFormat simpleDateformatDay = new SimpleDateFormat("d");
		
		String year = simpleDateformatYear.format(date);
		String month = simpleDateformatMonth.format(date);
		String day = simpleDateformatDay.format(date);
		
		// System.out.println("Testing IsSurrogateDate YEAR:" + year + " Month:" + month + " Day:" +day);
		if(year.equals("9999") && month.equals("12") && day.equals("31")){		
			return true;
		}else{
			return false;
		}
		
	}
	
	 public static void addAndmed() {
	    	
	    	///1 START
	    	INTSIDENDI_LIIK uusINTSIDENDI_LIIK = new INTSIDENDI_LIIK();
	    	uusINTSIDENDI_LIIK.setKommentaar("Mittedeklareeritud reisijate/ainete üleveo üritus");
	    	uusINTSIDENDI_LIIK.setKood("38E");
	    	uusINTSIDENDI_LIIK.setNimetus("Salakaubavedu");   	
	    	///1 END
	    	
	    	
	    	///2 START
	    	INTSIDENDI_LIIK uusINTSIDENDI_LIIK1 = new INTSIDENDI_LIIK();
	    	uusINTSIDENDI_LIIK1.setKommentaar("piiri ületamine vales kohas");
	    	uusINTSIDENDI_LIIK1.setKood("42A");
	    	uusINTSIDENDI_LIIK1.setNimetus("Piiri rikkumine");
	    	///2 END
	    	
	    	
	    	///2 START
	    	INTSIDENDI_LIIK uusINTSIDENDI_LIIK2 = new INTSIDENDI_LIIK();
	    	uusINTSIDENDI_LIIK2.setKommentaar("piirivalve ründamine relvaga/relvata");
	    	uusINTSIDENDI_LIIK2.setKood("42A");
	    	uusINTSIDENDI_LIIK2.setNimetus("Rünnak");
	    	///2 END
	    	
	    	
	    	/// 3 START
	    	RIIK uusRIIK = new RIIK();
	    	uusRIIK.setISO_kood("ISO-8859-5");
	    	uusRIIK.setANSI_kood("RUS");
	    	/// 3 END
	    	
	    	
	    	/// 4 START
	    	RIIK uusRIIK1 = new RIIK();
	    	uusRIIK1.setISO_kood("ISO 3166-2");
	    	uusRIIK1.setANSI_kood("SWE");
	    	/// 4 END
	    	

	    	/// 5 START  	
	    	OBJEKT uusOBJEKT = new OBJEKT();	
	    	uusOBJEKT.setNimetus("Küün");
	    	/// 5 END
	    	
	    	
	    	/// 5 START  	
	    	OBJEKT uusOBJEKT1 = new OBJEKT();
	    	uusOBJEKT1.setNimetus("Kahtlane kott");
	    	/// 5 END
	    	
	    	
	    	/// 5 START  	
	    	OBJEKT uusOBJEKT2 = new OBJEKT();
	    	uusOBJEKT2.setNimetus("Sõnnikuhark");
	    	/// 5 END
	    	
	    	
	    	///6 START
	    	PIIRIRIKKUJA uusPIIRIRIKKUJA = new PIIRIRIKKUJA();
	    	uusPIIRIRIKKUJA.setEesnimi("Fedja");   	
	    	uusPIIRIRIKKUJA.setObjekt(uusOBJEKT); //SEOS!
	    	uusPIIRIRIKKUJA.setPerek_nimi("Kuzmin");
	    	uusPIIRIRIKKUJA.setSugu("M");
	    	uusPIIRIRIKKUJA.setIsikukood("M327232372");
	    	uusPIIRIRIKKUJA.setSynniaeg(new GregorianCalendar(1926, 04, 05, 00, 00).getTime());
	    	///6 END
	    	
	    	
	    	///6 START
	    	PIIRIRIKKUJA uusPIIRIRIKKUJA1 = new PIIRIRIKKUJA();
	    	uusPIIRIRIKKUJA1.setEesnimi("AKE");   	
	    	uusPIIRIRIKKUJA1.setObjekt(uusOBJEKT); //SEOS!
	    	uusPIIRIRIKKUJA1.setPerek_nimi("HAMMSTRJOM");
	    	uusPIIRIRIKKUJA1.setSugu("M");
	    	uusPIIRIRIKKUJA1.setIsikukood("SW2300003");
	    	uusPIIRIRIKKUJA1.setSynniaeg(new GregorianCalendar(1976, 04, 05, 00, 00).getTime());
	    	///6 END
	    	
	    	
	    	///6 START
	    	PIIRIRIKKUJA uusPIIRIRIKKUJA2 = new PIIRIRIKKUJA();
	    	uusPIIRIRIKKUJA2.setEesnimi("Parmo");   	
	    	uusPIIRIRIKKUJA2.setObjekt(uusOBJEKT); //SEOS!
	    	uusPIIRIRIKKUJA2.setPerek_nimi("Muhvilainen");
	    	uusPIIRIRIKKUJA2.setSugu("M");
	    	uusPIIRIRIKKUJA2.setIsikukood("778800230");
	    	uusPIIRIRIKKUJA2.setSynniaeg(new GregorianCalendar(1944, 02, 02, 00, 00).getTime());
	    	///6 END
	    	

	    	/// 7 START
	    	KODAKONDSUS uusKODAKONDSUS = new KODAKONDSUS ();
	    	uusKODAKONDSUS.setPiiririkkuja(uusPIIRIRIKKUJA);  //SEOS!
	    	uusKODAKONDSUS.setIsikukood("327232372");   	
	    	uusKODAKONDSUS.setAlates(new GregorianCalendar(1950, 01, 01, 00, 00).getTime());
	    	uusKODAKONDSUS.setKuni(new GregorianCalendar(2020, 01, 01, 00, 00).getTime());
	    	uusKODAKONDSUS.setRiik(uusRIIK1); //SEOS!
	    	/// 7 END
	    	
	    	
	    	///8 START
	    	PIIRILOIK uusPIIRILOIK1 = new PIIRILOIK();   	
	    	uusPIIRILOIK1.setNimetus("Narva Raba");
	    	uusPIIRILOIK1.setGPS_koordinaadid("22 long 11 lat");
	    	uusPIIRILOIK1.setKommentaar("Suur soo ja raba");
	    	uusPIIRILOIK1.setKood("Narva 1A");
	    	///8 END
	    	
	    	
	    	///8 START
	    	PIIRILOIK uusPIIRILOIK2 = new PIIRILOIK();   	
	    	uusPIIRILOIK2.setNimetus("Peipsi järv");
	    	uusPIIRILOIK2.setGPS_koordinaadid("31 long 48 lat");
	    	uusPIIRILOIK2.setKommentaar("Suur veekogu");
	    	uusPIIRILOIK2.setKood("Peipsi 1A");
	    	///8 END
	    	
	    	
	    	///8 START
	    	PIIRILOIK uusPIIRILOIK3 = new PIIRILOIK();
	    	uusPIIRILOIK3.setNimetus("Narva tee");
	    	uusPIIRILOIK3.setGPS_koordinaadid("37 long 47 lat");
	    	uusPIIRILOIK3.setKommentaar("Suur tee, järjekorrad");
	    	uusPIIRILOIK3.setKood("Narva 2A");
	    	///8 END
	    	
	    	
	    	///8 START
	    	PIIRILOIK uusPIIRILOIK4 = new PIIRILOIK();   	
	    	uusPIIRILOIK4.setNimetus("Võru mets");
	    	uusPIIRILOIK4.setGPS_koordinaadid("66 long 17 lat");
	    	uusPIIRILOIK4.setKommentaar("Palju jäneseid");
	    	uusPIIRILOIK4.setKood("Võru 1");
	    	///8 END
	    	
	    	
	    	///9 START
	    	INTSIDENT newIntsident1 = new INTSIDENT();
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
	    	uusSEADUS.setKood("BFG");
	    	uusSEADUS.setKehtiv_alates("12.10.2003");
	    	uusSEADUS.setKehtiv_kuni("4.3.2024");
	    	uusSEADUS.setNimetus("Relvaseadus");
	    	uusSEADUS.setKommentaar("sõita saab tankiga");
	    	///10 END
	    	
	    	
	    	///11 START
	    	SEADUS uusSEADUS1 = new SEADUS();
	    	uusSEADUS1.setKood("DND");
	    	uusSEADUS1.setKehtiv_alates("1.1.2002");
	    	uusSEADUS1.setKehtiv_kuni("2.3.2017");   	
	    	uusSEADUS1.setNimetus("Piiriseadus");
	    	uusSEADUS1.setKommentaar("Piiri kontrollivärk");
	    	///11 END
	    
	    	
	    	///11 START
	    	SEADUS pyhiSEADUS1 = new SEADUS();
	    	pyhiSEADUS1.setKood("AIAI");
	    	pyhiSEADUS1.setKehtiv_alates("1.1.1921");
	    	pyhiSEADUS1.setKehtiv_kuni("2.3.2999");   	
	    	pyhiSEADUS1.setNimetus("Põhiseadus");
	    	pyhiSEADUS1.setKommentaar("Vabariigi põhiseadus");
	    	///11 END
	    	
	    		    	
	    	///11 START
	    	SEADUS uusSEADUS2 = new SEADUS();
	    	uusSEADUS2.setKood("MRR");
	    	uusSEADUS2.setKehtiv_alates("2.7.2001");
	    	uusSEADUS2.setKehtiv_kuni("5.3.2045");    	
	    	uusSEADUS2.setNimetus("Looduskaitseseadus");
	    	uusSEADUS2.setKommentaar("Loomi kaitsta");	    	
	    	///11 END
	    	
	    	///12 START
	    	SEADUSE_PUNKT ylemusSEADUSE_PUNKT = new SEADUSE_PUNKT();
	    	ylemusSEADUSE_PUNKT.setKehtiv_alates("2.7.1921");
	    	ylemusSEADUSE_PUNKT.setKehtiv_kuni("5.3.2045");
	    	ylemusSEADUSE_PUNKT.setPais("4.3");
	    	ylemusSEADUSE_PUNKT.setParagrahv("4");
	    	ylemusSEADUSE_PUNKT.setSeadus(uusSEADUS2); //SEOS! 
//	    	ylemusSEADUSE_PUNKT.setYlemus_seaduse_punkt(uusSEADUS1); //SEOS! 
	    	ylemusSEADUSE_PUNKT.setKommentaar("Põhiseadus");
	    	ylemusSEADUSE_PUNKT.setTekst("Tõeline bossseadus");
	    	///12 END
	    	
	    	
	    	///12 START
	    	SEADUSE_PUNKT uusSEADUSE_PUNKT = new SEADUSE_PUNKT();
	    	uusSEADUSE_PUNKT.setKehtiv_alates("2.7.2001");
	    	uusSEADUSE_PUNKT.setKehtiv_kuni("5.3.2045");
	    	uusSEADUSE_PUNKT.setPais("4.3");
	    	uusSEADUSE_PUNKT.setParagrahv("4");
	    	uusSEADUSE_PUNKT.setSeadus(uusSEADUS2); //SEOS! 
	    	uusSEADUSE_PUNKT.setYlemus_seaduse_punkt(ylemusSEADUSE_PUNKT); //SEOS! 
	    	uusSEADUSE_PUNKT.setKommentaar("Põtra ei tohi lasta");
	    	uusSEADUSE_PUNKT.setTekst("Põdrad on lahedad");
	    	///12 END
	    	
	    	///13 START
	    	SEADUSE_PUNKT uusSEADUSE_PUNKT2 = new SEADUSE_PUNKT();
	    	uusSEADUSE_PUNKT2.setKehtiv_alates("2.7.1921");
	    	uusSEADUSE_PUNKT2.setKehtiv_kuni("5.3.2045");
	    	uusSEADUSE_PUNKT2.setPais("2.3");
	    	uusSEADUSE_PUNKT2.setParagrahv("5");
	    	uusSEADUSE_PUNKT2.setSeadus(uusSEADUS); //SEOS! 
	    	uusSEADUSE_PUNKT2.setYlemus_seaduse_punkt(ylemusSEADUSE_PUNKT); //SEOS! 
	    	uusSEADUSE_PUNKT2.setKommentaar("Karu ei tohi lasta");
	    	uusSEADUSE_PUNKT2.setTekst("Karud ka lahedad");
	    	///13 END
	    	
	    	///14 START
	    	SEADUSE_PUNKT uusSEADUSE_PUNKT3 = new SEADUSE_PUNKT();
	    	uusSEADUSE_PUNKT3.setKehtiv_alates("1.1.1935");
	    	uusSEADUSE_PUNKT3.setKehtiv_kuni("4.12.2025");
	    	uusSEADUSE_PUNKT3.setPais("1.3");
	    	uusSEADUSE_PUNKT3.setParagrahv("7");
	    	uusSEADUSE_PUNKT3.setSeadus(uusSEADUS1); //SEOS! 
	    	uusSEADUSE_PUNKT3.setYlemus_seaduse_punkt(ylemusSEADUSE_PUNKT); //SEOS! 
	    	uusSEADUSE_PUNKT3.setKommentaar("Relvaga ei tohi");
	    	uusSEADUSE_PUNKT3.setTekst("Relvata ka ei tohi");
	    	///14 END

	    	///14 START
	    	SEADUSE_PUNKT uusSEADUSE_PUNKT4 = new SEADUSE_PUNKT();
	    	uusSEADUSE_PUNKT4.setKehtiv_alates("1.1.1925");
	    	uusSEADUSE_PUNKT4.setKehtiv_kuni("4.12.2025");
	    	uusSEADUSE_PUNKT4.setPais("2.3");
	    	uusSEADUSE_PUNKT4.setParagrahv("8");
	    	uusSEADUSE_PUNKT4.setSeadus(uusSEADUS1); //SEOS! 
	    	uusSEADUSE_PUNKT4.setYlemus_seaduse_punkt(ylemusSEADUSE_PUNKT); //SEOS! 
	    	uusSEADUSE_PUNKT4.setKommentaar("Viinaga ei tohi");
	    	uusSEADUSE_PUNKT4.setTekst("Üle piiri minna");
	    	///14 END

	    	///14 START
	    	SEADUSE_PUNKT uusSEADUSE_PUNKT5 = new SEADUSE_PUNKT();
	    	uusSEADUSE_PUNKT5.setKehtiv_alates("1.1.1995");
	    	uusSEADUSE_PUNKT5.setKehtiv_kuni("4.12.2025");
	    	uusSEADUSE_PUNKT5.setPais("6.3");
	    	uusSEADUSE_PUNKT5.setParagrahv("12");
	    	uusSEADUSE_PUNKT5.setSeadus(uusSEADUS); //SEOS! 
	    	uusSEADUSE_PUNKT5.setYlemus_seaduse_punkt(ylemusSEADUSE_PUNKT); //SEOS! 
	    	uusSEADUSE_PUNKT5.setKommentaar("Tankiga ei tohi");
	    	uusSEADUSE_PUNKT5.setTekst("Valvurit tulistada");
	    	///14 END
	    	
	    	
	    	///15 START
	    	PIIRIVALVUR uusPIIRIVALVUR = new PIIRIVALVUR();
	    	uusPIIRIVALVUR.setEesnimed("Karl Kusti");
	    	uusPIIRIVALVUR.setIsikukood("37603046765");
	    	uusPIIRIVALVUR.setKommentaar("Kusti on väga tulbli olnud");
	    	uusPIIRIVALVUR.setPerekonnanimi("Väljataga");
	    	uusPIIRIVALVUR.setSoduri_kood("11001100");
	    	uusPIIRIVALVUR.setSugu("M");
	    	///15 END
	    	
	    	
	    	///16 START
	    	PIIRIVALVUR uusPIIRIVALVUR2 = new PIIRIVALVUR();
	    	uusPIIRIVALVUR2.setEesnimed("Voldemart");
	    	uusPIIRIVALVUR2.setIsikukood("37204041112");
	    	uusPIIRIVALVUR2.setKommentaar("ei oska piiri pidada");
	    	uusPIIRIVALVUR2.setPerekonnanimi("Must");
	    	uusPIIRIVALVUR2.setSoduri_kood("11001102");
	    	uusPIIRIVALVUR2.setSugu("M");
	    	///16 END
	    	
	    	
	    	///17 START
	    	PIIRIVALVUR uusPIIRIVALVUR3 = new PIIRIVALVUR();	    	
	    	uusPIIRIVALVUR3.setEesnimed("Mihkel");
	    	uusPIIRIVALVUR3.setIsikukood("39102124461");
	    	uusPIIRIVALVUR3.setKommentaar("Mihkel oskab lasta");
	    	uusPIIRIVALVUR3.setPerekonnanimi("Laud");
	    	uusPIIRIVALVUR3.setSoduri_kood("11001422");
	    	uusPIIRIVALVUR3.setSugu("M");
	    	///17 END
	    	
	    	
	    	///18 START
	    	VAHTKOND uusVAHTKOND = new VAHTKOND();
	    	uusVAHTKOND.setKommentaar("Vihased vennad");
	    	uusVAHTKOND.setKood("ZZBBZZ");
	    	uusVAHTKOND.setAlates(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	uusVAHTKOND.setKuni(new GregorianCalendar(2012, 05, 06, 10, 00).getTime());
	    	uusVAHTKOND.setNimetus("Jäärgibrigaad");
	    	///18 END
	    	
	    	
	    	///19 START
	    	VAHTKOND uusVAHTKOND1 = new VAHTKOND();
	    	uusVAHTKOND1.setKommentaar("Vajab lisamehi");
	    	uusVAHTKOND1.setKood("T82KILL");
	    	uusVAHTKOND1.setAlates(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
	    	uusVAHTKOND1.setKuni(new GregorianCalendar(2012, 05, 06, 10, 00).getTime());
	    	uusVAHTKOND1.setNimetus("Tankipatrull");
	    	///19 END
	    	
	    	
	    	///20 START
	    	VAHTKOND_INTSIDENDIS uusVAHTKOND_INTSIDENDIS = new VAHTKOND_INTSIDENDIS();	    	
	    	uusVAHTKOND_INTSIDENDIS.setIntsident(newIntsident1); //SEOS
	    	uusVAHTKOND_INTSIDENDIS.setAlates(new GregorianCalendar(2010, 03, 03, 20, 00).getTime());
	    	
	    	uusVAHTKOND_INTSIDENDIS.setKirjeldus("Kõik olid väga vaprad");
	    	uusVAHTKOND_INTSIDENDIS.setVahtkond(uusVAHTKOND1);
	    	uusVAHTKOND_INTSIDENDIS.setKuni(new GregorianCalendar(2011, 03, 03, 20, 00).getTime());
	    	///20 END
	    	
	    	///21 START
	    	VAHTKOND_INTSIDENDIS uusVAHTKOND_INTSIDENDIS1 = new VAHTKOND_INTSIDENDIS();
	    	uusVAHTKOND_INTSIDENDIS1.setIntsident(newIntsident4); //SEOS
	    	uusVAHTKOND_INTSIDENDIS1.setAlates(new GregorianCalendar(2010, 03, 03, 20, 00).getTime());
	    	uusVAHTKOND_INTSIDENDIS1.setVahtkond(uusVAHTKOND);
	    	uusVAHTKOND_INTSIDENDIS1.setKirjeldus("Kus, mis, kes?");
	    	uusVAHTKOND_INTSIDENDIS1.setKuni(new GregorianCalendar(2011, 03, 03, 20, 00).getTime());
	    	///21 END
	    	
	    	///22 START
	    	VAHTKOND_INTSIDENDIS uusVAHTKOND_INTSIDENDIS2 = new VAHTKOND_INTSIDENDIS();
	    	uusVAHTKOND_INTSIDENDIS2.setIntsident(newIntsident2); //SEOS
	    	uusVAHTKOND_INTSIDENDIS2.setAlates(new GregorianCalendar(2010, 03, 03, 20, 00).getTime());
	    	uusVAHTKOND_INTSIDENDIS2.setVahtkond(uusVAHTKOND);
	    	uusVAHTKOND_INTSIDENDIS2.setKirjeldus("Relvad ei töödanud");
	    	uusVAHTKOND_INTSIDENDIS2.setKuni(new GregorianCalendar(2011, 03, 03, 20, 00).getTime());
	    	///22 END
	    	
	    	
	    	//23 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS = new ISIK_INTSIDENDIS();
	    	uusISIK_INTSIDENDIS.setIntsident(newIntsident1); // SEOS
	    	uusISIK_INTSIDENDIS.setKirjeldus("Tuuker võitis");
	    	uusISIK_INTSIDENDIS.setPiiririkkuja(uusPIIRIRIKKUJA1); //SEOS
	    	uusISIK_INTSIDENDIS.setAlates(new GregorianCalendar(2010, 03, 03, 5, 00).getTime());
	    	uusISIK_INTSIDENDIS.setKuni(new GregorianCalendar(2011, 02, 02, 12, 00).getTime());
	    	uusISIK_INTSIDENDIS.setKommentaar("Tuleb allveelaev muretseda");
	    	//23 END
	    	
	    	
	    	//24 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS1 = new ISIK_INTSIDENDIS();
	    	uusISIK_INTSIDENDIS1.setIntsident(newIntsident3); // SEOS
	    	uusISIK_INTSIDENDIS1.setKirjeldus("Laulsid koos");
	    	uusISIK_INTSIDENDIS1.setPiiririkkuja(uusPIIRIRIKKUJA2); //SEOS
	    	uusISIK_INTSIDENDIS1.setAlates(new GregorianCalendar(2010, 03, 03, 5, 00).getTime());
	    	uusISIK_INTSIDENDIS1.setKuni(new GregorianCalendar(2011, 02, 02, 12, 00).getTime());
	    	uusISIK_INTSIDENDIS1.setKommentaar("Tuleb laulma õpetada");
	    	//24 END
	    	
	    	//25 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS2 = new ISIK_INTSIDENDIS();
	    	uusISIK_INTSIDENDIS2.setIntsident(newIntsident4); // SEOS
	    	uusISIK_INTSIDENDIS2.setKirjeldus("Jälle ta oma salaviinaga");
	    	uusISIK_INTSIDENDIS2.setPiiririkkuja(uusPIIRIRIKKUJA1); //SEOS
	    	uusISIK_INTSIDENDIS2.setAlates(new GregorianCalendar(2009, 03, 03, 5, 00).getTime());
	    	uusISIK_INTSIDENDIS2.setKuni(new GregorianCalendar(2009, 03, 03, 12, 00).getTime());
	    	uusISIK_INTSIDENDIS2.setKommentaar("Saime ta õnneks kätte. *HIC*!");
	    	//25 END
	    	
	    	//26 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS3 = new ISIK_INTSIDENDIS();
	    	uusISIK_INTSIDENDIS3.setIntsident(newIntsident5); // SEOS
	    	uusISIK_INTSIDENDIS3.setKirjeldus("Kus suitsu, seal tuld");
	    	uusISIK_INTSIDENDIS3.setPiiririkkuja(uusPIIRIRIKKUJA1); //SEOS
	    	uusISIK_INTSIDENDIS3.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIK_INTSIDENDIS3.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());
	    	uusISIK_INTSIDENDIS3.setKommentaar("Seekord oli vaid suitsu");
	    	//26 END
	    	
	    	//26 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS4 = new ISIK_INTSIDENDIS();
	    	uusISIK_INTSIDENDIS4.setIntsident(newIntsident5); // SEOS
	    	uusISIK_INTSIDENDIS4.setKirjeldus("Kus koerad, seal kits");
	    	uusISIK_INTSIDENDIS4.setPiiririkkuja(uusPIIRIRIKKUJA2); //SEOS
	    	uusISIK_INTSIDENDIS4.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIK_INTSIDENDIS4.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());
	    	uusISIK_INTSIDENDIS4.setKommentaar("Seekord oli vaid kits");
	    	//26 END
	    	
	    	//26 START
	    	ISIK_INTSIDENDIS uusISIK_INTSIDENDIS5 = new ISIK_INTSIDENDIS();
	    	uusISIK_INTSIDENDIS5.setIntsident(newIntsident5); // SEOS
	    	uusISIK_INTSIDENDIS5.setKirjeldus("Hooletus ees, õnnetus t.");
	    	uusISIK_INTSIDENDIS5.setPiiririkkuja(uusPIIRIRIKKUJA); //SEOS
	    	uusISIK_INTSIDENDIS5.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIK_INTSIDENDIS5.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());
	    	uusISIK_INTSIDENDIS5.setKommentaar("Seekord oli hooletus");
	    	//26 END
	    	
	    	
	    	//27 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS.setIsik_intsidendis(uusISIK_INTSIDENDIS3); //SEOS
	    	uusISIKU_SEADUS_INTSIDENDIS.setSeaduse_punkt(uusSEADUSE_PUNKT3);  //SEOS  	
	    	uusISIKU_SEADUS_INTSIDENDIS.setKirjeldus("Valus seadus");
	    	uusISIKU_SEADUS_INTSIDENDIS.setKommentaar("Ära tee kui ei tohi");
	    	//27 END
	    	
	    	//28 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS1 = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS1.setAlates(new GregorianCalendar(205, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS1.setKuni(new GregorianCalendar(2005, 04, 04, 9, 00).getTime());  	
	    	uusISIKU_SEADUS_INTSIDENDIS1.setIsik_intsidendis(uusISIK_INTSIDENDIS1);  //SEOS
	    	uusISIKU_SEADUS_INTSIDENDIS1.setSeaduse_punkt(uusSEADUSE_PUNKT);  //SEOS    	
	    	uusISIKU_SEADUS_INTSIDENDIS1.setKirjeldus("Tore seadus");
	    	uusISIKU_SEADUS_INTSIDENDIS1.setKommentaar("Vangi paneme järgmine kord");
	    	//28 END
	    	
	    	//29 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS2 = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS2.setAlates(new GregorianCalendar(209, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS2.setKuni(new GregorianCalendar(209, 04, 04, 9, 00).getTime());  	
	    	uusISIKU_SEADUS_INTSIDENDIS2.setIsik_intsidendis(uusISIK_INTSIDENDIS2);  //SEOS
	    	uusISIKU_SEADUS_INTSIDENDIS2.setSeaduse_punkt(uusSEADUSE_PUNKT2);  //SEOS	
	    	uusISIKU_SEADUS_INTSIDENDIS2.setKirjeldus("Rumal seadus");
	    	uusISIKU_SEADUS_INTSIDENDIS2.setKommentaar("Ära torgi");
	    	//29 END
	    	
	    	
	    	//30 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS3 = new ISIKU_SEADUS_INTSIDENDIS();
	    	uusISIKU_SEADUS_INTSIDENDIS3.setAlates(new GregorianCalendar(2002, 02, 02, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS3.setKuni(new GregorianCalendar(2022, 03, 03, 9, 00).getTime());    	
	    	uusISIKU_SEADUS_INTSIDENDIS3.setIsik_intsidendis(uusISIK_INTSIDENDIS3);  //SEOS
	    	uusISIKU_SEADUS_INTSIDENDIS3.setSeaduse_punkt(uusSEADUSE_PUNKT3);  //SEOS	    	
	    	uusISIKU_SEADUS_INTSIDENDIS3.setKirjeldus("Valus seadus");
	    	uusISIKU_SEADUS_INTSIDENDIS3.setKommentaar("Ära tee kui ei tohi");
	    	//30 END
	    	
	    	
	    	//31 START
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS4 = new ISIKU_SEADUS_INTSIDENDIS();	    	
	    	uusISIKU_SEADUS_INTSIDENDIS4.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS4.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());	    	
	    	uusISIKU_SEADUS_INTSIDENDIS4.setIsik_intsidendis(uusISIK_INTSIDENDIS);
	    	uusISIKU_SEADUS_INTSIDENDIS4.setSeaduse_punkt(uusSEADUSE_PUNKT2);	    	
	    	uusISIKU_SEADUS_INTSIDENDIS4.setKirjeldus("Raske rakendada");
	    	uusISIKU_SEADUS_INTSIDENDIS4.setKommentaar("Aga rakendasime ikkagi");
	    	//31 END
	    	
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS5 = new ISIKU_SEADUS_INTSIDENDIS();	    	
	    	uusISIKU_SEADUS_INTSIDENDIS5.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS5.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());	    	
	    	uusISIKU_SEADUS_INTSIDENDIS5.setIsik_intsidendis(uusISIK_INTSIDENDIS2);
	    	uusISIKU_SEADUS_INTSIDENDIS5.setSeaduse_punkt(uusSEADUSE_PUNKT3);	    	
	    	uusISIKU_SEADUS_INTSIDENDIS5.setKirjeldus("Raske rakendada");
	    	uusISIKU_SEADUS_INTSIDENDIS5.setKommentaar("Aga rakendasime ikkagi");
	    	//31 END
	    	
	    	ISIKU_SEADUS_INTSIDENDIS uusISIKU_SEADUS_INTSIDENDIS6 = new ISIKU_SEADUS_INTSIDENDIS();	    	
	    	uusISIKU_SEADUS_INTSIDENDIS6.setAlates(new GregorianCalendar(2011, 01, 01, 1, 00).getTime());
	    	uusISIKU_SEADUS_INTSIDENDIS6.setKuni(new GregorianCalendar(2011, 04, 04, 9, 00).getTime());	    	
	    	uusISIKU_SEADUS_INTSIDENDIS6.setIsik_intsidendis(uusISIK_INTSIDENDIS);
	    	uusISIKU_SEADUS_INTSIDENDIS6.setSeaduse_punkt(uusSEADUSE_PUNKT4);	    	
	    	uusISIKU_SEADUS_INTSIDENDIS6.setKirjeldus("Raske rakendada");
	    	uusISIKU_SEADUS_INTSIDENDIS6.setKommentaar("Aga rakendasime ikkagi");
	    	//31 END
	    	
	    	
	    	//32 START
	    	OBJEKT_INTSIDENDIS uusOBJEKT_INTSIDENDIS= new OBJEKT_INTSIDENDIS();
	    	uusOBJEKT_INTSIDENDIS.setAlates(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	uusOBJEKT_INTSIDENDIS.setKuni(new GregorianCalendar(2005, 02, 05, 9, 47).getTime());	    	
	    	uusOBJEKT_INTSIDENDIS.setIntsident(newIntsident2);
	    	uusOBJEKT_INTSIDENDIS.setObjekt(uusOBJEKT);
	    	uusOBJEKT_INTSIDENDIS.setKirjeldus("");
	    	uusOBJEKT_INTSIDENDIS.setKommentaar("");
	    	//32 END
	    	
	    	
	    	//33 START
	    	OBJEKT_INTSIDENDIS uusOBJEKT_INTSIDENDIS1= new OBJEKT_INTSIDENDIS();	    	
	    	uusOBJEKT_INTSIDENDIS1.setAlates(new GregorianCalendar(2005, 02, 05, 9, 37).getTime());
	    	uusOBJEKT_INTSIDENDIS1.setKuni(new GregorianCalendar(2005, 02, 05, 9, 47).getTime());
	    	uusOBJEKT_INTSIDENDIS1.setIntsident(newIntsident1);
	    	uusOBJEKT_INTSIDENDIS1.setObjekt(uusOBJEKT2);
	    	uusOBJEKT_INTSIDENDIS1.setKirjeldus("");
	    	uusOBJEKT_INTSIDENDIS1.setKommentaar("");
	    	//33 END
	    	
	    	
	    	
	    	
	    	
	    	
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
	    	pyhiSEADUS1.persist();
	    	ylemusSEADUSE_PUNKT.persist();
	    	uusSEADUSE_PUNKT.persist();
	    	uusSEADUSE_PUNKT2.persist();
	    	uusSEADUSE_PUNKT3.persist();
	    	uusSEADUSE_PUNKT4.persist();
	    	uusSEADUSE_PUNKT5.persist();
	    	uusPIIRILOIK1.persist();  
	    	uusPIIRILOIK2.persist();
	    	uusPIIRILOIK3.persist();
	    	uusPIIRILOIK4.persist();
	    	

	    	uusRIIK.persist();
	    	uusRIIK1.persist();
	    	uusOBJEKT.persist();
	    	uusOBJEKT1.persist();
	    	uusOBJEKT2.persist();
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
	    	uusISIKU_SEADUS_INTSIDENDIS5.persist();
	    	uusISIKU_SEADUS_INTSIDENDIS6.persist();
	    	
	    	uusOBJEKT_INTSIDENDIS.persist();
	    	uusOBJEKT_INTSIDENDIS1.persist();
	    	
	    }

	
}
