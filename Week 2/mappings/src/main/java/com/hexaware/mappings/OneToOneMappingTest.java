package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Address;
import com.hexaware.mappings.entities.Student;

/**
 * Hello world!
 *
 */
public class OneToOneMappingTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		
		  Address address = new Address(512,"Hyd","Telangana");
		  
		  Student student = new Student(102,"Javeed",address);
		  
		  session.persist(student);
		 

		/*
		 * Student student = new Student(103, "Ashwin");
		 * 
		 * Address address = new Address(54, "Banglore", "KA", student);
		 * 
		 * session.persist(address);
		 */

		tx.commit();

	}
}
