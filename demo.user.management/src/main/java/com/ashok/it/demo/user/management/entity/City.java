package com.ashok.it.demo.user.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="city_master")
public class City {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "city_name")
	private String city_name;
	
	@ManyToOne
	@JoinColumn(name = "s_id")
	private State state;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(Integer id, String city_name) {
		super();
		this.id = id;
		this.city_name = city_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}


}
