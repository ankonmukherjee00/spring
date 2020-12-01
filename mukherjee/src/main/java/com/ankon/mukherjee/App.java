package com.ankon.mukherjee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
   car c  =   (car) con.getBean("car");
       c.drive();
       
   
    }
}
