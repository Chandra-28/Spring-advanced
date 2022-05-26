package com.chandra.springstart.springadvanced.autowiring.annotations;

public class Address {

	private int hno;
	private String Street;
	private String City;

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", Street=" + Street + ", City=" + City + "]";
	}
	
}
