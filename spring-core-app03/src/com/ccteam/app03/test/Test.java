package com.ccteam.app03.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ccteam.app03.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("com/ccteam/app03/config/SpringConfig.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		HelloBean hb=(HelloBean) beanFactory.getBean("helloBean");
		System.out.println(hb.sayHello());

	}

}
