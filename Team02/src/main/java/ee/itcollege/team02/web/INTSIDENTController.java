package ee.itcollege.team02.web;

import ee.itcollege.team02.entities.INTSIDENT;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "intsidents", formBackingObject = INTSIDENT.class)
@RequestMapping("/intsidents")
@Controller
public class INTSIDENTController {
}
