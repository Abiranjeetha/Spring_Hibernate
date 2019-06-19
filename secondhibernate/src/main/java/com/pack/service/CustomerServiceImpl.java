package com.pack.service;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	public void insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().insertCustomer(c);
	}

	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().updateCustomer(c);
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
	}

	public Customer fetchCustomer(int num) {
		// TODO Auto-generated method stub
		return new CustomerDaoImpl().fetchCustomer(num);
	}

}
