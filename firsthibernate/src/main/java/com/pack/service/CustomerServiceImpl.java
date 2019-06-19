package com.pack.service;

import java.util.List;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	public void insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().insertCustomer(c);
	}

	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return new CustomerDaoImpl().updateCustomer(c);
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(num);
	}

	public List<Customer> fetchCustomer() {
		// TODO Auto-generated method stub
		return new CustomerDaoImpl().fetchCustomer();
	}

}
