package com.ccteam.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class WelcomeBean {
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage");
	}
	public String sayWelcome() {
		return message;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("postConstruct Method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("preDestroy method");
	}
	
	

}
