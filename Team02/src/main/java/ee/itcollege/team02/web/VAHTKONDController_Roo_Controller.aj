// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.team02.web;

import ee.itcollege.team02.entities.VAHTKOND;
import ee.itcollege.team02.entities.VAHTKOND_INTSIDENDIS;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect VAHTKONDController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String VAHTKONDController.create(@Valid VAHTKOND VAHTKOND, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("VAHTKOND", VAHTKOND);
            addDateTimeFormatPatterns(uiModel);
            return "vahtkonds/create";
        }
        uiModel.asMap().clear();
        VAHTKOND.persist();
        return "redirect:/vahtkonds/" + encodeUrlPathSegment(VAHTKOND.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String VAHTKONDController.createForm(Model uiModel) {
        uiModel.addAttribute("VAHTKOND", new VAHTKOND());
        addDateTimeFormatPatterns(uiModel);
        return "vahtkonds/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String VAHTKONDController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("vahtkond", VAHTKOND.findVAHTKOND(id));
        uiModel.addAttribute("itemId", id);
        return "vahtkonds/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String VAHTKONDController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("vahtkonds", VAHTKOND.findVAHTKONDEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) VAHTKOND.countVAHTKONDS() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("vahtkonds", VAHTKOND.findAllVAHTKONDS());
        }
        addDateTimeFormatPatterns(uiModel);
        return "vahtkonds/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String VAHTKONDController.update(@Valid VAHTKOND VAHTKOND, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("VAHTKOND", VAHTKOND);
            addDateTimeFormatPatterns(uiModel);
            return "vahtkonds/update";
        }
        uiModel.asMap().clear();
        VAHTKOND.merge();
        return "redirect:/vahtkonds/" + encodeUrlPathSegment(VAHTKOND.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String VAHTKONDController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("VAHTKOND", VAHTKOND.findVAHTKOND(id));
        addDateTimeFormatPatterns(uiModel);
        return "vahtkonds/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String VAHTKONDController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        VAHTKOND.findVAHTKOND(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/vahtkonds";
    }
    
    @ModelAttribute("vahtkonds")
    public Collection<VAHTKOND> VAHTKONDController.populateVAHTKONDS() {
        return VAHTKOND.findAllVAHTKONDS();
    }
    
    @ModelAttribute("vahtkond_intsidendiss")
    public Collection<VAHTKOND_INTSIDENDIS> VAHTKONDController.populateVAHTKOND_INTSIDENDISs() {
        return VAHTKOND_INTSIDENDIS.findAllVAHTKOND_INTSIDENDISs();
    }
    
    void VAHTKONDController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("VAHTKOND_avatud_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("VAHTKOND_muudetud_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("VAHTKOND_suletud_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("VAHTKOND_alates_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("VAHTKOND_kuni_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    String VAHTKONDController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
