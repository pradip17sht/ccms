package com.ccms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ccms.domain.CrdBranch;
import com.ccms.domain.CrdTraffic;
import com.ccms.service.CrdTrafficService;
import com.ccms.validation.Validation;
import com.ccms.validation.ValidationCase;

@Controller
public class CrdTrafficController {
	@Autowired
	CrdTrafficService crdTrafficService;
	
	@Autowired
	private Validation validation;
	
	@RequestMapping(value = "/addTraffic", method = RequestMethod.GET)
	public ModelAndView addTraffic(){
		ModelAndView mv = new ModelAndView("crdTraffic/addTraffic");
		CrdTraffic traffics = new CrdTraffic();
		mv.addObject("traffics",traffics);
		return mv;
	}
	
	@RequestMapping(value = "/addTraffic", method = RequestMethod.POST)
	public ModelAndView addTraffic(@Validated @ModelAttribute("traffics") CrdTraffic crdTraffic, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView();
		crdTraffic.setStatus("normal");
		if(validation.validateCrdTraffic(crdTraffic, bindingResult, ValidationCase.SAVE).hasErrors()){
			mv.setViewName("crdTraffic/addTraffic");
			return mv;
		}
		crdTrafficService.saveOrUpdate(crdTraffic);
		mv.setViewName("redirect:/listTraffic");
		return mv;
	}
	
	@RequestMapping(value = "/editTraffic", method = RequestMethod.POST)
	public ModelAndView editTraffic(@RequestParam(name = "trafficId", required = true) Integer trafficId) {
		ModelAndView mv = new ModelAndView("crdTraffic/editTraffic");
		CrdTraffic traffic = crdTrafficService.findOne(trafficId);
		mv.addObject("traffics", traffic);
		return mv;
	}
	
	@RequestMapping(value = "/updateTraffic", method = RequestMethod.POST)
	public ModelAndView updateTraffic(@Validated @ModelAttribute("traffics") CrdTraffic crdTraffic, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView();
		crdTraffic.setStatus("normal");
		if(validation.validateCrdTraffic(crdTraffic, bindingResult, ValidationCase.EDIT).hasErrors()){
			mv.setViewName("crdTraffic/editTraffic");
			return mv;
		}
		crdTrafficService.saveOrUpdate(crdTraffic);
		mv.setViewName("redirect:/listTraffic");
		return mv;
	}
	
	@RequestMapping(value = "/listTraffic", method = RequestMethod.GET)
	public ModelAndView listTraffic(){
		List<CrdTraffic> traffics = crdTrafficService.findAll();
		ModelAndView mv = new ModelAndView("crdTraffic/listTraffic");
		mv.addObject("traffics", traffics);
		return mv;
	}
	
	@RequestMapping(value = "/deleteTraffic", method = RequestMethod.GET)
	public String deleteTraffic(@RequestParam(name = "trafficId", required = true) Integer trafficId) {
		crdTrafficService.delete(trafficId);	
		return "redirect:/listTraffic";
	}
}
