package com.containers;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ContainersClient {

	public static void main(String[] args) {

		//ApplicationContext containerObj = new ClassPathXmlApplicationContext("containers.xml");
		
		BeanFactory containerObj = new XmlBeanFactory(new ClassPathResource("containers.xml"));
		
		containerObj.getBean("adrObj", Address.class);
		
	}

}
