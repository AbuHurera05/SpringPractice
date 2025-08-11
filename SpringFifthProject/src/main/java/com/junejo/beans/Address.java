package com.junejo.beans;

public class Address {
	int houseno;
	String city;
	int pincode;
	public Address(int houseno, String city, int pincode) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;
		
		
		
	}
	@Override
	public String toString() {
		
		
		return "#"+houseno+" "+city+" "+pincode;
	}
	

}
