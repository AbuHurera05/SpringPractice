package com.junejo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.junejo.beans.Student;
import com.junejo.resources.JavaConfigFile;

/**
 * Hello world!
 *
 */
//Java Based Configuration
//public class App 
//{
//    public static void main( String[] args )
//    {
//        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigFile.class);
//        //1. Student std=(Student) context.getBean("stdId");
//        
//        //2. Student std=(Student) context.getBean(Student.class);
//        
//   
//        Student std=(Student) context.getBean("stdObj");
//        
//        
//        std.disply();
//    }
//}

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigFile.class);
        //1. Student std=(Student) context.getBean("stdId");
        
        //2. Student std=(Student) context.getBean(Student.class);
        
   
        Student std=(Student) context.getBean("stdObj");
        
        
        std.disply();
    }
}
