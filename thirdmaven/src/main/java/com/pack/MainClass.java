package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");	
		sample s=(sample)context.getBean("sample");
		System.out.println(s);
		System.out.println(s.getMessage());
		sample s1=(sample)context.getBean("sample");
		System.out.println(s1);
		System.out.println(s1.getMessage());
	}
}
