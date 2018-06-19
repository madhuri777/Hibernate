package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account_O_T_O")
public class Account {

	@Id
	@Column(name="acct")
	private int acct_Id;
	
	@Column(name="acct_No")
	private String acct_Number;
	
	
	public int getAcct_Id() {
		return acct_Id;
	}
	public void setAcct_Id(int acct_Id) {
		this.acct_Id = acct_Id;
	}
	public String getAcct_Number() {
		return acct_Number;
	}
	public void setAcct_Number(String acct_Number) {
		this.acct_Number = acct_Number;
	}
	
	
}
