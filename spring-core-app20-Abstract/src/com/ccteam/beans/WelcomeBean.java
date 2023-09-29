package com.ccteam.beans;

public class WelcomeBean {
	private String message;
	private String name;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void customInit() {
		System.out.println("WelcomeBeanInitialization");
	}
	
	public void customDestroy() {
		System.out.println("WelcomeBeanDestruction");
	}
	
	public String sayWelcome() {
		return message+" "+name;
	}


}
