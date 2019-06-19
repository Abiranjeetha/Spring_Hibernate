package com.pack.model;



public class Customer {
	private int custid;
	private String name;
	private String address;
	private int age;
	private float salary;
	public Customer(int custid, String name, String address, int age, float salary) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String address, int age, float salary) {
		super();
		this.custid = custid;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}

	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
