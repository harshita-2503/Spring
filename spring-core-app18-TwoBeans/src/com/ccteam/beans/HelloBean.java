package com.ccteam.beans;

public class HelloBean {
	public void customInit() {
		System.out.println("init()-Hello");
	}
	public void customDestroy() {
		System.out.println("destroy-Hello");
	}
	public String sayHello(){
		return "HelloUser";
	}

}
