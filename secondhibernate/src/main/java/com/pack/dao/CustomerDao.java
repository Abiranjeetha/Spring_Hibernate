package com.pack.dao;

import com.pack.model.Customer;

public interface CustomerDao {
	public void insertCustomer(Customer c);
	public void updateCustomer(Customer c);
	public void deleteCustomer(int num);
	public Customer fetchCustomer(int num);

}
