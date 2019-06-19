package com.pack.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.HibernateUtil;
import com.pack.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public void insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try
		{
			t=s.beginTransaction();
			s.save(c);
			t.commit();
		}
		catch(HibernateException e)
		{
			t.rollback();
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
		
	}

	public void updateCustomer(Customer c1) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try
		{
			t=s.beginTransaction();
			Customer c2=(Customer)s.get(Customer.class, c1.getCustid());
			if(c2!=null)
			{
				c2.setAddress(c1.getAddress());
				c2.setAge(c1.getAge());
				c2.setSalary(c1.getSalary());
				s.update(c2);
			}
			t.commit();
		}
		catch(HibernateException e)
		{
			t.rollback();
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
		
	}

	public void deleteCustomer(int num) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try
		{
			t=s.beginTransaction();
			Customer c1=(Customer)s.get(Customer.class, num);
			if(c1!=null)
			{
				s.delete(c1);
			}
			t.commit();
		}
		catch(HibernateException e)
		{
			t.rollback();
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
	}

	public Customer fetchCustomer(int num) {
		// TODO Auto-generated method stub
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		Customer c1=null;
		try
		{
			t=s.beginTransaction();
			c1=(Customer)s.get(Customer.class, num);
		}
		catch(HibernateException e)
		{
			t.rollback();
			e.printStackTrace();
		}
		finally
		{
			s.close();
		}
		return c1;
	}

}
