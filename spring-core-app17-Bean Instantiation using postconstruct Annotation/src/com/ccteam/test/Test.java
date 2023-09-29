package com.ccteam.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.beans.WelcomeBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/config/SpringConfig.xml");
		WelcomeBean bean=(WelcomeBean) context.getBean("wel");
		System.out.println(bean.sayWelcome());
		context.registerShutdownHook();

	}

}
