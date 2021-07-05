package com.ashok.it.demo.user.management.dto;

import org.springframework.stereotype.Component;

@Component
public class ForgotPasswordForm {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
