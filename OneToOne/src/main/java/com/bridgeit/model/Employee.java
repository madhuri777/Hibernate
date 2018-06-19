package com.bridgeit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_O_T_O")
public class Employee {

	@Id
	@Column(name="Emp_Id")
	private int emp_id;
	
	@Column(name="Emp_Fname")
	private String emp_fname;
	
	@Column(name="Emp_Lname")
	private String emp_lname;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="Employee_Account",joinColumns= {@JoinColumn(name="")},inverseJoinColumns= {@JoinColumn(name="")})
	//@Column(name="Emp_Acct")
	private Account account_no;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_fname() {
		return emp_fname;
	}
	public void setEmp_fname(String emp_fname) {
		this.emp_fname = emp_fname;
	}
	public String getEmp_lname() {
		return emp_lname;
	}
	public void setEmp_lname(String emp_lname) {
		this.emp_lname = emp_lname;
	}
	public Account getAccount_no() {
		return account_no;
	}
	public void setAccount_no(Account account_no) {
		this.account_no = account_no;
	}
	
	
}
