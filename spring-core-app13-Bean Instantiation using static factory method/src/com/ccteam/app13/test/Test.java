package com.ccteam.app13.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.app13.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app13/config/NewFile.xml");
		HelloBean hb=(HelloBean) context.getBean("helloB");
		System.out.println(hb.sayHello());
	}

}
