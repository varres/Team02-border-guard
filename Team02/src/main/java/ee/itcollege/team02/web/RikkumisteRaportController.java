package ee.itcollege.team02.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
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
import ee.itcollege.team02.common.Raport;
import ee.itcollege.team02.entities.*;

@RequestMapping("/rikkumisteraport/**")
@Controller
public class RikkumisteRaportController {

    @RequestMapping
    public void get(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    	
    	Long piiriloik_ID = Long.parseLong(request.getParameter("piiriloik")==null ? "0" : request.getParameter("piiriloik"));
    	
    	Date algus = null, lopp = null;
		try {
			algus = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("startDate")==null ? "" : request.getParameter("startDate"));
			lopp = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("endDate")==null ? "" : request.getParameter("endDate"));
		} catch (ParseException e) {
			algus = new Date();
			lopp = new Date();
			e.printStackTrace();
		}
		
    	List<INTSIDENT> intsidendid = INTSIDENT.findAllINTSIDENTS();
    	for (int i = intsidendid.size() - 1; i >= 0; i--) 
    	{ 
    		INTSIDENT ints = intsidendid.get(i);
    	    if (!Helper.IsSurrogateDate(ints.getSuletud()) || algus.compareTo(ints.getToimumise_algus()) > 0 || lopp.compareTo(ints.getToimumise_lopp()) < 0 || ints.getPiiriloik().getId() != piiriloik_ID){ 
    	    	intsidendid.remove(i); 
    	    }    	
    	} 
    	
    	List<SEADUS> seadus = SEADUS.findAllSEADUS();
    	for (int i = seadus.size() - 1; i >= 0; i--) 
    	{ 
    		SEADUS tempSeadus = seadus.get(i);
    	    if (!Helper.IsSurrogateDate(tempSeadus.getSuletud())){ 
    	    	seadus.remove(i); 
    	    }    	
    	} 	
    	
    	List<PIIRILOIK> piiriloigud = PIIRILOIK.findAllPIIRILOIKS();
    	for (int i = piiriloigud.size() - 1; i >= 0; i--) 
    	{ 
    		PIIRILOIK loik = piiriloigud.get(i);
    	    if (!Helper.IsSurrogateDate(loik.getSuletud())){ 
    	    	piiriloigud.remove(i); 
    	    }    	
    	} 
    	modelMap.addAttribute("piiriloigud", piiriloigud);
		
		
		
		modelMap.addAttribute("seadus", seadus);
		modelMap.addAttribute("intsidendid", intsidendid); 
		
		return "rikkumisteraport/index";
    }
    
    @RequestMapping
    public String index(Model uiModel) {
    	
    	List<INTSIDENT> intsidendid = INTSIDENT.findAllINTSIDENTS();
    	if(intsidendid.size() == 0){
    		Helper.addAndmed();
    	}
    	
    	List<PIIRILOIK> piiriloigud = PIIRILOIK.findAllPIIRILOIKS();
    	for (int i = piiriloigud.size() - 1; i >= 0; i--) 
    	{ 
    		PIIRILOIK loik = piiriloigud.get(i);
    	    if (!Helper.IsSurrogateDate(loik.getSuletud())){ 
    	    	piiriloigud.remove(i); 
    	    }    	
    	} 
    	uiModel.addAttribute("piiriloigud", piiriloigud);
    	
    	List<Raport> raps = new ArrayList<Raport>();
    	Raport rap = new Raport();
    	List<SEADUS> seadus = SEADUS.findAllSEADUS();
    	for (int i = seadus.size() - 1; i >= 0; i--) 
    	{ 
    		SEADUS tempSeadus = seadus.get(i);
    	    if (!Helper.IsSurrogateDate(tempSeadus.getSuletud())){ 
    	    	seadus.remove(i); 
    	    }    	
    	} 
    	
    	rap.seadus = seadus.get(0);
    	rap.intsidendid = intsidendid;
    	raps.add(rap);
    	uiModel.addAttribute("rap", raps);
    	
        return "rikkumisteraport/index";
    }
    
   
    


}
