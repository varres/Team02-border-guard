package ee.itcollege.team02.web;

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
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.OBJEKT_INTSIDENDIS;
import ee.itcollege.team02.entities.PIIRIVALVUR_INTSIDENDIS;
import ee.itcollege.team02.entities.VAHTKOND_INTSIDENDIS;

@RequestMapping("/intsidendiredaktor/**")
@Controller
public class IntsidendiRedaktorController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) 
    {
        
        
    }
  
    @RequestMapping(params = "id", method = RequestMethod.GET)
    public void getIntsident(@RequestParam("id") Long id, Model uiModel)
    {

    	INTSIDENT intsident = INTSIDENT.findINTSIDENT(id);
        uiModel.addAttribute("intsident", intsident);
        
        uiModel.addAttribute("isik_ins", ISIK_INTSIDENDIS.findIntsidentIsiks(intsident.getId()));
        uiModel.addAttribute("obj_ins", OBJEKT_INTSIDENDIS.findIntsidentObjects(intsident.getId()));
        uiModel.addAttribute("vaht_ins", VAHTKOND_INTSIDENDIS.findIntsidentVahtkonds(intsident.getId()));
        uiModel.addAttribute("piiriv_ins", PIIRIVALVUR_INTSIDENDIS.findIntsidentPiirivalvurs(intsident.getId()));
        
    }
    
    

    @RequestMapping
    public String index() 
    {
    	return "intsidendiredaktor/index";     
    }
}
