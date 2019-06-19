package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Employee e=new Employee();
		e.setName("Abi");
		Regular_Employee e1=new Regular_Employee();
		e1.setName("Sam");
		e1.setSalary(20000);
		e1.setBonus(1000);
		Contract_Employee e2=new Contract_Employee();
		e2.setName("Ram");
		e2.setPay_hour(10);
		e2.setContract_duration("2 hr");
		s.persist(e);
		s.persist(e1);
		s.persist(e2);
		t.commit();
		System.out.println("Inserted successfully");
		s.close();
	}

}
