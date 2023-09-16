package com.ccteam.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.beans.WelcomeBean;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/config/SpringConfig.xml");
		WelcomeBean wb=(WelcomeBean) context.getBean("welcomeBean");
		//wb.setName("Harshita");
		System.out.println(wb.sayHello());
	}

}
