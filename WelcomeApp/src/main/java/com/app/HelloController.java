package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/get",method=RequestMethod.GET)
	public ModelAndView sayWelcome(){
		
		return new ModelAndView("welcome","msg","Welcome Mr. Ashish to the world of Spring");
	}
	
}
