package com.chandra.springstart.springadvanced.injecting.Interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBO {

	@Autowired
	private OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		
		System.out.println("Inside orderBO");
		dao.createOrder();
	}

}
