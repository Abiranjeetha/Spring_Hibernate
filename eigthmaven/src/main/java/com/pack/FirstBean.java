package com.pack;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
	@Autowired
	 private SecondBean secondBean;
	private String name;
	public void check()
	{
		secondBean.check1();
	}
	public SecondBean getSecondBean() {
		return secondBean;
	}
	
	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
