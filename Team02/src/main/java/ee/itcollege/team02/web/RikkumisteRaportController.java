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

    	
    	List<Raport> raps = new ArrayList<Raport>();
    	
    	List<ISIKU_SEADUS_INTSIDENDIS> isis = ISIKU_SEADUS_INTSIDENDIS.findAllISIKU_SEADUS_INTSIDENDISs();
      	for (int i = isis.size() - 1; i >= 0; i--) 
    	{ 
      		ISIKU_SEADUS_INTSIDENDIS isi = isis.get(i);
      		if(Helper.IsSurrogateDate(isi.getSeaduse_punkt().getSuletud()) && Helper.IsSurrogateDate(isi.getSeaduse_punkt().getSeadus().getSuletud())){
      			SEADUS se = isi.getSeaduse_punkt().getSeadus();
      			boolean onOlemas = false;
      			Raport hetkeRaport = null;
      			for(Raport ra: raps){
      				if(ra.seadus.getId() == se.getId()){
      					onOlemas = true;
      					hetkeRaport = ra;      					
      					break;
      				}
      			}
      			if(!onOlemas){
      				hetkeRaport = new Raport();
      				hetkeRaport.seadus = se;
      				hetkeRaport.intsidendid = new ArrayList<INTSIDENT>();
      				raps.add(hetkeRaport);
      			}
      			
      			if(Helper.IsSurrogateDate(isi.getIsik_intsidendis().getSuletud()) && Helper.IsSurrogateDate(isi.getIsik_intsidendis().getIntsident().getSuletud())){
      			
      				INTSIDENT ints = isi.getIsik_intsidendis().getIntsident();
      				boolean intsidentOlemas = false;
      				for(INTSIDENT in: hetkeRaport.intsidendid){
      					if(in.getId() == ints.getId()){
      						intsidentOlemas = true;
      						break;
      					}
      				}
      				if(!intsidentOlemas && (algus.after(ints.getToimumise_algus()) || lopp.before(ints.getToimumise_algus())) 
      						&& ints.getPiiriloik().getId() == piiriloik_ID){
      					hetkeRaport.intsidendid.add(ints);
      				}
      			}
      		}      		 	
    	}
      	for(Raport rapo: raps){
      		rapo.count = rapo.intsidendid.size();
      	}
      	modelMap.addAttribute("rap", raps);	
    	
    	List<PIIRILOIK> piiriloigud = PIIRILOIK.findAllPIIRILOIKS();
    	modelMap.addAttribute("piiriloigud", piiriloigud);
		
		return "rikkumisteraport/index";
    }
    
    @RequestMapping
    public String index(Model uiModel) {
       	List<INTSIDENT> intsidendid = INTSIDENT.findAllINTSIDENTS();
    	if(intsidendid.size() == 0){
    		Helper.addAndmed();
    	}
    	
    	List<Raport> raps = new ArrayList<Raport>();
    	
    	List<ISIKU_SEADUS_INTSIDENDIS> isis = ISIKU_SEADUS_INTSIDENDIS.findAllISIKU_SEADUS_INTSIDENDISs();
      	for (int i = isis.size() - 1; i >= 0; i--) 
    	{ 
      		ISIKU_SEADUS_INTSIDENDIS isi = isis.get(i);
      		if(Helper.IsSurrogateDate(isi.getSeaduse_punkt().getSuletud()) && Helper.IsSurrogateDate(isi.getSeaduse_punkt().getSeadus().getSuletud())){
      			SEADUS se = isi.getSeaduse_punkt().getSeadus();
      			boolean onOlemas = false;
      			Raport hetkeRaport = null;
      			for(Raport ra: raps){
      				if(ra.seadus.getId() == se.getId()){
      					onOlemas = true;
      					hetkeRaport = ra;      					
      					break;
      				}
      			}
      			if(!onOlemas){
      				hetkeRaport = new Raport();
      				hetkeRaport.seadus = se;
      				hetkeRaport.intsidendid = new ArrayList<INTSIDENT>();
      				raps.add(hetkeRaport);
      			}
      			
      			if(Helper.IsSurrogateDate(isi.getIsik_intsidendis().getSuletud()) && Helper.IsSurrogateDate(isi.getIsik_intsidendis().getIntsident().getSuletud())){
      			
      				INTSIDENT ints = isi.getIsik_intsidendis().getIntsident();
      				boolean intsidentOlemas = false;
      				for(INTSIDENT in: hetkeRaport.intsidendid){
      					if(in.getId() == ints.getId()){
      						intsidentOlemas = true;
      						break;
      					}
      				}
      				if(!intsidentOlemas){
      					hetkeRaport.intsidendid.add(ints);
      				}
      			}
      		}      		 	
    	}
      	for(Raport rapo: raps){
      		rapo.count = rapo.intsidendid.size();
      	}
      	
    	uiModel.addAttribute("rap", raps);
    	
     	List<PIIRILOIK> piiriloigud = PIIRILOIK.findAllPIIRILOIKS();
    	uiModel.addAttribute("piiriloigud", piiriloigud);
    	
        return "rikkumisteraport/index";        
    }
    
   
    


}
