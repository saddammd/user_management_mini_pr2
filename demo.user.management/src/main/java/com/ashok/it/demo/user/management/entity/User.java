package com.ashok.it.demo.user.management.entity;

import java.time.LocalDate;

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


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pazzword")
	private String pazzword;
	
	@Column(name = "DoB")
	private LocalDate dob;
	
	@Column(name = "phone")
	private Long PhoneNo;
	
	@Column(name = "isActive")
	private Boolean isActive; 
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;

	@CreationTimestamp
	@Column(name = "createdDate", nullable = false, updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "updatedDate", nullable = false, insertable = false)
	private LocalDate updatedDate;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPazzword() {
		return pazzword;
	}

	public void setPazzword(String pazzword) {
		this.pazzword = pazzword;
	}


	public LocalDate getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}


	public LocalDate getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
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
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Long getPhoneNo() {
		return PhoneNo;
	}


	public void setPhoneNo(Long phoneNo) {
		PhoneNo = phoneNo;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	
	
	
}
