package com.pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hw=(HelloWorld)fact.getBean("helloWorld");
		System.out.println(hw.getMessage());
		fact.registerShutdownHook();
	}

}
