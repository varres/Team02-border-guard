package ee.itcollege.team02.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.itcollege.team02.entities.INTSIDENT;
import ee.itcollege.team02.entities.ISIKU_SEADUS_INTSIDENDIS;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.KODAKONDSUS;
import ee.itcollege.team02.entities.OBJEKT;
import ee.itcollege.team02.entities.PIIRILOIK;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;
import ee.itcollege.team02.entities.RIIK;

@RequestMapping("/piiririkkujalisamine/**")
@Controller
public class PiiririkkujaLisamineController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) 
    {
    	String kood = request.getParameter("isikukood")==null ? "" : request.getParameter("isikukood");
    	String enimi = request.getParameter("eesnimi")==null ? "" : request.getParameter("eesnimi");
    	String pnimi = request.getParameter("perenimi")==null ? "" : request.getParameter("perenimi");
    	String sugu = request.getParameter("sugu")==null ? "" : request.getParameter("sugu");
    	Date synniaeg = null, avatud = null, muudetud = null, suletud = null;
    	try {
			synniaeg = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("synniaeg")==null ? "" : request.getParameter("synniaeg"));
			avatud = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("avatud")==null ? "" : request.getParameter("avatud"));
			muudetud = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("muudetud")==null ? "" : request.getParameter("muudetud"));
			suletud = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("suletud")==null ? "" : request.getParameter("suletud"));
		} catch (ParseException e) {
			synniaeg = new Date();
			avatud = new Date();
			muudetud = new Date();
			suletud = new Date();
			e.printStackTrace();
		}
    	String komm = request.getParameter("kommentaar")==null ? "" : request.getParameter("kommentaar");
    	String avaja = request.getParameter("avaja")==null ? "" : request.getParameter("avaja");
    	String muutja = request.getParameter("muutja")==null ? "" : request.getParameter("muutja");
    	String sulgeja = request.getParameter("sulgeja")==null ? "" : request.getParameter("sulgeja");
    	Long id = Long.parseLong(request.getParameter("id")==null ? "0" : request.getParameter("id"));
    	
    	
    	PIIRIRIKKUJA piiririkkuja = new PIIRIRIKKUJA();
    	piiririkkuja.setIsikukood(kood);
    	piiririkkuja.setEesnimi(enimi);
    	piiririkkuja.setPerek_nimi(pnimi);
    	piiririkkuja.setSugu(sugu);
    	piiririkkuja.setSynniaeg(synniaeg);
    	piiririkkuja.setObjekt(OBJEKT.findOBJEKT(Long.parseLong(request.getParameter("objekt"))));
    	piiririkkuja.setKommentaar(komm);
    	piiririkkuja.setAvaja(avaja);
    	piiririkkuja.setAvatud(avatud);
    	piiririkkuja.setMuutja(muutja);
    	piiririkkuja.setMuudetud(muudetud);
    	piiririkkuja.setSulgeja(sulgeja);
    	piiririkkuja.setSuletud(suletud);
    	//piiririkkuja.setISIK_INTSIDENDISs(ISIK_INTSIDENDISs)  TODO
    	
    	Set<ISIK_INTSIDENDIS> ISIK_INTSIDENDISs = new HashSet<ISIK_INTSIDENDIS>();
    	piiririkkuja.setISIK_INTSIDENDISs(ISIK_INTSIDENDISs);
    	
    	Set<KODAKONDSUS> kodakons = new HashSet<KODAKONDSUS>();
    	piiririkkuja.setKODAKONDSUSs(kodakons);
    	piiririkkuja.persist();
    	
    	ISIK_INTSIDENDIS isk_in = new ISIK_INTSIDENDIS();
    	isk_in.setKirjeldus("");
    	isk_in.setKommentaar("");
    	isk_in.setAlates(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	isk_in.setKuni(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	isk_in.setAvaja("Merli Maja");
    	isk_in.setAvatud(new GregorianCalendar(2006, 02, 05, 00, 00).getTime());    	
    	isk_in.setMuutja("test2");
    	isk_in.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());    	
    	isk_in.setSulgeja("test3");
    	isk_in.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	Set<ISIKU_SEADUS_INTSIDENDIS> sss = new HashSet<ISIKU_SEADUS_INTSIDENDIS>();
    	isk_in.setISIKU_SEADUS_INTSIDENDISs(sss);
    	isk_in.setPiiririkkuja(piiririkkuja);
    	isk_in.setIntsident(INTSIDENT.findINTSIDENT(id));
    	isk_in.persist();   	
    	
    	
    	return "redirect:/intsidendiredaktor/index?id=" + id;
    }

    @RequestMapping
    public String index(Model uiModel) 
    {
    	List<OBJEKT> objektid = OBJEKT.findAllOBJEKTS();
    	List<RIIK> riigid = RIIK.findAllRIIKS();
    	// List<KODAKONDSUS> kodakondsused = KODAKONDSUS.findAllKODAKONDSUS();
    	
    	uiModel.addAttribute("objektid", objektid);
    	uiModel.addAttribute("riigid", riigid);
    	// uiModel.addAttribute("kodakondsused", kodakondsused);
    	
    	
        return "piiririkkujalisamine/index";
    }
}
