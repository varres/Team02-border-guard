package ee.itcollege.team02.web;

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
        return null;
    }
    
    @RequestMapping(params = "id", method = RequestMethod.GET)
    public void getIsikIntsident(@RequestParam("id") Long id, Model uiModel)
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
    	
    	Set<ISIKU_SEADUS_INTSIDENDIS> isiku_seadus = isiku_intsident.getISIKU_SEADUS_INTSIDENDISs();
    	
        uiModel.addAttribute("isik_intsident", isiku_intsident);
        uiModel.addAttribute("piiririkkuja", piiririkkuja);
        uiModel.addAttribute("id", id);
        uiModel.addAttribute("kodakons", kodakons);
        uiModel.addAttribute("sugu", sugu);
        uiModel.addAttribute("isiku_seadus", isiku_seadus);
        uiModel.addAttribute("ints", ints);

    }

    @RequestMapping
    public String index() {
        return "intsidendigaseotudisikudetailideredaktor/index";
    }
}
