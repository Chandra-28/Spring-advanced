package com.chandra.springstart.springadvanced.standalone.collections;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/chandra/springstart/springadvanced/standalone/collections/config.xml");
		ProductsList productList = (ProductsList) context.getBean("productList");
		System.out.println(productList);

	}

}
