package com.ashok.it.demo.user.management.dto;

import org.springframework.stereotype.Component;

@Component
public class UnlockForm {
	
	private String email;
	private String tempPazzword;
	private String newPazzword;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTempPazzword() {
		return tempPazzword;
	}
	public void setTempPazzword(String tempPazzword) {
		this.tempPazzword = tempPazzword;
	}
	public String getNewPazzword() {
		return newPazzword;
	}
	public void setNewPazzword(String newPazzword) {
		this.newPazzword = newPazzword;
	}
	
	
	

}
