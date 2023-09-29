package com.ccteam.beans;

public class WelcomeBean {

	public void customInit() {
		System.out.println("init()-Welcome");
	}
	public void customDestroy() {
		System.out.println("destroy-Welcome");
	}
	public String sayWelcome(){
		return "WelcomeUser";
	}
}
