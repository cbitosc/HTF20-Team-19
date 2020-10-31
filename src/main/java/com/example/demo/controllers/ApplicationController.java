package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.User;
import com.example.demo.services.UserService;

@Controller
public class ApplicationController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String Register(HttpServletRequest request)
	{
		String email =(String) request.getAttribute("Email");
		String password = (String)request.getAttribute("password");
		String firstname = (String) request.getAttribute("firstname");
		String lastname = (String) request.getAttribute("lastname");
		String DonarorAcceptor = (String) request.getAttribute("donaroracceptor");
		String pincode = (String) request.getAttribute("pincode");
		String  BloodType = (String) request.getAttribute("bloodtype");
		String place = (String) request.getAttribute("place");
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		user.setBloodType(BloodType);
		user.setDonarorAcceptor(DonarorAcceptor);
		user.setPincode(pincode);
		user.setPlace(place);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		
		return "redirect:/register";
	}
	
	@RequestMapping("/")
	public String Login() {
		return "Login";
	}
	
	/*@RequestMapping(value="/login", method=RequestMethod.POST)    
	public ModelAndView save(@ModelAttribute User user)  
	{    
	ModelAndView modelAndView = new ModelAndView();    
	modelAndView.setViewName();        
	modelAndView.addObject("user", user);      
	return modelAndView;    
	}*/
	
/*	@GetMapping("/success")
	public String Success(HttpServletRequest request)
	{
		
		return "Success";
	}
	*/
	@GetMapping("/notsuccess")
	public String NotSuccess(HttpServletRequest request)
	{
		
		return "register";
	}
	
	
	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute User user,BindingResult bindingResult,HttpServletRequest request ) {
		userService.savemyuser(user);
		return "Success";	
	}
	
	
	@PostMapping("/login")
	public String Validate(HttpServletRequest request) {
		String email =(String) request.getAttribute("Email");
		String password = (String)request.getAttribute("password");
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		return "redirect:"+ userService.Login(user);
	}
	
	
	@GetMapping(value = "/success")
	public  ModelAndView  ListOfDonars(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("Success");
		User user= new User();
	    user.setPincode("506001");
		model.addObject("donars", userService.DonarsList(user) );
		return model;	
	}
	
}
