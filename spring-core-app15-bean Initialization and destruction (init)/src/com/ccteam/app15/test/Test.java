package com.ccteam.app15.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.app15.beans.Welcome;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app15/config/SpringConfig.xml");
		Welcome bean=(Welcome) context.getBean("wel");
		System.out.println(bean.sayWelcome());
		((AbstractApplicationContext) context).registerShutdownHook();
		

	}

}
