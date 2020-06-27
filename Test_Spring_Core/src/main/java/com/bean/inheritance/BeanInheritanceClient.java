package com.bean.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceClient {

	public static void main(String[] args) {

		ApplicationContext containerObj = new ClassPathXmlApplicationContext("bean-inheritance.xml");
		
		RegularEmployee regEmp = containerObj.getBean("regEmpObj", RegularEmployee.class);
		System.out.println(regEmp.getId()+" -- "+regEmp.getName()+" -- "+regEmp.getGender()+" -- "+regEmp.getSalary()+" -- "+regEmp.getBonus());
		
		
		RegularEmployee regEmp2 = containerObj.getBean("regEmpObj2", RegularEmployee.class);
		System.out.println(regEmp2.getId()+" -- "+regEmp2.getName()+" -- "+regEmp2.getGender()+" -- "+regEmp2.getSalary()+" -- "+regEmp2.getBonus());
		
	}

}
