package com.ccms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ccms.domain.CisStatusCode;
import com.ccms.service.CisStatusCodeService;
import com.ccms.validation.Validation;

@Controller
public class CisStatusCodeController {

	@Autowired
	private CisStatusCodeService cisStatusCodeService;
	
	@Autowired
	private Validation validation;

	@RequestMapping(value = "/addStatusCode", method = RequestMethod.GET)
	public ModelAndView addStatusCode(){
		ModelAndView mv = new ModelAndView("cisStatusCode/addStatusCode");
		CisStatusCode statusCode = new CisStatusCode();
		mv.addObject("statusCode", statusCode);
		return mv;
	}
	@RequestMapping(value = "/addStatusCode", method = RequestMethod.POST)
	public ModelAndView addStatusCode(@ModelAttribute("statusCode") CisStatusCode statusCode){
		ModelAndView mv = new ModelAndView("redirect:/listStatusCode");
		cisStatusCodeService.saveOrUpdate(statusCode);
		return mv;
	}

	
	@RequestMapping(value = "/editStatusCode", method = RequestMethod.POST)
	public ModelAndView editStatusCode(@RequestParam(name = "statusCodeId", required = true) Integer statusCodeId) {
		ModelAndView mv = new ModelAndView("cisStatusCode/editStatusCode");
		CisStatusCode statusCode = cisStatusCodeService.findOne(statusCodeId);
		mv.addObject("statusCode", statusCode);
		return mv;
	}

	@RequestMapping(value = "/updatestatusCode", method = RequestMethod.POST)
	public ModelAndView updatestatusCode(@ModelAttribute("statusCode") CisStatusCode cisStatusCode){
		ModelAndView mv = new ModelAndView();
		cisStatusCodeService.saveOrUpdate(cisStatusCode);
		mv.setViewName("redirect:/listStatusCode");
		return mv;
	}


	@RequestMapping(value = "/listStatusCode", method = RequestMethod.GET)
	public ModelAndView listStatusCode(){
		List<CisStatusCode> statusCode = cisStatusCodeService.findAll();
		ModelAndView mv = new ModelAndView("cisStatusCode/listStatusCode");
		mv.addObject("statusCode", statusCode);
		return mv;
	}

	
	@RequestMapping(value = "/deletestatusCode", method = RequestMethod.GET)
	public String deletestatusCode(@RequestParam(name = "statusCodeId", required = true) Integer statusCodeId) {
		cisStatusCodeService.delete(statusCodeId);	
		return "redirect:/listStatusCode";
	}
}