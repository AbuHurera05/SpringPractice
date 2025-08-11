package com.junejo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.junejo.beans.Student;
import com.junejo.resources.JavaConfigurationFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
    	
    	Student std = (Student)  context.getBean(Student.class);
    	
    	std.disply();
    	
    }
}
