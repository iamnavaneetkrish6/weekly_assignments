package com.hexaware.mappings.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student implements Serializable {

	// private static final long serialVersionUID = 1L;

	@Id
	private int studentId;
	private String studentName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid")  // FK
	private Address address;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
