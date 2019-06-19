package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
		User u=(User)fact.getBean("user");
		System.out.println(u.getName());
		System.out.println(u.getAge());

	}

}
