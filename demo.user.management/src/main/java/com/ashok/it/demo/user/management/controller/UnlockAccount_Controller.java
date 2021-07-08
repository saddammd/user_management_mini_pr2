package com.ashok.it.demo.user.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.it.demo.user.management.dto.UnlockForm;
import com.ashok.it.demo.user.management.properties.AppProperties;
import com.ashok.it.demo.user.management.service.UserServiceImpl;

@RestController
public class UnlockAccount_Controller {
	
	@Autowired
	private AppProperties properties;
	
	@Autowired
	private UserServiceImpl userService;
	
	
	@PostMapping("/unlock")
	public String unlock(@RequestBody UnlockForm unlockform) {
		
		return userService.unlockAccount(unlockform);
				
	}
}
