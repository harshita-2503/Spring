package com.ccteam.app03.beans;

public class HelloBean {
	static {
		System.out.println("Bean is Loading...");
	}
	public HelloBean()
	{
		System.out.println("Bean is created...");
		
	}
	public String sayHello() {
		return "Hello User";
	}

}
