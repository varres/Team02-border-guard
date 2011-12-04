package ee.itcollege.team02.web;

import java.text.ParseException;
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
		Long id = Long.parseLong(request.getParameter("id")==null ? "0" : request.getParameter("id"));
		Long seadus_ID = Long.parseLong(request.getParameter("seadus")==null ? "0" : request.getParameter("seadus"));
   
		ISIKU_SEADUS_INTSIDENDIS seadus = ISIKU_SEADUS_INTSIDENDIS.findISIKU_SEADUS_INTSIDENDIS(id);
		seadus.setKirjeldus(kirjeldus);
		seadus.setKommentaar(kommentaar);
		seadus.setAlates(new Date());
		try {
			seadus.setKuni(new SimpleDateFormat("yyyy-MM-dd").parse("9999-12-31"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		seadus.setSeaduse_punkt(SEADUSE_PUNKT.findSEADUSE_PUNKT(seadus_ID));
		seadus.merge();
		
    	
    	return "redirect:/intsidendigaseotudisikudetailideredaktor/index?modify=" + seadus.getIsik_intsidendis().getId();
    }
    
    @RequestMapping(params = "delete",method = RequestMethod.GET)
    public String deleteSeadus(@RequestParam("delete") Long id, Model uiModel)
    {
    		ISIKU_SEADUS_INTSIDENDIS seadus = ISIKU_SEADUS_INTSIDENDIS.findISIKU_SEADUS_INTSIDENDIS(id);
    		Long intsidentID = seadus.getIsik_intsidendis().getId();
    		seadus.setKuni(new Date());
    		seadus.setSuletud(new Date());
    		seadus.merge();
    		
    		return "redirect:/intsidendigaseotudisikudetailideredaktor/index?modify=" + intsidentID;
    }
    
    @RequestMapping(params = "id", method = RequestMethod.GET)
    public void ShowRule(@RequestParam("id") Long id, Model uiModel)
    {
    	List<SEADUSE_PUNKT> seadus = SEADUSE_PUNKT.findAllSEADUSE_PUNKTs();
    	for (int i = seadus.size() - 1; i >= 0; i--) 
    	{ 
    		SEADUSE_PUNKT punkt = seadus.get(i);
    	    if (!Helper.IsSurrogateDate(punkt.getSuletud())){ 
    	    	seadus.remove(i); 
    	    }    	
    	} 
    	
    	ISIKU_SEADUS_INTSIDENDIS isk_seadus = ISIKU_SEADUS_INTSIDENDIS.findISIKU_SEADUS_INTSIDENDIS(id);

    	uiModel.addAttribute("seadus", seadus);
    	uiModel.addAttribute("isk_seadus", isk_seadus);
    	uiModel.addAttribute("id", id);
    	uiModel.addAttribute("backID", isk_seadus.getIsik_intsidendis().getId());
    	
    }

    @RequestMapping
    public String index() {
        return "muudaseadust/index";
    }
}
