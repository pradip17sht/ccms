package com.ccms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ccms.domain.AccountLengthSetup;
import com.ccms.domain.CrdBank;
import com.ccms.service.AccountLengthSetupService;
import com.ccms.validation.Validation;
import com.ccms.validation.ValidationCase;

@Controller
public class AccountLengthSetupController {

	@Autowired
	private AccountLengthSetupService accountLengthSetupService;

	@Autowired
	private Validation validation;

	@RequestMapping(value = "/addAccountLength", method = RequestMethod.GET)
	public ModelAndView addAccountLength() {
		if (accountLengthSetupService.findAll() == null || accountLengthSetupService.findAll().size() == 0) {
			ModelAndView mv = new ModelAndView("accountLength/addAccountLength");
			AccountLengthSetup accountLength = new AccountLengthSetup();
			mv.addObject("account", accountLength);
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("accountLength/editAccountLength");
			List<AccountLengthSetup> accountLengths = accountLengthSetupService.findAll();
			Integer accountnoId = accountLengths.get(0).getAccountnoId();
			AccountLengthSetup accountLength = accountLengthSetupService.findOne(accountnoId);
			mv.addObject("account", accountLength);
			return mv;
		}
	}

	@RequestMapping(value = "/addAccountLength", method = RequestMethod.POST)
	public ModelAndView addAccountLength(@ModelAttribute("account") AccountLengthSetup accountLengthSetup,
			BindingResult bindingResult) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/listAccountLength");
		accountLengthSetupService.saveOrUpdate(accountLengthSetup);
		return mv;
	}

	@RequestMapping(value = "/editAccountLength", method = RequestMethod.POST)
	public ModelAndView editAccountLength(@ModelAttribute("accountnoId") Integer accountnoId) {
		ModelAndView mv = new ModelAndView("accountLength/editAccountLength");
		AccountLengthSetup accountLength = accountLengthSetupService.findOne(accountnoId);
		mv.addObject("account", accountLength);
		return mv;
	}

	@RequestMapping(value = "/updateAccountLength", method = RequestMethod.POST)
	public ModelAndView updateAccountLength(@ModelAttribute("account") AccountLengthSetup accountLength) {
		accountLengthSetupService.saveOrUpdate(accountLength);
		ModelAndView mv = new ModelAndView("redirect:/listAccountLength");
		return mv;
	}

	@RequestMapping(value = "/listAccountLength", method = RequestMethod.GET)
	public ModelAndView listAccountLength() {
		ModelAndView mv = new ModelAndView("accountLength/listAccountLength");
		List<AccountLengthSetup> accountLengths = accountLengthSetupService.findAll();
		mv.addObject("account", accountLengths);
		return mv;
	}

	@RequestMapping(value = "/deleteAccountLength", method = RequestMethod.GET)
	public String deleteAccountLength(@RequestParam(name = "accountnoId", required = true) Integer accountnoId) {
		accountLengthSetupService.delete(accountnoId);
		return "redirect:/listAccountLength";
	}

}
