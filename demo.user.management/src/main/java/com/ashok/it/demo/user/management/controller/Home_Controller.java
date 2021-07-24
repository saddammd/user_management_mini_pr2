package com.ashok.it.demo.user.management.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.it.demo.user.management.constants.AppConstants;
import com.ashok.it.demo.user.management.properties.AppProperties;
import com.ashok.it.demo.user.management.service.UserServiceImpl;

@RestController
public class Home_Controller {
	
	@Autowired
	private AppProperties properties;
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	@GetMapping("/home")
	public String home() {
		 
		Map<String, String> greetmessages = properties.getGreetmessages();
		String msg = greetmessages.get(AppConstants.WELCOME_MESSAGE);
		
		
		return msg;
	}
	

}
