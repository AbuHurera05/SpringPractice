package com.junejo.SpringThirdProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.junejo.beans.Student;
import com.junejo.resources.JavaConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//1 practce
//    	String path="/com/junejo/resources/applicationContext.xml";
//    	ApplicationContext context=new ClassPathXmlApplicationContext(path);
    	
    	//2 practice
    	ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfigFile.class);
    	
    	
    	Student	std= (Student) context.getBean("student");
    	std.disply();
    }
}
