package com.junejo.beans;

public class Address {
	private int  houseno;
	private String city;
	private int pincode;
	
	//By using setter method
//	public int getHouseno() {
//		return houseno;
//	}
//	public void setHouseno(int houseno) {
//		this.houseno = houseno;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public int getPincode() {
//		return pincode;
//	}
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//	
	//by Constructor
	public Address(int houseno, String city, int pincode) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		
		
		
		return "House No: "+houseno+" City: "+city+" pincode: "+pincode;
	}

	
}
