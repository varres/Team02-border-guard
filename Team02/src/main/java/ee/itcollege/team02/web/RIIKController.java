package ee.itcollege.team02.web;

import ee.itcollege.team02.entities.RIIK;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "riiks", formBackingObject = RIIK.class)
@RequestMapping("/riiks")
@Controller
public class RIIKController {
}
