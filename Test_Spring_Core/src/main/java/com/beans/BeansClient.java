package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansClient {

	public static void main(String[] args) {

		// below statement will load xml file with given name under to src/main/resources folder
		  ApplicationContext containerObj = new ClassPathXmlApplicationContext("beans.xml");
		  
	// how to get the object from spring container back to java program
		  Employee empObj = containerObj.getBean("emp", Employee.class);
		  System.out.println(empObj);
		  
		  Employee empObj2 = containerObj.getBean("emp2", Employee.class);
		  System.out.println(empObj2);
		  
		  int y = 90;
		
	}

}
