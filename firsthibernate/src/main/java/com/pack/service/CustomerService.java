package com.pack.service;

import java.util.List;

import com.pack.model.Customer;

public interface CustomerService {
	public void insertCustomer(Customer c);
	public int updateCustomer(Customer c);
	public void deleteCustomer(int num);
	public List<Customer> fetchCustomer();
}
