package com.bridgeit.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Employee {

	
	private int id=101;
	private String name;
	private String city;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + "]";
//	}
	
	
}