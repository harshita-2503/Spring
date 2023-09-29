package com.ccteam.app15.beans;

public class Welcome {
	static {
		System.out.println("Bean is loaded...");
	}
	public Welcome() {
		System.out.println("Object is created");
	}
	public void customInit() {
		System.out.println("User Defined init()");
	}
	public String sayWelcome() {
		return "Welcome to ccteam Software Solutions";
	}
	
	public void customDestroy() {
		System.out.println("User defined destroy()");
	}

}
