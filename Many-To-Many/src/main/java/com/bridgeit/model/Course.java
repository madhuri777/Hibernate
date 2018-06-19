package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="CourseMTM")
public class Course extends Student{

	@Id
	@Column(name="Course_id")
	private int course_id;
	
	@Column(name="Course_Name")
	private String course_Name;
	
	//@Column(name="stdnt_name")
	//private String student_name;
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	
	
}
