package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
		sample s=(sample)fact.getBean("sample");
		s.display();
		s.display1();
	}
}
