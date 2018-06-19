package com.bridgeit.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="Roll_no")
	private int rollNo;
	
	@Column(name="Student_name")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Students_Phones", joinColumns = {@JoinColumn(name="Roll_no")}, inverseJoinColumns = { @JoinColumn(name = "Phone_Number") })
	private Set<Phone> studentPhoneNumber=new HashSet<Phone>();
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Phone> getStudentPhoneNumber() {
		return studentPhoneNumber;
	}
	public void setStudentPhoneNumber(Set<Phone> studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}
	
	
}
