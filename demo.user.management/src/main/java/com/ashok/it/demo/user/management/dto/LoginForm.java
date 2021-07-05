package com.ashok.it.demo.user.management.dto;

import org.springframework.stereotype.Component;

@Component
public class LoginForm {
	
	private String email;
	
	private String pazzword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPazzword() {
		return pazzword;
	}

	public void setPazzword(String pazzword) {
		this.pazzword = pazzword;
	}
	
	

}
