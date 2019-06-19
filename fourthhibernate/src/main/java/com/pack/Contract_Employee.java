package com.pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="cont_emp")
public class Contract_Employee extends Employee{
	private float pay_hour;
	private String contract_duration;
	public float getPay_hour() {
		return pay_hour;
	}
	public void setPay_hour(float pay_hour) {
		this.pay_hour = pay_hour;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
}
