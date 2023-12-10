package com.hexaware.mappings.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	private double salary;

	
	@ManyToOne
	@JoinColumn(name = "dno") // dno is FK in Employee child table
	Department department;
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		
	}
	
	
	
	
	
	

}
