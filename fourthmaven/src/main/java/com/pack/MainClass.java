package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
		InjectCollection ic=(InjectCollection)fact.getBean("ic");
		System.out.println(ic.getName1());
		System.out.println(ic.getName2());
		System.out.println(ic.getName3());
		System.out.println(ic.getName4());

	}

}
