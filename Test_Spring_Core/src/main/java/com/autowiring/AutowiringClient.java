package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringClient {

	public static void main(String[] args) {

		ApplicationContext containerObj = new ClassPathXmlApplicationContext("autowiring.xml");
		
		Student student = containerObj.getBean("stObj4", Student.class);
		
		System.out.println(student);
		
	}

}
