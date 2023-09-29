package com.ccteam.app14.beans;

public class HelloBeanFactory {
	public HelloBean getHelloInstance() {
		System.out.println("Instance Factory Method");
		return new HelloBean();
	}

}
