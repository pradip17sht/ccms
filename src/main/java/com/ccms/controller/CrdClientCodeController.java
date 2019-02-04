package com.ccms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ccms.domain.CrdClientcode;
import com.ccms.service.CrdClientCodeService;

@Controller
public class CrdClientCodeController {
	
	@Autowired
	CrdClientCodeService crdClientCodeService;
	
	@RequestMapping(value = "/addClientCode", method = RequestMethod.GET)
	public ModelAndView addClientCode(){
		if(crdClientCodeService.findAll() == null || crdClientCodeService.findAll().size()==0 ){
			ModelAndView mv = new ModelAndView("crdClientCode/addClientCode");
			CrdClientcode clientCode = new CrdClientcode();
			mv.addObject("clientCode", clientCode);
			return mv;
		}
		else{
			ModelAndView mv = new ModelAndView("crdClientCode/editClientCode");
			List<CrdClientcode> clientCodes = crdClientCodeService.findAll();
			Integer clientcodeId = clientCodes.get(0).getClientcodeId();
			CrdClientcode clientCode = crdClientCodeService.findOne(clientcodeId);
			mv.addObject("clientCode", clientCode);
			return mv;
		}   
	}
	
	@RequestMapping(value = "/addClientCode", method = RequestMethod.POST)
	public ModelAndView addClientCode(@ModelAttribute("clientCode") CrdClientcode clientCode){
		ModelAndView mv = new ModelAndView("redirect:/listClientCode");
		String clientCodeTypes = "Auto";
		if(clientCode.getClientcodeType().equals(clientCodeTypes)){
			clientCode.setClientcodeDigits(0);
		}
		crdClientCodeService.saveOrUpdate(clientCode);
		return mv;
	}
	
	@RequestMapping(value = "/listClientCode", method = RequestMethod.GET)
	public ModelAndView listClientCode(){
		ModelAndView mv = new ModelAndView("crdClientCode/listClientCode");
		List<CrdClientcode> clientCodes = crdClientCodeService.findAll();
		mv.addObject("clientCode", clientCodes);
		return mv;
	}
}
