package com.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeansClient_2 {

	public static void main(String[] args) {

		 ApplicationContext containerObj =  new FileSystemXmlApplicationContext("D:/work/work_space/Prashanth_Spring_Core/src/main/java/com/beans/beans-2.xml");
		 
		 Employee empObj = containerObj.getBean("emp", Employee.class);
		 
		 Employee empObj2 = containerObj.getBean("emp2", Employee.class);
		 
		 System.out.println(empObj);
		 
		 System.out.println(empObj2);
		
	}

}
