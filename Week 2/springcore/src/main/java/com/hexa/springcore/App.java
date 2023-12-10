package com.hexa.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexa.entities.Adress;
import com.hexa.entities.Employee;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages="com.hexa.entities")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       AnnotationConfigApplicationContext container= new AnnotationConfigApplicationContext(App.class);
       Adress ad=container.getBean(Adress.class);
       Employee ee=container.getBean(Employee.class);
       System.out.println(ad);
       System.out.println(ee);
       
       
    }
}
