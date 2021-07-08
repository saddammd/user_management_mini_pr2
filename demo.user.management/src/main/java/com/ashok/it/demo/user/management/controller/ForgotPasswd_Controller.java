package com.ashok.it.demo.user.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.it.demo.user.management.dto.ForgotPasswordForm;
import com.ashok.it.demo.user.management.properties.AppProperties;
import com.ashok.it.demo.user.management.service.UserService;

@RestController
public class ForgotPasswd_Controller {
	
	@Autowired
	private AppProperties properties;
	
	@Autowired
	UserService userService;

	@GetMapping("/forgot")
	public boolean forgot(ForgotPasswordForm forgotPasswordForm) {
		 
		return userService.forgotPwd(forgotPasswordForm);
		
	}
}
