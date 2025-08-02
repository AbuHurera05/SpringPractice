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
    	
    	String classPath="/com/junejo/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(classPath);
        
        Student std=(Student) context.getBean(Student.class);
        
        std.disply();
    }
}
