package com.ccteam.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.beans.HelloBean;
import com.ccteam.beans.WelcomeBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/config/SpringConfig.xml");
		WelcomeBean wb=(WelcomeBean) context.getBean("welcome");
		HelloBean hb=(HelloBean) context.getBean("hello");
		System.out.println(wb.sayWelcome());
		System.out.println(hb.sayHello());
		context.registerShutdownHook();
	}

}
