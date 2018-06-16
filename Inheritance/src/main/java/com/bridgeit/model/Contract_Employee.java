package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Contract_Employee")
public class Contract_Employee extends Employee {

@Column(name="paid_hr")
	private float piad_pre_hr;
	
	@Column(name="contractPeriod")
	private String contract_period;
	
	public float getPiad_pre_hr() {
		return piad_pre_hr;
	}
	public void setPiad_pre_hr(float piad_pre_hr) {
		this.piad_pre_hr = piad_pre_hr;
	}
	public String getContract_period() {
		return contract_period;
	}
	public void setContract_period(String contract_period) {
		this.contract_period = contract_period;
	}
	
}
