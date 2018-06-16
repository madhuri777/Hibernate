package com.bridgeit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CreaditCard")
@PrimaryKeyJoinColumn(name="payment_id")
public class CreaditCard extends PayMent{

	@Column(name="creadit_Type")
	private String creaditCardType;

	public String getCreaditCardType() {
		return creaditCardType;
	}

	public void setCreaditCardType(String creaditCardType) {
		this.creaditCardType = creaditCardType;
	}
	
	
}
