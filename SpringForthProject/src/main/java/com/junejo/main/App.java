package com.junejo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.junejo.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String config_file="/com/junejo/resources/applicationContext.xml";
    	ApplicationContext context= new ClassPathXmlApplicationContext(config_file);
    	
    	Student std=(Student) context.getBean("stdId");
    	
    	std.disply();
    }
}
