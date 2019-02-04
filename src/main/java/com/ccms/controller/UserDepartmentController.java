package com.ccms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import com.ccms.domain.UserDepartment;
import com.ccms.service.CrdBranchService;
import com.ccms.service.UserDepartmentService;
import com.ccms.validation.Validation;
import com.ccms.validation.ValidationCase;

@Controller
public class UserDepartmentController {

	@Autowired
	private UserDepartmentService userDepartmentService;

	@Autowired
	private CrdBranchService crdBranchService;

	@Autowired
	private Validation validation;

	@RequestMapping(value = "/addDepartment", method = RequestMethod.GET)
	public ModelAndView addDepartment() {
		ModelAndView mv = new ModelAndView("department/addDepartment");
		UserDepartment departments = new UserDepartment();
		mv.addObject("departments", departments);
		List<CrdBranch> branches = crdBranchService.findAll();
		mv.addObject("branches", branches);
		return mv;
	}

	@RequestMapping(value = "/addDepartment", method = RequestMethod.POST)
	public ModelAndView addDepartment(@Validated @ModelAttribute("departments") UserDepartment userDepartment, BindingResult bindingResult,
			HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();	
		if (validation.validateUserDepartment(userDepartment, bindingResult, ValidationCase.SAVE).hasErrors()) {
			mv.setViewName("department/addDepartment");
			List<CrdBranch> branches = crdBranchService.findAll();
			mv.addObject("branches", branches);
			return mv;
		}	
		mv.setViewName("redirect:/listDepartment");
		userDepartmentService.saveOrUpdate(userDepartment);
		return mv;
	}

	@RequestMapping(value = "/editDepartment", method = RequestMethod.POST)
	public ModelAndView editDepartment(@RequestParam(name = "departmentId", required = true) Integer departmentId) {
		ModelAndView mv = new ModelAndView("department/editDepartment");
		UserDepartment departments = userDepartmentService.findOne(departmentId);
		mv.addObject("departments", departments);
		List<CrdBranch> branches = crdBranchService.findAll();
		mv.addObject("branches", branches);
		return mv;
	}

	@RequestMapping(value = "/updateDepartment", method = RequestMethod.POST)
	public ModelAndView updateDepartment(@Validated @ModelAttribute("departments") UserDepartment userDepartment, BindingResult bindingResult,
			HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if (validation.validateUserDepartment(userDepartment, bindingResult, ValidationCase.EDIT).hasErrors()) {
			mv.setViewName("department/editDepartment");
			List<CrdBranch> branches = crdBranchService.findAll();
			mv.addObject("branches", branches);
			return mv;
		}
		mv.setViewName("redirect:/listDepartment");
		userDepartmentService.saveOrUpdate(userDepartment);
		return mv;
	}

	@RequestMapping(value = "/listDepartment", method = RequestMethod.GET)
	public ModelAndView listDepartment() {
		List<UserDepartment> departments = userDepartmentService.findAll();
		ModelAndView mv = new ModelAndView("department/listDepartment");
		mv.addObject("departments", departments);
		List<CrdBranch> branches = crdBranchService.findAll();
		mv.addObject("branches", branches);
		return mv;
	}

	@RequestMapping(value = "/deleteDepartment", method = RequestMethod.GET)
	public String deleteDepartment(@RequestParam(name = "departmentId", required = true) Integer departmentId) {
		userDepartmentService.delete(departmentId);
		return "redirect:/listDepartment";
	}
}
