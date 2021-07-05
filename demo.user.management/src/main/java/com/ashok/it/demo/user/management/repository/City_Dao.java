package com.ashok.it.demo.user.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.it.demo.user.management.entity.City;

@Repository
public interface City_Dao extends JpaRepository<City, Integer> {
	
	public List<City> findCityByState_id(Integer state_id);

}
