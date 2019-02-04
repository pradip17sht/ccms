package com.ccms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ccms.domain.CrdMember;

@Controller
public class CrdMemberController {

	@RequestMapping(value = "/addCrdMember", method = RequestMethod.GET)
	public ModelAndView addCrdMember(){
		ModelAndView mv = new ModelAndView();
		CrdMember member = new CrdMember();
		mv.addObject("members", member);
		mv.setViewName("crdMember/addMember");
		return mv;
		
	}
}
