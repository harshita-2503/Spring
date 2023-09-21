package com.ccteam.app11.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ccteam.app11.beans.HelloBean;
import com.ccteam.app11.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		HelloBean bean=(HelloBean) context.getBean("helloBean");
		System.out.println(bean.sayHello());

	}

}
