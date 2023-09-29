package com.ccteam.app14.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.app14.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app14/test/NewFile.xml");
		HelloBean bean=(HelloBean) context.getBean("helloB");
		System.out.println(bean.sayHello());

	}

}
