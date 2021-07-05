package com.ashok.it.demo.user.management.service;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ashok.it.demo.user.management.constants.AppConstants;
import com.ashok.it.demo.user.management.dto.ForgotPasswordForm;
import com.ashok.it.demo.user.management.dto.LoginForm;
import com.ashok.it.demo.user.management.dto.RegistrationForm;
import com.ashok.it.demo.user.management.dto.UnlockForm;
import com.ashok.it.demo.user.management.entity.City;
import com.ashok.it.demo.user.management.entity.Country;
import com.ashok.it.demo.user.management.entity.State;
import com.ashok.it.demo.user.management.entity.User;
import com.ashok.it.demo.user.management.repository.City_Dao;
import com.ashok.it.demo.user.management.repository.Country_Dao;
import com.ashok.it.demo.user.management.repository.State_Dao;
import com.ashok.it.demo.user.management.repository.User_Dao;

public class UserServiceImpl implements UserService {

	@Autowired
	private Country_Dao country_dao;

	@Autowired
	private State_Dao state_dao;
	
	@Autowired
	private City_Dao city_dao;

	@Autowired
	private User_Dao user_dao;

	@Override
	public boolean verifySignIn(LoginForm loginForm) {

		User user = user_dao.findByEmailAndPazzword(loginForm.getEmail(), loginForm.getPazzword());

		if (user != null && user.getIsActive()) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean verifyUniqueEmail(String email) {

		if (user_dao.findByEmail(email)) {
			return false;
		}

		else
			return true;
	}

	@Override
	public Map<Integer, String> getCountries() {

		List<Country> countryList = country_dao.findAll();

		Map<Integer, String> countries = new HashMap<>();

		for (Country c1 : countryList) {

			countries.put(c1.getCountry_id(), c1.getCountry_name());
		}

		return countries;
	}
	

	@Override
	public Map<Integer, String> getStates(Integer country_id) {
		
		List<State> states = state_dao.findSatesByCountry_id(country_id);
		Map<Integer,String> statesMap = new HashMap<>();
		
		states.forEach(state-> {
			statesMap.put(state.getState_id(), state.getState_name());			
		});
		
		return statesMap;
	}

	@Override
	public Map<Integer, String> getCities(Integer state_id) {
	
		List<City> CityList = city_dao.findCityByState_id(state_id);
		Map<Integer, String> cityMap = new HashMap<>();
		
		CityList.forEach(city->{
			cityMap.put(city.getId(), city.getCity_name());
		});
				
		return cityMap;
	}

	@Override
	public User registerUser(RegistrationForm registrationForm) {
		
		User user_entity = new User();
		BeanUtils.copyProperties(registrationForm, user_entity);
		user_entity.setPassword(generateRandomPassword(6));
		user_entity.setIsActive(false);
				
		return user_dao.save(user_entity);
		
		

	}

	@Override
	public boolean unlockAccount(UnlockForm unlockForm) {
		
		
		
		return false;
	}

	@Override
	public boolean forgotPwd(ForgotPasswordForm forgotPasswordFrom) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static String generateRandomPassword(int len)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = AppConstants.CHARACTERS;
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }

}
