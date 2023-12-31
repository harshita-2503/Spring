package com.ccteam.app16.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class WelcomeBean implements InitializingBean,DisposableBean {

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

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		message="Welcome to Career Compiler";
		System.out.println("afterPropertiesSet()");
		
	}
	
	

}
