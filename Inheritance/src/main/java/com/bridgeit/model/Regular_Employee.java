package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Regular_Employee")
public class Regular_Employee  extends Employee{

	@Column(name="salary")
	private float salary;
	
	@Column(name="bonus")
	private float bonus;
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
}
