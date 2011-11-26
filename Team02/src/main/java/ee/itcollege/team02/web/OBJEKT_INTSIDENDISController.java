package ee.itcollege.team02.web;

import ee.itcollege.team02.entities.OBJEKT_INTSIDENDIS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "objekt_intsidendiss", formBackingObject = OBJEKT_INTSIDENDIS.class)
@RequestMapping("/objekt_intsidendiss")
@Controller
public class OBJEKT_INTSIDENDISController {
}
