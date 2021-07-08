package com.ashok.it.demo.user.management.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.it.demo.user.management.entity.User;

@Repository
public interface User_Dao extends JpaRepository<User, Serializable> {

	public User findByEmailAndPazzword(String email, String password);

	public User findByEmail(String email);
	

}
