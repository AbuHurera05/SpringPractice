package com.junejo.beans;

public class Student {
	String name;
	int rollno;
	Address address;

//	public String getName() {
//		return name;
//	}
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//	public int getRollno() {
//		return rollno;
//	}
//
//
//
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//
//
//
//	public Address getAddress() {
//		return address;
//	}
//
//
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public void disply() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(address);
	}

	public Student(String name, int rollno, Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}
}
