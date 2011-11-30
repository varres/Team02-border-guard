package ee.itcollege.team02.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.ISIKU_SEADUS_INTSIDENDIS;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.SEADUSE_PUNKT;

@RequestMapping("/muudaseadust/**")
@Controller
public class MuudaSeadustController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) 
    {
    	String kirjeldus = request.getParameter("kirjeldus")==null ? "" : request.getParameter("kirjeldus");
    	String kommentaar = request.getParameter("kommentaar")==null ? "" : request.getParameter("kommentaar");
    	Date alates = null, kuni = null;
		try {
			alates = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("alates")==null ? "" : request.getParameter("alates"));
			kuni = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("kuni")==null ? "" : request.getParameter("kuni"));
		}catch(Exception e){}
		Long id = Long.parseLong(request.getParameter("id")==null ? "0" : request.getParameter("id"));
		Long seadus_ID = Long.parseLong(request.getParameter("seadus")==null ? "0" : request.getParameter("seadus"));
   
		ISIKU_SEADUS_INTSIDENDIS seadus = ISIKU_SEADUS_INTSIDENDIS.findISIKU_SEADUS_INTSIDENDIS(id);
		seadus.setKirjeldus(kirjeldus);
		seadus.setKommentaar(kommentaar);
		seadus.setAlates(alates);
		seadus.setKuni(kuni);
		seadus.setIsik_intsidendis(ISIK_INTSIDENDIS.findISIK_INTSIDENDIS(id));
		seadus.setSeaduse_punkt(SEADUSE_PUNKT.findSEADUSE_PUNKT(seadus_ID));
		seadus.setAvaja("test");
		seadus.setAvatud(new Date());
		seadus.setMuutja("test2");
		seadus.setMuudetud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
		seadus.setSulgeja("test3");
		seadus.setSuletud(new GregorianCalendar(9999, 01, 01, 00, 00).getTime());
		seadus.persist();
		
    	
    	return "redirect:/intsidendigaseotudisikudetailideredaktor/modify?id=" + ISIK_INTSIDENDIS.findISIK_INTSIDENDIS(id).getId();
    }
    
    @RequestMapping(params = "id", method = RequestMethod.GET)
    public void InsertRule(@RequestParam("id") Long id, Model uiModel)
    {
    	List<SEADUSE_PUNKT> seadus = SEADUSE_PUNKT.findAllSEADUSE_PUNKTs();
    	for (int i = seadus.size() - 1; i >= 0; i--) 
    	{ 
    		SEADUSE_PUNKT loik = seadus.get(i);
    	    if (!Helper.IsSurrogateDate(loik.getSuletud())){ 
    	    	seadus.remove(i); 
    	    }    	
    	} 

    	uiModel.addAttribute("seadus", seadus);
    	uiModel.addAttribute("id", id);
    }

    @RequestMapping
    public String index() {
        return "muudaseadust/index";
    }
}
