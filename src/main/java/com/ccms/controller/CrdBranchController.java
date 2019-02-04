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
import com.ccms.service.CrdBranchService;
import com.ccms.validation.Validation;
import com.ccms.validation.ValidationCase;


@Controller
public class CrdBranchController {
	
	@Autowired
	private CrdBranchService crdBranchService;
	
	@Autowired
	private Validation validation;
	
	@RequestMapping(value = "/addBranch", method = RequestMethod.GET)
	public ModelAndView addBranch(){
		ModelAndView mv = new ModelAndView("crdBranch/addBranch");
		CrdBranch branches = new CrdBranch();
		mv.addObject("branches",branches);
		return mv;
	}
	
	@RequestMapping(value = "/addBranch", method = RequestMethod.POST)
	public ModelAndView addBranch(@Validated @ModelAttribute("branches") CrdBranch crdBranch, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView();
		if(validation.validateCrdBranch(crdBranch, bindingResult, ValidationCase.SAVE).hasErrors()){
			mv.setViewName("crdBranch/addBranch");
			return mv;
		}
		crdBranchService.saveOrUpdate(crdBranch);
		mv.setViewName("redirect:/listBranch");
		return mv;
	}
	
	@RequestMapping(value = "/editBranch", method = RequestMethod.POST)
	public ModelAndView editBranch(@RequestParam(name = "branchId", required = true) Integer branchId) {
		ModelAndView mv = new ModelAndView("crdBranch/editBranch");
		CrdBranch branch = crdBranchService.findOne(branchId);
		mv.addObject("branches", branch);
		return mv;
	} 
	
	@RequestMapping(value = "/updateBranch", method = RequestMethod.POST)
	public ModelAndView updateBranch(@Validated @ModelAttribute("branches") CrdBranch crdBranch, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView();
		if(validation.validateCrdBranch(crdBranch, bindingResult, ValidationCase.EDIT).hasErrors()){
			mv.setViewName("crdBranch/editBranch");
			return mv;
		}
		crdBranchService.saveOrUpdate(crdBranch);
		mv.setViewName("redirect:/listBranch");
		return mv;
	}
	
	@RequestMapping(value = "/listBranch", method = RequestMethod.GET)
	public ModelAndView listBranch(){
		List<CrdBranch> branches = crdBranchService.findAll();
		ModelAndView mv = new ModelAndView("crdBranch/listBranch");
		mv.addObject("branches", branches);
		return mv;
	}
	
	@RequestMapping(value = "/deleteBranch", method = RequestMethod.GET)
	public String deleteGroup(@RequestParam(name = "branchId", required = true) Integer branchId) {
		crdBranchService.delete(branchId);	
		return "redirect:/listBranch";
	}
}
