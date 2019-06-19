package com.pack.service;

import com.pack.model.Customer;

public interface CustomerService {
	public void insertCustomer(Customer c);
	public void updateCustomer(Customer c);
	public void deleteCustomer(int num);
	public Customer fetchCustomer(int num);
}
