package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Department;
import com.hexaware.mappings.entities.Employee;

public class OneToMany_ManyToOne {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("King");
		e1.setSalary(40000);

		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("Smith");
		e2.setSalary(60000);

		Employee e3 = new Employee();
		e3.setEid(103);
		e3.setEname("Ford");
		e3.setSalary(50000);

		Department dept = new Department();

		dept.setDepartmentId(20);
		dept.setDepartmentNam("Testing");

		// add all employee to collection set , using addEmployee(employee)

		dept.addEmployee(e1);
		dept.addEmployee(e2);
		dept.addEmployee(e3);

		session.persist(dept);

		tx.commit();

	}

}
