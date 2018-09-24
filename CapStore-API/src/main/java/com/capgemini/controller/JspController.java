package com.capgemini.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.dto.Admin;
import com.capgemini.dto.Customers;


@Controller
public class JspController {

	@RequestMapping("/")
	public String showWelcomePage(ModelMap map){
		
		return "welcome";
	}
	
	@RequestMapping("/adminlogin")
	public String showAdminLoginPage(ModelMap map,@ModelAttribute("admin") Admin admin){
		
		map.addAttribute("admin", admin);
		return "adminlogin";
	}
	@RequestMapping("/signUpPage")
	public String showSignUpPage(ModelMap map, @ModelAttribute("customer") Customers cus){
		
		
		map.addAttribute("customer", cus);
		return "signUpPage";
	}
	@RequestMapping("/signUp")
	public String signUpCostumer(ModelMap map,@Valid @ModelAttribute("customer") Customers cus, BindingResult error){
		
		System.out.println("**inside signup in jsp controller");
		if(error.hasErrors())
		{
			System.out.println(error.toString());
			map.addAttribute("customer", cus);
			return "signUpPage";
		}
RestTemplate restTemplate = new RestTemplate();
		
		Customers message = restTemplate.postForObject("http://localhost:9090/signUpCustomer",cus, Customers.class);
		 map.addAttribute("custDetails", message);
		 return "customerHomePage";
		 
	}
	
	@RequestMapping("/merchantlogin")
	public String showMerchantLoginPage(ModelMap map){
		
		return "welcome";
	}
	
	@RequestMapping("/customerlogin")
	public String showConsumerLoginPage(ModelMap map){
		
		return "customerLogin";
	}
	@RequestMapping("/adminlogincheck")
	public String  adminLoginCheck(ModelMap map,@ModelAttribute("admin") Admin admin){
		
		RestTemplate restTemplate = new RestTemplate();
		
		Admin message = restTemplate.postForObject("http://localhost:9090/loginAdmin",admin, Admin.class);
		 map.addAttribute("adminDetails", message);
		 return "adminHomePage";
	}
	@RequestMapping("/customerlogincheck")
	public String  customerLoginCheck(ModelMap map,@ModelAttribute("customer") Customers customer){
		
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("**insiode jsp controller");
		Customers obj = restTemplate.postForObject("http://localhost:9090/loginCustomer",customer, Customers.class);
		System.out.println("after Central***** check JspHandler***"+obj.getCustomerName());
		 map.addAttribute("custDetails", obj);
		 return "customerHomePage";
	}
	@RequestMapping("/homePage")
	public String showHomePage(ModelMap map, @ModelAttribute("customer") Customers cus){
		System.out.println("insode himepage");
		map.addAttribute("customer", cus);
		return "customerHomePage";
	}
	
	
	@ModelAttribute("admin")
	Admin getCar() {
		Admin ac = new Admin();
		
		return ac;
	}
	@ModelAttribute("customer")
	Customers getCustomer() {
		Customers ac = new Customers();
		
		return ac;
	}
	
	
}