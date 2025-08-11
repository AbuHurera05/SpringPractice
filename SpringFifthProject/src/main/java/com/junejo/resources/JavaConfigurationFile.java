package com.junejo.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.junejo.beans.Address;
import com.junejo.beans.Student;

@Configuration
public class JavaConfigurationFile {
	
	@Bean
	public Address createAddrObject() {
		
		Address addr = new Address(101,"Karachi",54321);
		
		
		
		return addr;
	}
	
	@Bean
	public Student stdObject() {
		
		Student std=new Student("Abu",05,createAddrObject());
		
		
		return std;
	}
	
}
