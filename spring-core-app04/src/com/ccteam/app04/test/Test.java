package com.ccteam.app04.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ccteam.app04.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/ccteam/app04/config/applicationContext.xml");
		Student std=(Student) context.getBean("stdBean");
		std.getStudentDetails();

	}

}
