package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.config.AppConfig;
import com.hexaware.aop.service.BankService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	BankService service =		  context.getBean(BankService.class);    	
    	
    	
    			service.fundTransfer();
    			
    			
    			service.withdraw();
    			
    	
    		double balance =	service.getBalance(101);  
    	
    	
    		
    		System.out.println("Balance  "+balance);
    	
    }
}
