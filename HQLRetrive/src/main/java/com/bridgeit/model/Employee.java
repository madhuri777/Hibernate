package com.bridgeit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeRetrive")
public class Employee {


	@Id
	@GeneratedValue
	@Column(name="Emp_id")
	private int emp_id;
	
	@Column(name="Emp_Name")
	private String emp_name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address emp_add;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Address getEmp_add() {
		return emp_add;
	}

	public void setEmp_add(Address emp_add) {
		this.emp_add = emp_add;
	}
	
	
}
