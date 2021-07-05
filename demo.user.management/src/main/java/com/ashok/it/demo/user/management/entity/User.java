package com.ashok.it.demo.user.management.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "user")
public class User {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pazzword")
	private String pazzword;
	
	@Column(name = "DoB")
	private Date DoB;
	
	@Column(name = "isActive")
	private Boolean isActive; 
	
	@Column(name = "Gender")
	private String gender;

	@CreationTimestamp
	@Column(name = "createdOn", nullable = false, updatable = false)
	private Date createdOn;
	
	@UpdateTimestamp
	@Column(name = "updatedOn", nullable = false, insertable = false)
	private Date updatedOn;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String first_name, String last_name, String email, String pazzword, Date doB, Boolean isActive,
			String gender, Date createdOn, Date updatedOn) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.pazzword = pazzword;
		DoB = doB;
		this.isActive = isActive;
		this.gender = gender;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return pazzword;
	}

	public void setPassword(String pazzword) {
		this.pazzword = pazzword;
	}

	public Date getDoB() {
		return DoB;
	}

	public void setDoB(Date doB) {
		DoB = doB;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	
	
}
