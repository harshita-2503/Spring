package com.ccteam.app12.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.app12.bean.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app12/config/majnu.xml");
		HelloBean hb=(HelloBean) context.getBean("hello");
		System.out.println(hb.sayHello());

	}

}
