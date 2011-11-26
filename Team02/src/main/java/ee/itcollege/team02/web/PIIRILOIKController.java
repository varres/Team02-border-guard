package ee.itcollege.team02.web;

import ee.itcollege.team02.entities.PIIRILOIK;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piiriloiks", formBackingObject = PIIRILOIK.class)
@RequestMapping("/piiriloiks")
@Controller
public class PIIRILOIKController {
}
