package com.bridgeit.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
//@Table(name="StudentMTM")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="Student_RollNo")
	private int roll_no;
	
	@Column(name="Stdent_name")
	private String student_Name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@Column(name="Courses")
	@JoinTable(name="Student_Course", joinColumns = {@JoinColumn(name="Student_RollNo")},inverseJoinColumns= {@JoinColumn(name="Course_id")})	
	private Set<Course> course=new HashSet<Course>();
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	
	
	
}
