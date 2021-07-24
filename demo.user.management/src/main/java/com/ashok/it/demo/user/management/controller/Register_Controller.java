package com.ashok.it.demo.user.management.controller;

import java.io.IOException;
import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.it.demo.user.management.constants.AppConstants;
import com.ashok.it.demo.user.management.dto.RegistrationForm;
import com.ashok.it.demo.user.management.properties.AppProperties;
import com.ashok.it.demo.user.management.service.UserServiceImpl;

@RestController
public class Register_Controller {

	@Autowired
	UserServiceImpl userService;

	@Autowired
	AppProperties appProperties;

	@GetMapping("/countries")
	public Map<Integer, String> getCountries() {

		Map<Integer, String> countries = userService.getCountries();

		return countries;
	}

	@GetMapping("/states/{country_id}")
	public Map<Integer, String> getStates(@PathVariable Integer country_id) {

		Map<Integer, String> states = userService.getStates(country_id);

		return states;
	}

	@GetMapping("/cities/{state_id}")
	public Map<Integer, String> getCities(@PathVariable Integer state_id) {

		Map<Integer, String> states = userService.getCities(state_id);

		return states;
	}

	@GetMapping("verify/{email}")
	public boolean emailUniqueValidation(@PathVariable String email) {

		boolean verifyUniqueEmail = userService.verifyUniqueEmail(email);

		return verifyUniqueEmail;
	}

	@PostMapping("/register")
	public String registerUser(@RequestBody RegistrationForm reg) throws IOException, MessagingException {

	return userService.registerUser(reg);
	
	}
}
