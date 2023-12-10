package com.hexaware.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int departmentId;
	private String departmentNam;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")

	private Set<Employee> employees = new HashSet<Employee>(); // always initialize collection type properties to avoid
																// NullPointerExp

	public Department() {
		super();
	}

	public Department(int departmentId, String departmentNam, Set<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentNam = departmentNam;
		this.employees = employees;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentNam() {
		return departmentNam;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public void setDepartmentNam(String departmentNam) {
		this.departmentNam = departmentNam;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	// the method below will add employee to department
	// also serves the purpose to avoid cyclic references.

	public void addEmployee(Employee employee) {

// here employee need dept obj so adding current dept obj to employee obj 
		employee.setDepartment(this); // in main() dept.addEmployee(e1);

		Set<Employee> set = getEmployees();

		set.add(employee);

	}

}
