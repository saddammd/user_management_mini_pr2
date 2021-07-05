package com.ashok.it.demo.user.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.it.demo.user.management.entity.State;

@Repository
public interface State_Dao extends JpaRepository<State, Integer> {
	
	public List<State> findSatesByCountry_id(Integer Country_id);

}
