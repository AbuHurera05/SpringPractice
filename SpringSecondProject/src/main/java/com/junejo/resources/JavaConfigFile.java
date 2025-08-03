package com.junejo.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.junejo.beans.Student;

// Java Based Configuration

//@Configuration
//public class JavaConfigFile {
//	//@Bean   1
//	@Bean("stdObj")   //2
//	public Student stdId() {
//		
//		Student std= new Student();
//		std.setName("Abu Hurera");
//		std.setEmail("junejo@gmail.com");
//		std.setRollno(139);
//		
//		
//		return std;
//	}
//}

//Annotation Based Configuration
@Configuration
public class JavaConfigFile {
	//@Bean   1
	@Bean("stdObj")   //2
	public Student stdId() {
		
		Student std= new Student();
		std.setName("Abu Hurera");
		std.setEmail("junejo@gmail.com");
		std.setRollno(139);
		
		
		return std;
	}
}
