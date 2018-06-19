package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {

	@Id
	@Column(name="Patient_Id")
	private int patient_no;
	
	@Column(name="Patient_Fname")
	private String patient_fname;
	
	@Column(name="Patient_Lname")
	private String patient_lname;

	public int getPatient_no() {
		return patient_no;
	}

	public void setPatient_no(int patient_no) {
		this.patient_no = patient_no;
	}

	public String getPatient_fname() {
		return patient_fname;
	}

	public void setPatient_fname(String patient_fname) {
		this.patient_fname = patient_fname;
	}

	public String getPatient_lname() {
		return patient_lname;
	}

	public void setPatient_lname(String patient_lname) {
		this.patient_lname = patient_lname;
	}

	@Override
	public String toString() {
		return "Patient [patient_no=" + patient_no + ", patient_fname=" + patient_fname + ", patient_lname="
				+ patient_lname + "]";
	}
	
	
	
}
