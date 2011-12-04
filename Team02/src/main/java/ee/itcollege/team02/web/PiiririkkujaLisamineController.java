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
import org.springframework.web.bind.annotation.RequestParam;

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
    	Date synniaeg = null;
    	try {
			synniaeg = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("synniaeg")==null ? "" : request.getParameter("synniaeg"));
		} catch (ParseException e) {
			synniaeg = new Date();
			e.printStackTrace();
		}
    	String komm = request.getParameter("kommentaar")==null ? "" : request.getParameter("kommentaar");
    	Long id = Long.parseLong(request.getParameter("id")==null ? "0" : request.getParameter("id"));
    	Long riik_ID = Long.parseLong(request.getParameter("riik")==null ? "0" : request.getParameter("riik"));
    	
    	
    	PIIRIRIKKUJA piiririkkuja = new PIIRIRIKKUJA();
    	piiririkkuja.setIsikukood(kood);
    	piiririkkuja.setEesnimi(enimi);
    	piiririkkuja.setPerek_nimi(pnimi);
    	piiririkkuja.setSugu(sugu);
    	piiririkkuja.setSynniaeg(synniaeg);
    	piiririkkuja.setObjekt(OBJEKT.findOBJEKT(Long.parseLong(request.getParameter("objekt"))));
    	piiririkkuja.setKommentaar(komm);
    	
    	Set<ISIK_INTSIDENDIS> ISIK_INTSIDENDISs = new HashSet<ISIK_INTSIDENDIS>();
    	piiririkkuja.setISIK_INTSIDENDISs(ISIK_INTSIDENDISs);
    	
    	Set<KODAKONDSUS> kodakons = new HashSet<KODAKONDSUS>();
    	KODAKONDSUS koda = new KODAKONDSUS();
    	koda.setRiik(RIIK.findRIIK(riik_ID));
    	koda.setPiiririkkuja(piiririkkuja);
    	koda.setIsikukood("testkood");
    	koda.setKommentaar("kommentaar");
    	koda.setAlates(new Date());
    	try {
			koda.setKuni(new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31"));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
    	
    	kodakons.add(koda);
    	piiririkkuja.setKODAKONDSUSs(kodakons);
    	
    	ISIK_INTSIDENDIS isk_in = new ISIK_INTSIDENDIS();
    	isk_in.setKirjeldus("");
    	isk_in.setKommentaar("");
    	isk_in.setAlates(new Date());
    	try {
			isk_in.setKuni(new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	Set<ISIKU_SEADUS_INTSIDENDIS> sss = new HashSet<ISIKU_SEADUS_INTSIDENDIS>();
    	
    	isk_in.setISIKU_SEADUS_INTSIDENDISs(sss);
    	isk_in.setPiiririkkuja(piiririkkuja);
    	isk_in.setIntsident(INTSIDENT.findINTSIDENT(id));
    	piiririkkuja.persist();
    	koda.persist();
    	isk_in.persist();   	
    	
    	
    	return "redirect:/intsidendiredaktor/index?id=" + id;
    }
    
    @RequestMapping(params = "id",method = RequestMethod.GET)
    public void getIsikIntsident(@RequestParam("id") Long id, Model uiModel)
    {
    	List<OBJEKT> objektid = OBJEKT.findAllOBJEKTS();
    	List<RIIK> riigid = RIIK.findAllRIIKS();
    	
    	uiModel.addAttribute("objektid", objektid);
    	uiModel.addAttribute("riigid", riigid);

    	uiModel.addAttribute("id", id);
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
