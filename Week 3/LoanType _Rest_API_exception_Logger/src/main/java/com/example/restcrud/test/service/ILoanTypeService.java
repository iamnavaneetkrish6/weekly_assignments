package com.example.restcrud.test.service;

import java.util.List;

import com.example.restcrud.test.dto.LoanTypeDTO;

public interface ILoanTypeService {

	public LoanTypeDTO createLoanType(LoanTypeDTO loanType);
	public LoanTypeDTO updateLoanType(LoanTypeDTO loanType);
	
	public void deleteLoanType(int LoanTypeId);
	
	public LoanTypeDTO getLoanTypeId(int loanType);
	public List<LoanTypeDTO> getAllLoanType();
	
	public LoanTypeDTO getLoanTypeByName(String loanTypeName);
	
	
	
	public List<LoanTypeDTO> getLoanTypeInterestRateLessThan(int loanTypeInterestRate);
	
	public List<LoanTypeDTO> getLoanTypeInterestRateDeseSorted();
	
	public List<LoanTypeDTO> getLoanTypeInterestRateSorted(int loanTypeTermInYear);
	
}
