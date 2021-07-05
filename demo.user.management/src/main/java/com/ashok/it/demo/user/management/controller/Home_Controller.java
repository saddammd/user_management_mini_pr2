package com.ashok.it.demo.user.management.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.it.demo.user.management.constants.AppConstants;
import com.ashok.it.demo.user.management.properties.AppProperties;

@RestController
public class Home_Controller {
	
	@Autowired
	private AppProperties properties;

	@GetMapping("/home")
	public String home() {
		 
		Map<String, String> greetmessages = properties.getGreetmessages();
		String msg = greetmessages.get(AppConstants.WELCOME_MESSAGE);
		
		return msg;
	}
}
