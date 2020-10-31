package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.User;
import com.example.demo.services.UserService;


@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userservice;

/*	@GetMapping("/save-user")
	public String SaveUser(@RequestParam  String Email,@RequestParam  String firstname,
			@RequestParam  String Lastname,
			@RequestParam  String place,
			@RequestParam  String password) {
		
		User user = new User(Email,firstname,Lastname,place,password) ;
		userservice.savemyuser(user);
		return "user saved";
	}
	*/
}
