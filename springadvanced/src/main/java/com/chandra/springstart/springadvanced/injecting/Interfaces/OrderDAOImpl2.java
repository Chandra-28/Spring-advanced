package com.chandra.springstart.springadvanced.injecting.Interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		
		System.out.println("Inside orderImpl2");

	}

}
