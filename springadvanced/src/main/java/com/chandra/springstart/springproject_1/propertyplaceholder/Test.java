package com.chandra.springstart.springproject_1.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chandra/springstart/springproject_1/propertyplaceholder/config.xml");
		
		MyDao dao=(MyDao)context.getBean("myDAO");
		System.out.println(dao);
	}

}
