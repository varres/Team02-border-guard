package ee.itcollege.team02.web;

import java.util.Date;
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

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.INTSIDENT;
import ee.itcollege.team02.entities.ISIKU_SEADUS_INTSIDENDIS;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.KODAKONDSUS;
import ee.itcollege.team02.entities.PIIRIRIKKUJA;

@RequestMapping("/intsidendigaseotudisikudetailideredaktor/**")
@Controller
public class IntsidendigaSeotudIsikuDetailideRedaktorController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

   // @RequestMapping(method = RequestMethod.POST, value = "{id}")
   // public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
   // }
    
    @RequestMapping(method = RequestMethod.POST)
    public String post(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) 
    {
		String kirjeldus = request.getParameter("kirjeldus")==null ? "" : request.getParameter("kirjeldus");
		String kommentaar = request.getParameter("kommentaar")==null ? "" : request.getParameter("kommentaar");
		Long id = Long.parseLong(request.getParameter("id")==null ? "0" : request.getParameter("id"));
		ISIK_INTSIDENDIS isiku_intsident = ISIK_INTSIDENDIS.findISIK_INTSIDENDIS(id);
		isiku_intsident.setKirjeldus(kirjeldus);
		isiku_intsident.setKommentaar(kommentaar);
		isiku_intsident.merge();
		
		return "redirect:/intsidendiredaktor/index?id=" + isiku_intsident.getIntsident().getId();		
    }
    
    @RequestMapping(params = "delete",method = RequestMethod.GET)
    public String deleteIsikIntsident(@RequestParam("delete") Long id, Model uiModel)
    {
    		ISIK_INTSIDENDIS isiku_intsident = ISIK_INTSIDENDIS.findISIK_INTSIDENDIS(id);
    		Long intsidentID = isiku_intsident.getIntsident().getId();
    		isiku_intsident.setSuletud(new Date());
    		isiku_intsident.merge();
    		
    		return "redirect:/intsidendiredaktor/index?id=" + intsidentID;
    }
    
    @RequestMapping(params = "modify",method = RequestMethod.GET)
    public void getIsikIntsident(@RequestParam("modify") Long id, Model uiModel)
    {
	    	ISIK_INTSIDENDIS isiku_intsident = ISIK_INTSIDENDIS.findISIK_INTSIDENDIS(id);
	    	INTSIDENT ints = isiku_intsident.getIntsident();
	    	PIIRIRIKKUJA piiririkkuja = isiku_intsident.getPiiririkkuja();
	    	String sugu = null;
	    	if(piiririkkuja.getSugu().equals("M")){
	    		sugu = "Mees";
	    	}else if(piiririkkuja.getSugu().equals("N")){
	    		sugu = "Naine";
	    	}
	    	Set<KODAKONDSUS> kodakons = piiririkkuja.getKODAKONDSUSs();
	    	
	    	List<ISIKU_SEADUS_INTSIDENDIS> seadused = ISIKU_SEADUS_INTSIDENDIS.findAllISIKU_SEADUS_INTSIDENDISs();
	    	for (int i = seadused.size() - 1; i >= 0; i--) 
	    	{ 
	    		ISIKU_SEADUS_INTSIDENDIS s = seadused.get(i);
	    	    if (!Helper.IsSurrogateDate(s.getSuletud())|| s.getIsik_intsidendis().getId() != id){ 
	    	    	seadused.remove(i); 
	    	    }    	
	    	} 

	    	uiModel.addAttribute("seadused", seadused);	    	
	        uiModel.addAttribute("isik_intsident", isiku_intsident);
	        uiModel.addAttribute("piiririkkuja", piiririkkuja);
	        uiModel.addAttribute("id", id);
	        uiModel.addAttribute("kodakons", kodakons);
	        uiModel.addAttribute("sugu", sugu);
	        uiModel.addAttribute("ints", ints);
    }

    @RequestMapping
    public String index() {
        return "intsidendigaseotudisikudetailideredaktor/index";
    }
}
