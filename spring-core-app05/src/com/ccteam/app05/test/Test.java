package com.ccteam.app05.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ccteam.app05.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app05/config/applicationContext.xml");
		XmlBeanFactory fac=new XmlBeanFactory(new ClassPathResource("/com/ccteam/app05/config/applicationContext.xml"));
		//HelloBean hb=(HelloBean) context.getBean("helloBean");
		HelloBean hb=(HelloBean) fac.getBean("helloBean");
		System.out.println(hb.sayHello());
	}

}
