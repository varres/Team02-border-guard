package ee.itcollege.team02.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.itcollege.team02.entities.INTSIDENDI_LIIK;
import ee.itcollege.team02.entities.INTSIDENT;
import ee.itcollege.team02.entities.PIIRILOIK;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;

@RequestMapping("/rikkumisteraport/**")
@Controller
public class RikkumisteRaportController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public String post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    	
    	Long piiriloik_ID = Long.parseLong(request.getParameter("piiriloik")==null ? "0" : request.getParameter("piiriloik"));
    	
    	Date algus = null, lopp = null;
		try {
			algus = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("startDate")==null ? "" : request.getParameter("startDate"));
			lopp = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("endDate")==null ? "" : request.getParameter("endDate"));
		} catch (ParseException e) {
			algus = new Date();
			lopp = new Date();
			e.printStackTrace();
		}
    	
		modelMap.addAttribute("piiriloik", piiriloik_ID);
		modelMap.addAttribute("algusdate", algus);
		modelMap.addAttribute("lopp", lopp);
		
	 return "redirect:/rikkumisteraport/index?id=" + "mis siia käib?? modelMap.toString()?";
		
  
    }
    
    public void addAndmed() {
    	
    	///1 START
    	INTSIDENDI_LIIK uusINTSIDENDI_LIIK = new INTSIDENDI_LIIK();
    	
    	uusINTSIDENDI_LIIK.setAvaja("Margus Mets");  
    	uusINTSIDENDI_LIIK.setAvatud(new GregorianCalendar(2001, 02, 05, 00, 00).getTime());    
    	  
    	uusINTSIDENDI_LIIK.setMuutja("test2");
    	uusINTSIDENDI_LIIK.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
    	uusINTSIDENDI_LIIK.setSulgeja("test3");
    	uusINTSIDENDI_LIIK.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
    	uusINTSIDENDI_LIIK.setId((long) 1);
    	
    	// uusINTSIDENDI_LIIK.setINTSIDENTs(INTSIDENTs);
    	uusINTSIDENDI_LIIK.setKommentaar("Mittedeklareeritud reisijate/ainete üleveo üritus");
    	uusINTSIDENDI_LIIK.setKood("38E");
    	uusINTSIDENDI_LIIK.setNimetus("Salakaubavedu");   	
    	///1 END
    	
    	
    	///2 START
    	INTSIDENDI_LIIK uusINTSIDENDI_LIIK2 = new INTSIDENDI_LIIK();
    	
    	uusINTSIDENDI_LIIK2.setAvaja("Kaido Muru");
    	uusINTSIDENDI_LIIK2.setAvatud(new GregorianCalendar(2002, 04, 07, 00, 00).getTime());
    	
    	uusINTSIDENDI_LIIK2.setMuutja("test2");
    	uusINTSIDENDI_LIIK2.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
       	uusINTSIDENDI_LIIK2.setSulgeja("test3");
    	uusINTSIDENDI_LIIK2.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	uusINTSIDENDI_LIIK2.setId((long) 2);
    	
    	// uusINTSIDENDI_LIIK.setINTSIDENTs(INTSIDENTs);
    	uusINTSIDENDI_LIIK2.setKommentaar("piirivalve ründamine relvaga/relvata");
    	uusINTSIDENDI_LIIK2.setKood("42A");
    	uusINTSIDENDI_LIIK2.setNimetus("Rünnak");
    	///2 END
    	
    	
    	///3 START
    	PIIRIRIKKUJA uusPIIRIRIKKUJA = new PIIRIRIKKUJA();
    	
    	uusPIIRIRIKKUJA.setAvaja("Merli Maja");
    	uusPIIRIRIKKUJA.setAvatud(new GregorianCalendar(2006, 02, 05, 00, 00).getTime());
    	
    	uusINTSIDENDI_LIIK.setMuutja("test2");
    	uusINTSIDENDI_LIIK.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
    	uusINTSIDENDI_LIIK.setSulgeja("test3");
    	uusINTSIDENDI_LIIK.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
    	uusPIIRIRIKKUJA.setId((long) 1);
    	uusPIIRIRIKKUJA.setEesnimi("Karu");
    	///3 END
    	
    	
    	///4 START
    	PIIRILOIK uusPIIRILOIK1 = new PIIRILOIK();
    	
    	uusPIIRILOIK1.setAvaja("Margus Mets"); 
    	uusPIIRILOIK1.setAvatud(new GregorianCalendar(2001, 02, 05, 00, 00).getTime());
    	  	
    	uusPIIRILOIK1.setMuutja("test2");
    	uusPIIRILOIK1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
    	uusPIIRILOIK1.setSulgeja("test3");
    	uusPIIRILOIK1.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
    	
    	uusPIIRILOIK1.setId((long) 1);
    	uusPIIRILOIK1.setGPS_koordinaadid("37 long 47 lat");
    	// uusPIIRILOIK1.setINTSIDENTs(INTSIDENTs)
    	uusPIIRILOIK1.setKood("Narva 1A");
    	///4 END
    	
    	
    	///5 START
    	INTSIDENT newIntsident1 = new INTSIDENT();
    	
    	newIntsident1.setAvaja("Kaido Kivi"); 
    	newIntsident1.setAvatud(new GregorianCalendar(2004, 05, 06, 10, 00).getTime());
    	  	
    	newIntsident1.setMuutja("test2");
    	newIntsident1.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
    	newIntsident1.setSulgeja("test3");
    	newIntsident1.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	
    	
    	newIntsident1.setKood("1");
    	// linkimine
    	newIntsident1.setIntsidendi_liik(uusINTSIDENDI_LIIK2);
    	newIntsident1.setPiiriloik(uusPIIRILOIK1);
    	newIntsident1.setNimetus("Kohtumine põdraga");
    	newIntsident1.setGPS_latituud(42.32);
    	newIntsident1.setGPS_longituud(32.77);
    	
    	newIntsident1.setToimumise_algus(new GregorianCalendar(2004, 05, 05, 21, 00).getTime());
    	newIntsident1.setToimumise_lopp(new GregorianCalendar(2004, 05, 05, 21, 15).getTime());
    	
    	
    	newIntsident1.setKirjeldus("Kohutav oli");
    	newIntsident1.setKommentaar("Polnudki võibolla põder");;
    	
    	///5 END
    	
    	
    	
    	/// Anmdebaasi kirjutamine, järjekord tähtis, kõige lõpus kirjutamine seepärast et linkida valmistehtud objekte omavahel enne andmebaasi kirjutamist
    	uusINTSIDENDI_LIIK.persist();
    	uusINTSIDENDI_LIIK2.persist();
    	uusPIIRILOIK1.persist();   	
    	uusPIIRIRIKKUJA.persist();   	
    	newIntsident1.persist();
    	
    	
    }
    

    @RequestMapping
    public String index() {
    	
        return "rikkumisteraport/index";
    }
}
