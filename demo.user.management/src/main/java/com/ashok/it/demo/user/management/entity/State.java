package com.ashok.it.demo.user.management.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "state_master")
public class State {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "state_name")
	private String state_name;
	
	@OneToMany(mappedBy = "state")
	private List<City> city;

	@ManyToOne
	@JoinColumn(name="c_id")
	private Country country;
	
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public State(Integer id, String state_name) {
		super();
		this.id = id;
		this.state_name = state_name;
	}

	public Integer getState_id() {
		return id;
	}

	public void setState_id(Integer id) {
		this.id = id;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	
	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

}
