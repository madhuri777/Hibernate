package com.bridgeit.model;

import java.util.*;

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
@Table(name="Doctor")
public class Doctor {

	@Id
	@GeneratedValue
	@Column(name="Dctr_Id")
	private int doctr_id;
	
	@Column(name="DoctName")
	private String doctr_name;
	
	@Column(name="Specialization")
	private String specialist;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Doctor_Patient", joinColumns= {@JoinColumn(name="")},inverseJoinColumns= {@JoinColumn(name="")})
	@Column(name="patients")
	private Set<Patient> patients;

	public int getDoctr_id() {
		return doctr_id;
	}
	public void setDoctr_id(int doctr_id) {
		this.doctr_id = doctr_id;
	}
	public String getDoctr_name() {
		return doctr_name;
	}
	public void setDoctr_name(String doctr_name) {
		this.doctr_name = doctr_name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public Set<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Doctor [doctr_id=" + doctr_id + ", doctr_name=" + doctr_name + ", specialist=" + specialist
				+ ", patients=" + patients + "]";
	}
	
	
	
}
