package com.ccms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ccms.domain.AtmDetail;
import com.ccms.domain.CisStatusCode;
import com.ccms.service.AtmDetailService;

@Controller
public class AtmDetailController {

	@Autowired
	private AtmDetailService atmDetailService;
	
	@RequestMapping(value = "/addAtmDetail", method = RequestMethod.GET)
	private ModelAndView addAtmDetail(){
		ModelAndView mv = new ModelAndView("atmDetail/addAtmDetail");
		AtmDetail atmDetail = new AtmDetail();
		mv.addObject("atmDetail", atmDetail);
		return mv;
	}
	@RequestMapping(value ="/addAtmDetail", method = RequestMethod.POST)
	private ModelAndView addAtmDetail(@ModelAttribute("atmDetail") AtmDetail atmDetail){
		ModelAndView mv = new ModelAndView("redirect:/listAtmDetail");
		atmDetailService.saveOrUpdate(atmDetail);
		return mv;
	}
	
	@RequestMapping(value = "/editAtmDetail", method = RequestMethod.POST)
	public ModelAndView editAtmDetail(@RequestParam(name = "id", required = true) Integer id) {
		ModelAndView mv = new ModelAndView("atmDetail/editAtmDetail");
		AtmDetail atmDetail = atmDetailService.findOne(id);
		mv.addObject("atmDetail", atmDetail);
		return mv;
	}

	@RequestMapping(value = "/updateatmDetail", method = RequestMethod.POST)
	public ModelAndView updateatmDetail(@ModelAttribute("atmDetail") AtmDetail atmDetail){
		ModelAndView mv = new ModelAndView();
		atmDetailService.saveOrUpdate(atmDetail);
		mv.setViewName("redirect:/listAtmDetail");
		return mv;
	}
	
	
	@RequestMapping(value = "/listAtmDetail", method = RequestMethod.GET)
	public ModelAndView listAtmDetail(){
		List<AtmDetail> atmDetail = atmDetailService.findAll();
		ModelAndView mv = new ModelAndView("atmDetail/listAtmDetail");
		mv.addObject("atmDetail", atmDetail);
		return mv;
	}
	
	@RequestMapping(value = "/deleteatmDetail", method = RequestMethod.GET)
	public String deleteatmDetail(@RequestParam(name = "id", required = true) Integer id) {
		atmDetailService.delete(id);	
		return "redirect:/listAtmDetail";
	}
}
