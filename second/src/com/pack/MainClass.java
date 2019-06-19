package com.pack;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource res=new FileSystemResource("beans.xml");
		//BeanFactory fact=new XmlBeanFactory(res);
		ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h=(HelloWorld)fact.getBean("helloWorld");
		System.out.println(h.getMessage());
	}

}
