package com.spring.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    	Samsung s7 = factory.getBean(Samsung.class);
//       s7.config();
//       
    	 //ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
    	 College college = context.getBean("college", College.class);
    	 System.out.println("The Colleage object created by Spring is :" + college);
    	 college.test();
    	 
    }
}
