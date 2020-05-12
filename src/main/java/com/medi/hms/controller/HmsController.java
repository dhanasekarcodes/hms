package com.medi.hms.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/start")
public class HmsController {
	
	
	@RequestMapping(value="/**", method = RequestMethod.GET)
    public String home1() {
		return "home";
    }
	
	
	
	
	
	
	
}
