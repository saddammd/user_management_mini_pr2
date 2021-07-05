package com.ashok.it.demo.user.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.it.demo.user.management.dto.RegistrationForm;
import com.ashok.it.demo.user.management.service.UserServiceImpl;

@RestController
public class Register_Controller {
	
	@Autowired
	UserServiceImpl userService;
	
	
	@PostMapping("/register")
	public String registerUser(@RequestBody RegistrationForm reg) {
		 
		if(userService.registerUser(reg)!=null) {
				
		return "USER REGISTERED SUCCESSFULLY!!!!!";
		}
		
		else return "USER FAILED TO REGISTER";
	}
}
