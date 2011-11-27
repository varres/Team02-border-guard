package ee.itcollege.team02.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
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

import ee.itcollege.team02.common.Helper;
import ee.itcollege.team02.entities.INTSIDENDI_LIIK;
import ee.itcollege.team02.entities.PIIRILOIK;

@RequestMapping("/intsidendiregistreerimine/**")
@Controller
public class IntsidendiRegistreerimineController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    	
    }

    @RequestMapping
    public String index(Model uiModel) {		
    	List<PIIRILOIK> piiriloigud = PIIRILOIK.findAllPIIRILOIKS();
    	for (int i = piiriloigud.size() - 1; i >= 0; i--) 
    	{ 
    		PIIRILOIK loik = piiriloigud.get(i); 
    	    //if (!Helper.IsSurrogateDate(loik.getSuletud())){ 
    	    //	piiriloigud.remove(i); 
    	    //}    	    
    	} 

    	uiModel.addAttribute("piiriloigud", piiriloigud);
    	
    	List<INTSIDENDI_LIIK> liigid = INTSIDENDI_LIIK.findAllINTSIDENDI_LIIKs();
    	uiModel.addAttribute("liik", liigid);
        return "intsidendiregistreerimine/index";
    }
}
