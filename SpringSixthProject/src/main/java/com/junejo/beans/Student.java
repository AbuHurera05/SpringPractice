package com.junejo.beans;

public class Student {

	String name;
	int rollno;
	Address add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	public void disply() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(add);
	}
}
