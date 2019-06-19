package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class sample {
	@Autowired
	@Qualifier("user2")
	private User user;

	public sample() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Hello World");
	}
	public void display()
	{
		System.out.println(user.getName());
	}
	public void display1()
	{
		System.out.println(user.getAge());
	}

}
