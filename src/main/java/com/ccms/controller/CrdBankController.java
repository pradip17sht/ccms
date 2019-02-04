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

import com.ccms.domain.CrdBank;
import com.ccms.domain.CrdBranch;
import com.ccms.service.CrdBankService;
import com.ccms.validation.Validation;
import com.ccms.validation.ValidationCase;


@Controller
public class CrdBankController {
	
	@Autowired
	private CrdBankService crdBankService;
	
	@Autowired
	private Validation validation;
	
	@RequestMapping(value = "/addBank", method = RequestMethod.GET)
	public ModelAndView addBank(){
		if(crdBankService.findAll() == null || crdBankService.findAll().size()==0 ){
			ModelAndView mv = new ModelAndView("crdBank/addBank");
			CrdBank banks = new CrdBank();
			mv.addObject("banks", banks);
			return mv;
		}
		else{
			ModelAndView mv = new ModelAndView("crdBank/editBank");
			List<CrdBank> banks = crdBankService.findAll();
			Integer bankId = banks.get(0).getBankId();
			CrdBank bank = crdBankService.findOne(bankId);
			mv.addObject("banks", bank);
			return mv;
		}
		
	}
	
	@RequestMapping(value = "/addBank", method = RequestMethod.POST)
	public ModelAndView addBank(@Validated @ModelAttribute("banks") CrdBank crdBank, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView();
		if(validation.validateCrdBank(crdBank, bindingResult, ValidationCase.SAVE).hasErrors()){
			mv.setViewName("crdBank/addBank");
			return mv;
		}
		crdBankService.saveOrUpdate(crdBank);
		mv.setViewName("redirect:/listBank");
		return mv;
	}
	
	@RequestMapping(value = "/editBank", method = RequestMethod.POST)
	public ModelAndView editBank(@RequestParam(name = "bankId", required = true) Integer bankId) {
		ModelAndView mv = new ModelAndView("crdBank/editBank");
		CrdBank bank = crdBankService.findOne(bankId);
		mv.addObject("banks", bank);
		return mv;
	}
	
	@RequestMapping(value = "/updateBank", method = RequestMethod.POST)
	public ModelAndView updateBank(@Validated @ModelAttribute("banks") CrdBank crdBank, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView();
		if(validation.validateCrdBank(crdBank, bindingResult, ValidationCase.EDIT).hasErrors()){
			mv.setViewName("crdBank/editBank");
			return mv;
		}
		crdBankService.saveOrUpdate(crdBank);
		mv.setViewName("redirect:/listBank");
		return mv;
	}
	
	@RequestMapping(value = "/listBank", method = RequestMethod.GET)
	public ModelAndView listBank(){
		List<CrdBank> banks = crdBankService.findAll();
		ModelAndView mv = new ModelAndView("crdBank/listBank");
		mv.addObject("banks", banks);
		return mv;
	}
	
	@RequestMapping(value = "/deleteBank", method = RequestMethod.GET)
	public String deleteBank(@RequestParam(name = "bankId", required = true) Integer bankId) {
		crdBankService.delete(bankId);	
		return "redirect:/listBank";
	}
}
