package com.bridgeit.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CreaditCardTPC")
@AttributeOverrides({
	@AttributeOverride(name="paymentId",column=@Column(name="paymentId")),
	@AttributeOverride(name="amt",column=@Column(name="amt"))
})
public class CreaditCard extends Payment {

	@Column(name="creaditType")
	private String creaditCardType;

	public String getCreaditCardType() {
		return creaditCardType;
	}

	public void setCreaditCardType(String creaditCardType) {
		this.creaditCardType = creaditCardType;
	}
	
	
}