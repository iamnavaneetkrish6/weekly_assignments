package com.hexaware.mappings;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Order;
import com.hexaware.mappings.entities.Product;

public class ManyToManyTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Product product1 = new Product();
		product1.setProductId(10);
		product1.setProductName("Electronic");
		product1.setPrice(50000);

		Product product2 = new Product();
		product2.setProductId(20);
		product2.setProductName("Baby Cares");
		product2.setPrice(8000);

		Product product3 = new Product();
		product3.setProductId(30);
		product3.setProductName("Grocery");
		product3.setPrice(2000);

		
		  Order order1 = new Order(); order1.setOrderId(501);
		  order1.setPurchaseDate(new Date());
		  
		  order1.addProduct(product1); order1.addProduct(product3);
		 
		Order order2 = new Order();

		order2.setOrderId(503);
		order2.setPurchaseDate(new Date());
		
		order2.addProduct(product2);
		order2.addProduct(product3);
		order2.addProduct(product1);
		
			session.persist(order1);
			session.persist(order2);
			
			tx.commit();
			
			sessionFactory.close();
		

	}

}
