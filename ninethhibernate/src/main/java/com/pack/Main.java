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
		Student st=new Student();
		st.setStudentid(102);
		st.setStudentname("Abi");
		st.setGroup("Maths");
		
		Address ad=new Address();
		ad.setAddressid(103);
		ad.setPlace("Chennai");
		ad.setStudent(st);
		
		s.persist(ad);
		t.commit();
		System.out.println("Inserted successfully");
		s.close();
	}

}
