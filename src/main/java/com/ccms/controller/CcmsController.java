package com.ccms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CcmsController {
	
	 @RequestMapping(value = "/demo", method = RequestMethod.GET)
	    public String sayHelloAgain(ModelMap model) {
		 System.out.println("header.jsp");
	        return "ccms";
	    }
}
