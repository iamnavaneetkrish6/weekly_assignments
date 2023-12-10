package com.example.restcrud.test.dto;

public class LoanTypeDTO {

	private int loanTypeId;
	private String loanTypeName;
	private double loanInterestrate;
	private int loanTermInYear;
	
	public LoanTypeDTO() {
		// TODO Auto-generated constructor stub
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
