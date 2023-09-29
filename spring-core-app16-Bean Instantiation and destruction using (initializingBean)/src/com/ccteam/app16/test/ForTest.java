package com.ccteam.app16.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.app16.beans.WelcomeBean;

public class ForTest {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app16/config/SpringConfig.xml");
		WelcomeBean bean=(WelcomeBean) context.getBean("wel");
		System.out.println(bean.sayWelcome());
		context.registerShutdownHook();
		

	}

}
