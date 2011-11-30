package ee.itcollege.team02.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
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

import ee.itcollege.team02.entities.ISIKU_SEADUS_INTSIDENDIS;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.KODAKONDSUS;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;

@RequestMapping("/isikuandmed/**")
@Controller
public class IsikuAndmedController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String post(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) 
    {
    	String eesnimi = request.getParameter("eesnimi")==null ? "" : request.getParameter("eesnimi");
    	String perenimi = request.getParameter("perenimi")==null ? "" : request.getParameter("perenimi");
    	String sugu = request.getParameter("sugu")==null ? "0" : request.getParameter("sugu");
    	if(sugu.equals("Mees")){
    		sugu = "M";
    	}else{
    		sugu = "N";
    	}
    	Date synd = null;
		try {
			synd = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("startDate")==null ? "" : request.getParameter("startDate"));
		}catch(Exception e){
			synd = new Date();
		}
		Long id = Long.parseLong(request.getParameter("id")==null ? "0" : request.getParameter("id"));
    	
		ISIK_INTSIDENDIS isik = ISIK_INTSIDENDIS.findISIK_INTSIDENDIS(id);
    	PIIRIRIKKUJA rikkuja = PIIRIRIKKUJA.findPIIRIRIKKUJA(isik.getPiiririkkuja().getId());
    	rikkuja.setEesnimi(eesnimi);
    	rikkuja.setPerek_nimi(perenimi);
    	rikkuja.setSugu(sugu);
    	rikkuja.setSynniaeg(synd);
    	rikkuja.setMuutja("test2");
    	rikkuja.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
    	rikkuja.merge();
    	
    	return "redirect:/intsidendigaseotudisikudetailideredaktor/index?modify=" + id;
    }

    @RequestMapping(params = "id", method = RequestMethod.GET)
    public void getIsikIntsident(@RequestParam("id") Long id, Model uiModel)
    {
    	ISIK_INTSIDENDIS isik = ISIK_INTSIDENDIS.findISIK_INTSIDENDIS(id);
    	PIIRIRIKKUJA rikkuja = isik.getPiiririkkuja();
    	Date synnipaev = rikkuja.getSynniaeg();
    	
    	uiModel.addAttribute("r", rikkuja);
    	uiModel.addAttribute("id", isik.getId());
    	//uiModel.addAttribute("synniaeg", synnipaev);
    }

    @RequestMapping
    public String index() {
        return "isikuandmed/index";
    }
}
