package com.ccteam.app07.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app07/config/laila.xml");
		System.out.println(context.getBean("bean1"));
		System.out.println(context.getBean("bean1"));
	}

}
