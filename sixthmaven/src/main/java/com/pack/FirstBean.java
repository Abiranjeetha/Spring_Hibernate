package com.pack;

public class FirstBean {
	private SecondBean secondBean;
	private String name;
	public void check()
	{
		secondBean.check1();
	}
	public FirstBean(SecondBean secondBean, String name) {
		super();
		this.secondBean = secondBean;
		this.name = name;
	}

}
