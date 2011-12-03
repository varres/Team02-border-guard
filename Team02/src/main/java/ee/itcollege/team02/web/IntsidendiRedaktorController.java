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
    	boolean testAddAll = true;
    	
    	
    	
    	INTSIDENT intsident = INTSIDENT.findINTSIDENT(id);
        uiModel.addAttribute("intsident", intsident);
        
        List<ISIK_INTSIDENDIS> isik_ins =  new ArrayList<ISIK_INTSIDENDIS>();

        for (ISIK_INTSIDENDIS current_isik_intsidendis : ISIK_INTSIDENDIS.findAllISIK_INTSIDENDISs()) {
        
        	if (testAddAll) {
        		
        		isik_ins.add(current_isik_intsidendis);
        		
        	} else {
        		
	        		if (current_isik_intsidendis.getIntsident().getId() == id){
	           		 
	           		 System.out.println("Triggeris isik_ins.add(current_isik_intsidendis)");
	           		 
	           		 isik_ins.add(current_isik_intsidendis);
	        		}
        		
        	} // end if (testAddAll) {
        	
    	
        } // end for 
        
//    	List<ISIK_INTSIDENDIS> isik_ins = ISIK_INTSIDENDIS.findAllISIK_INTSIDENDISs();
//    	for (int i = isik_ins.size() - 1; i >= 0; i--) 
//    	{ 
//    		ISIK_INTSIDENDIS ints = isik_ins.get(i);
//    		
//    		System.out.println("(Helper.isClosed: " + Helper.isClosed(ints.getSuletud()) + " ja ints.getIntsident().getId()" + ints.getIntsident().getId() + "!= id " + id);
//    		
//    	    if (Helper.isClosed(ints.getSuletud())|| ints.getIntsident().getId() != id){ 
//    	    		
//    	    	System.out.println("Piiririkkuja " + ints.getPiiririkkuja().getEesnimi() + " Triggeris remove");
//    	    	isik_ins.remove(i); 
//    	    } else {
//    	    	
//    	    	System.out.println("Piiririkkuja " + ints.getPiiririkkuja().getEesnimi() + " Ei triggerinud remove");	    	
//    	    }   	
//    	} 

    	uiModel.addAttribute("isik_ins", isik_ins);
  
    	
    	List<OBJEKT_INTSIDENDIS> legalObjects = new ArrayList<OBJEKT_INTSIDENDIS>();
    	  	 
    	
    	for (OBJEKT_INTSIDENDIS current_object_intsidendis : OBJEKT_INTSIDENDIS.findAllOBJEKT_INTSIDENDISs()) {
    		

    		if (testAddAll) {
    			
    				legalObjects.add(current_object_intsidendis);
    				
    		} else {
		    		 if (current_object_intsidendis.getIntsident().getId() == id){
		    			 
		    			 System.out.println("Triggeris legalObjects.add(current_object_intsidendis)");
		    			 
		    			 legalObjects.add(current_object_intsidendis);			 
		    		 } // end if (!Helper.isClosed(
		    		 
    		} // end if (testAddAll)
    		
    	} // end for
    	
    	uiModel.addAttribute("obj_ins", legalObjects);
    	
    }

    @RequestMapping
    public String index() 
    {
    	// Helper.addAndmed();
    	return "redirect:/intsidendiredaktor/index?id=" + 2;
       //  return "intsidendiredaktor/index?id=" + 2;
    }
}
