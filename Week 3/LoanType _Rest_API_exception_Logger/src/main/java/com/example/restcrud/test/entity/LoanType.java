package com.example.restcrud.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoanType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int loanTypeId;
	private String loanTypeName;
	private double loanInterestrate;
	private int loanTermInYear;
	
	
	
	public LoanType() {
		// TODO Auto-generated constructor stub
	}



	public LoanType(int loanTypeId, String loanTypeName, double loanInterestrate, int loanTermInYear) {
		super();
		this.loanTypeId = loanTypeId;
		this.loanTypeName = loanTypeName;
		this.loanInterestrate = loanInterestrate;
		this.loanTermInYear = loanTermInYear;
	}



	public int getLoanTypeId() {
		return loanTypeId;
	}



	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}



	public String getLoanTypeName() {
		return loanTypeName;
	}



	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}



	public double getLoanInterestrate() {
		return loanInterestrate;
	}



	public void setLoanInterestrate(double loanInterestrate) {
		this.loanInterestrate = loanInterestrate;
	}



	public int getLoanTermInYear() {
		return loanTermInYear;
	}



	public void setLoanTermInYear(int loanTermInYear) {
		this.loanTermInYear = loanTermInYear;
	}

	
	
}
