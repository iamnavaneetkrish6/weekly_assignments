package com.hexaware.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.model.Product;
import com.hexaware.springjdbc.servicce.IproductService;
import com.hexaware.springjdbc.servicce.ProductServiceImp;


public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	IproductService service = context.getBean(ProductServiceImp.class);
    	
    	service.createProduct(new Product(10,"NAVANEET",654.46));
    	
    	System.out.println(service.getAllProduct());
    	
    	
    	
    }
}
