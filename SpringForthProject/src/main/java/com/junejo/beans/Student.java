package com.junejo.beans;

public class Student {
	private String name;
	private int rollno;
	private Address address;
	
	//by using setter Method
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getRollno() {
//		return rollno;
//	}
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	//by using constructor
	
	public Student(String name, int rollno, Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}
	
	public void disply() {
		System.err.println(name);
		System.err.println(rollno);
		System.err.println(address);
	}

	
	
}
