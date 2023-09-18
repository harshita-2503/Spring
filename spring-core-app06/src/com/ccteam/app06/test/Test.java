package com.ccteam.app06.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.app06.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app06/config/applicationContext.xml");
		//HelloBean hb1=(HelloBean) context.getBean("helloBean");
		//System.out.println(hb1.sayHello());
		HelloBean hb2=(HelloBean) context.getBean("byeBean");
		System.out.println(hb2.sayHello());

	}

}
