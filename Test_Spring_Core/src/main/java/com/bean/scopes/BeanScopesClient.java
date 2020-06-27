package com.bean.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesClient {

	public static void main(String[] args) {

		ApplicationContext containerObj = new ClassPathXmlApplicationContext("bean-scopes.xml");
		
		Course obj1 = containerObj.getBean("cObj", Course.class);
		Course obj2 = containerObj.getBean("cObj", Course.class);
		Course obj3 = containerObj.getBean("cObj", Course.class);
		
		Course obj4 = containerObj.getBean("cObj2", Course.class);
		Course obj5 = containerObj.getBean("cObj2", Course.class);
		Course obj6 = containerObj.getBean("cObj2", Course.class);
		
		
		System.out.println("hashcode values for the beans created with scope as singleton");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println();
		
		System.out.println("hashcode values for the beans created with scope as prototype");
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
		System.out.println(obj6.hashCode());
	
	}

}
