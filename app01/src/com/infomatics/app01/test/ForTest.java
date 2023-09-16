package com.infomatics.app01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infomatics.app01.beans.HelloBean;

public class ForTest {

	public static void main(String[] args) throws Exception{
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app01/config/SpringConfig.xml");
		HelloBean hb=(HelloBean)context.getBean("helloBean");
		System.out.println(hb.sayHello());
		
		

	}

}