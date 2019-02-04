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

import com.ccms.domain.CrdProduct;
import com.ccms.service.CrdProductService;
import com.ccms.validation.Validation;
import com.ccms.validation.ValidationCase;

@Controller
public class CrdProductController {
	@Autowired
	private CrdProductService crdProductService;
	
	@Autowired
	private Validation validation;
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public ModelAndView addProduct(){
		ModelAndView mv = new ModelAndView("crdProduct/addProduct");
		CrdProduct products = new CrdProduct();
		mv.addObject("products",products);
		return mv;
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public ModelAndView addProduct(@Validated @ModelAttribute("products") CrdProduct crdProduct, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView();
		crdProduct.setStatus("normal");
		if(validation.validateCrdProduct(crdProduct, bindingResult, ValidationCase.SAVE).hasErrors()){
			mv.setViewName("crdProduct/addProduct");
			return mv;
		}
		crdProductService.saveOrUpdate(crdProduct);
		mv.setViewName("redirect:/listProduct");
		return mv;
	}
	
	@RequestMapping(value = "/editProduct", method = RequestMethod.POST)
	public ModelAndView editProduct(@RequestParam(name = "productId", required = true) Integer productId) {
		ModelAndView mv = new ModelAndView("crdProduct/editProduct");
		CrdProduct product = crdProductService.findOne(productId);
		mv.addObject("products", product);
		return mv;
	}
	
	@RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
	public ModelAndView updateProduct(@Validated @ModelAttribute("products") CrdProduct crdProduct, BindingResult bindingResult){
		ModelAndView mv = new ModelAndView();
		crdProduct.setStatus("normal");
		if(validation.validateCrdProduct(crdProduct, bindingResult, ValidationCase.EDIT).hasErrors()){
			mv.setViewName("crdProduct/editProduct");
			return mv;
		}
		crdProductService.saveOrUpdate(crdProduct);
		mv.setViewName("redirect:/listProduct");
		return mv;
	}
	
	@RequestMapping(value = "/listProduct", method = RequestMethod.GET)
	public ModelAndView listProduct(){
		List<CrdProduct> products = crdProductService.findAll();
		ModelAndView mv = new ModelAndView("crdProduct/listProduct");
		mv.addObject("products", products);
		return mv;
	}
	
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(@RequestParam(name = "productId", required = true) Integer productId) {
		crdProductService.delete(productId);	
		return "redirect:/listProduct";
	}
}
