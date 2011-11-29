package ee.itcollege.team02.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.itcollege.team02.entities.KODAKONDSUS;
import ee.itcollege.team02.entities.OBJEKT;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;

@RequestMapping("/piiririkkujalisamine/**")
@Controller
public class PiiririkkujaLisamineController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public String post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) 
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
    	piiririkkuja.persist();
    	
    	return "redirect:/intsidendiredaktor/index?id=" + id;
    }

    @RequestMapping
    public String index(Model uiModel) 
    {
    	List<OBJEKT> objektid = OBJEKT.findAllOBJEKTS();
    	List<KODAKONDSUS> kodakondsused = KODAKONDSUS.findAllKODAKONDSUS();
    	
    	
    	uiModel.addAttribute("objektid", objektid);
    	uiModel.addAttribute("kodakondsused", kodakondsused);
    	
        return "piiririkkujalisamine/index";
    }
}
