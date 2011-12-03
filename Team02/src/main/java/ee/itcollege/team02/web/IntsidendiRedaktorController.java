package ee.itcollege.team02.web;

import java.util.ArrayList;
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

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.INTSIDENT;
import ee.itcollege.team02.entities.ISIK_INTSIDENDIS;
import ee.itcollege.team02.entities.OBJEKT_INTSIDENDIS;
import ee.itcollege.team02.entities.PIIRILOIK;
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
        
        List<ISIK_INTSIDENDIS> isik_ins =  new ArrayList<ISIK_INTSIDENDIS>();
        for (ISIK_INTSIDENDIS current_isik_intsidendis : ISIK_INTSIDENDIS.findAllISIK_INTSIDENDISs()) {
     		if (current_isik_intsidendis.getIntsident().getId() == id){	        		
     			isik_ins.add(current_isik_intsidendis);	           		 
	       	}		
        } 	
        uiModel.addAttribute("isik_ins", isik_ins);
        
        List<OBJEKT_INTSIDENDIS> obj_ins =  new ArrayList<OBJEKT_INTSIDENDIS>();
        for (OBJEKT_INTSIDENDIS current_objekt_intsidendis : OBJEKT_INTSIDENDIS.findAllOBJEKT_INTSIDENDISs()) {
     		if (current_objekt_intsidendis.getIntsident().getId() == id){	        		
     			obj_ins.add(current_objekt_intsidendis);	           		 
	       	}		
        } 	
        uiModel.addAttribute("obj_ins", obj_ins);
        
        List<VAHTKOND_INTSIDENDIS> vaht_ins =  new ArrayList<VAHTKOND_INTSIDENDIS>();
        for (VAHTKOND_INTSIDENDIS current_vaht_intsidendis : VAHTKOND_INTSIDENDIS.findAllVAHTKOND_INTSIDENDISs()) {
     		if (current_vaht_intsidendis.getIntsident().getId() == id){	        		
     			vaht_ins.add(current_vaht_intsidendis);	           		 
	       	}		
        } 	
        uiModel.addAttribute("vaht_ins", vaht_ins);
        
        List<PIIRIVALVUR_INTSIDENDIS> piiriv_ins =  new ArrayList<PIIRIVALVUR_INTSIDENDIS>();
        for (PIIRIVALVUR_INTSIDENDIS current_piiriv_intsidendis : PIIRIVALVUR_INTSIDENDIS.findAllPIIRIVALVUR_INTSIDENDISs()) {
     		if (current_piiriv_intsidendis.getIntsident().getId() == id){	        		
     			piiriv_ins.add(current_piiriv_intsidendis);	           		 
	       	}		
        } 	
        uiModel.addAttribute("piiriv_ins", piiriv_ins);
        
    }
    
    

    @RequestMapping
    public String index() 
    {
    	return "intsidendiredaktor/index";     
    }
}
