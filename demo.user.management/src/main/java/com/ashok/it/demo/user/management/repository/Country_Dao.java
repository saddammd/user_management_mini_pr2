package com.ashok.it.demo.user.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.it.demo.user.management.entity.Country;

@Repository
public interface Country_Dao extends JpaRepository<Country, Integer> {

}
