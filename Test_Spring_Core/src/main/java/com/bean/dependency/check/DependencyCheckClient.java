package com.bean.dependency.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCheckClient {

	public static void main(String[] args) {

		ApplicationContext containerObj = new ClassPathXmlApplicationContext("dependency-check.xml");
		
		Student student = containerObj.getBean("stObj", Student.class);
		System.out.println(student);
		
		Student student2 = containerObj.getBean("stObj2", Student.class);
		System.out.println(student2);
		
		Student student3 = containerObj.getBean("stObj3", Student.class);
		System.out.println(student3);
		
		Student student4 = containerObj.getBean("stObj4", Student.class);
		System.out.println(student4);
		
	}

}
