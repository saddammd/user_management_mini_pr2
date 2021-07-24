package com.ashok.it.demo.user.management.service;

import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.stereotype.Service;

import com.ashok.it.demo.user.management.dto.ForgotPasswordForm;
import com.ashok.it.demo.user.management.dto.LoginForm;
import com.ashok.it.demo.user.management.dto.RegistrationForm;
import com.ashok.it.demo.user.management.dto.UnlockForm;
import com.ashok.it.demo.user.management.entity.User;

@Service
public interface UserService {
	
	public boolean verifySignIn(LoginForm loginForm);
	
	public boolean verifyUniqueEmail(String email);
	
	public Map<Integer,String> getCountries();
	
	public Map<Integer,String> getStates(Integer country_id);
	
	public Map<Integer,String> getCities(Integer state_id);
	
	public String registerUser(RegistrationForm registrationForm) throws IOException, MessagingException;
	
	public String unlockAccount(UnlockForm unlockForm);

	public boolean forgotPwd(ForgotPasswordForm forgotPasswordFrom) throws IOException, MessagingException;
	

}
