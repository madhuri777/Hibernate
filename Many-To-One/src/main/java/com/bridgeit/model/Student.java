package com.bridgeit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student_M_T_O")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="Std_RollNo")
	private int roll_no;
	
	@Column(name="std_Name")
	private String std_name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Address std_address;
	
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public Address getStd_address() {
		return std_address;
	}
	public void setStd_address(Address std_address) {
		this.std_address = std_address;
	}
	
	

}
