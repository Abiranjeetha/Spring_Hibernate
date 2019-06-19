package com.pack;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vend1")
public class Vendor {
	@Id
	@Column(name="vid")
	private int vendorid;
	@Column(name="vname")
	private String vendorname;
	@OneToMany(fetch=FetchType.LAZY,targetEntity=Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="venid",referencedColumnName="vid")
	private Set Customer;
	public int getVendorid() {
		return vendorid;
	}
	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public Set getCustomer() {
		return Customer;
	}
	public void setCustomer(Set customer) {
		Customer = customer;
	}
}
