package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

	@Id
	@Column(name="Address_id")
	private int Addres_id;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="ZipNo")
	private long zipcod;
	
	public int getAddres_id() {
		return Addres_id;
	}
	public void setAddres_id(int addres_id) {
		Addres_id = addres_id;
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
	public long getZipcod() {
		return zipcod;
	}
	public void setZipcod(long zipcod) {
		this.zipcod = zipcod;
	}
	
	
	
	
}
