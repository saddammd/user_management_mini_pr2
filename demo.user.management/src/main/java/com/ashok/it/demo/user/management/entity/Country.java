package com.ashok.it.demo.user.management.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "country_master")
public class Country {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "country_code")
	private String country_code;
	
	@Column(name = "country_name")
	private String country_name;
	
	@OneToMany(mappedBy = "country")
	private List<State> state ;
	
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(Integer id, String country_code, String country_name) {
		super();
		this.id = id;
		this.country_code = country_code;
		this.country_name = country_name;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	
	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Country [country_id=" + id + ", country_code=" + country_code + ", country_name=" + country_name
				+ "]";
	}
	
	
}
