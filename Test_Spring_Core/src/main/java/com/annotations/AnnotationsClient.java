package com.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsClient {

	public static void main(String[] args) {

		ApplicationContext containerObj = new ClassPathXmlApplicationContext("annotations.xml");
		
		Student stObj = containerObj.getBean("student", Student.class);
		
		System.out.println(stObj);
		
	}

}
