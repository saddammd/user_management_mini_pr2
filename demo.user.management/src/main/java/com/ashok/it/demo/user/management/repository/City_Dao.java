package com.ashok.it.demo.user.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.it.demo.user.management.entity.City;
import com.ashok.it.demo.user.management.entity.State;

public interface City_Dao extends JpaRepository<City, Integer> {
	
	public List<City> findCityByState_id(Integer state_id);

}
