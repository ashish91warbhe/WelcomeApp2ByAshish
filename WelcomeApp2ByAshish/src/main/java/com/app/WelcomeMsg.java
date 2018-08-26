package com.app;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeMsg {
private static Logger log=
            Logger.getLogger(WelcomeMsg.class);
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public ModelAndView sayWelcome(){
		log.info("Method started");
		Layout layout=new HTMLLayout();
		//Layout layout= new PatternLayout("%d %c %M %m %l %n");
		Appender ap = null;
		try 
		{
			ap = new FileAppender(layout,"D:/log4j/app2.log");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		log.addAppender(ap);
		
		//log messages
		log.debug("i am form debug");
		log.info("i am from info");
		log.warn("i am from warn");
		log.error("i  am from error");
		log.fatal("i am from fatal");
		return new ModelAndView("welcome","msg","Welcome Mr. Ashish to the world of Spring");
	
        
	}
	
}
