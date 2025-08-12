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
       ApplicationContext context=new ClassPathXmlApplicationContext("/com/junejo/resources/applicationContext.xml");
       Student std= (Student) context.getBean("stdId");
       std.disply();
    }
}
