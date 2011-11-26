package ee.itcollege.team02.web;

import ee.itcollege.team02.entities.KODAKONDSUS;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "kodakondsus", formBackingObject = KODAKONDSUS.class)
@RequestMapping("/kodakondsus")
@Controller
public class KODAKONDSUSController {
}
