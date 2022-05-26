package com.chandra.springstart.springadvanced.autowiring.hotelmanagement;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	@Autowired(required=true)
	private Reservation reservation;
	private String name;

	public Reservation getReservation() {
		return reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [reservation=" + reservation + ", name=" + name + "]";
	}

}
