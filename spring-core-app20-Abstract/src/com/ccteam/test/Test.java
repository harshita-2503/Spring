package com.ccteam.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.beans.HelloBean;
import com.ccteam.beans.WelcomeBean;
import com.ccteam.beans.WishBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/config/SpringConfig.xml");
		//WishBean wishb=(WishBean) context.getBean("wishbean");
		//System.out.println(wishb);
		HelloBean hb=(HelloBean) context.getBean("helloBean");
		System.out.println(hb.sayHello());
		System.out.println();
		WelcomeBean wb=(WelcomeBean) context.getBean("welcomeBean");
		System.out.println(wb.sayWelcome());
		context.registerShutdownHook();
		
		
	}

}


