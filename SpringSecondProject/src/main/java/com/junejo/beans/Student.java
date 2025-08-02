package com.junejo.beans;

import org.springframework.stereotype.Component;

//Java Based Configuration
//public class Student {
//	private String name;
//	private int rollno;
//	private String email;
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
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//	public void disply() {
//		System.err.println(name);
//		System.err.println(rollno);
//		System.err.println(email);
//	}
//}


//Annotation Based Configuration

@Component
public class Student {
	private String name;
	private int rollno;
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void disply() {
		System.err.println(name);
		System.err.println(rollno);
		System.err.println(email);
	}
}

