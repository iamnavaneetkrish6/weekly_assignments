package com.example.restcrud.test.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.restcrud.test.dto.LoanTypeDTO;
import com.example.restcrud.test.entity.LoanType;
import com.example.restcrud.test.repository.LoanTypeRepository;
@Service
public class LoanTypeServiceImp implements ILoanTypeService {

	@Autowired
	LoanTypeRepository LoanTypeRepo;
	
	
	Logger logger = LoggerFactory.getLogger(LoanTypeServiceImp.class);
	
	
	@Override
	public LoanTypeDTO createLoanType(LoanTypeDTO loanType) {

		LoanType loan = new LoanType();
		
		loan.setLoanTypeName(loanType.getLoanTypeName());
		loan.setLoanInterestrate(loanType.getLoanInterestrate());
		loan.setLoanTermInYear(loanType.getLoanTermInYear());
		
		LoanTypeRepo.save(loan);
	    logger.debug("I am debug");
			logger.info("I am info");
			logger.warn("I am warning");
		 
		     logger.error("I am error");
		
		return loanType;
	}

	@Override
	public LoanTypeDTO updateLoanType(LoanTypeDTO loanType) {

		LoanType loan = new LoanType();
		
		
		loan.setLoanTypeName(loanType.getLoanTypeName());
		loan.setLoanInterestrate(loanType.getLoanInterestrate());
		loan.setLoanTermInYear(loanType.getLoanTermInYear());
		
		LoanTypeRepo.save(loan);
		
		return loanType;
	}

	@Override
	public void deleteLoanType(int LoanTypeId) {
		
		LoanTypeRepo.deleteById(LoanTypeId);
	}

	@Override
	public LoanTypeDTO getLoanTypeId(int loanType) {
		
		LoanType loan = LoanTypeRepo.findById(loanType).orElse(new LoanType());
		
		LoanTypeDTO loanTyp = new LoanTypeDTO();
		
		loanTyp.setLoanTypeId(loan.getLoanTypeId());
		loanTyp.setLoanTypeName(loan.getLoanTypeName());
		loanTyp.setLoanInterestrate(loan.getLoanInterestrate());
		loanTyp.setLoanTermInYear(loan.getLoanTermInYear());
		
		
		return loanTyp; 
	}

	@Override
	public List<LoanTypeDTO> getAllLoanType() {

		List<LoanType> loanList = LoanTypeRepo.findAll();
		List<LoanTypeDTO> loanList2 = new ArrayList<>();
		for(LoanType loan : loanList) {
			LoanTypeDTO loanTyp = new LoanTypeDTO();
			
			loanTyp.setLoanTypeId(loan.getLoanTypeId());
			loanTyp.setLoanTypeName(loan.getLoanTypeName());
			loanTyp.setLoanInterestrate(loan.getLoanInterestrate());
			loanTyp.setLoanTermInYear(loan.getLoanTermInYear());
			loanList2.add(loanTyp);
		}
		
		
		return loanList2;
	}

	@Override
	public LoanTypeDTO getLoanTypeByName(String loanTypeName) {

		LoanType loan = LoanTypeRepo.findByloanTypeName(loanTypeName);
		
		LoanTypeDTO loanTyp = new LoanTypeDTO();
		
		loanTyp.setLoanTypeId(loan.getLoanTypeId());
		loanTyp.setLoanTypeName(loan.getLoanTypeName());
		loanTyp.setLoanInterestrate(loan.getLoanInterestrate());
		loanTyp.setLoanTermInYear(loan.getLoanTermInYear());
		
		return loanTyp;
	}

	@Override
	public List<LoanTypeDTO> getLoanTypeInterestRateLessThan(int loanTypeInterestRate) {

		List<LoanType> loanList = LoanTypeRepo.findByloanInterestrateLessThan(loanTypeInterestRate);
		List<LoanTypeDTO> loanList2 = new ArrayList<>();
		for(LoanType loan : loanList) {
			LoanTypeDTO loanTyp = new LoanTypeDTO();
			
			loanTyp.setLoanTypeId(loan.getLoanTypeId());
			loanTyp.setLoanTypeName(loan.getLoanTypeName());
			loanTyp.setLoanInterestrate(loan.getLoanInterestrate());
			loanTyp.setLoanTermInYear(loan.getLoanTermInYear());
			loanList2.add(loanTyp);
		}
		
		return loanList2;
	}

	@Override
	public List<LoanTypeDTO> getLoanTypeInterestRateSorted(int loanTypeTermInYear) {

		List<LoanType> loanList = LoanTypeRepo.getByInterestRateSorted(loanTypeTermInYear);
		List<LoanTypeDTO> loanList2 = new ArrayList<>();
		for(LoanType loan : loanList) {
			LoanTypeDTO loanTyp = new LoanTypeDTO();
			
			loanTyp.setLoanTypeId(loan.getLoanTypeId());
			loanTyp.setLoanTypeName(loan.getLoanTypeName());
			loanTyp.setLoanInterestrate(loan.getLoanInterestrate());
			loanTyp.setLoanTermInYear(loan.getLoanTermInYear());
			loanList2.add(loanTyp);
		}
		
		
		return loanList2;
	}

	@Override
	public List<LoanTypeDTO> getLoanTypeInterestRateDeseSorted() {

		List<LoanType> loanList = LoanTypeRepo.findAll(Sort.by(Direction.DESC,"loanInterestrate"));
		List<LoanTypeDTO> loanList2 = new ArrayList<>();
		for(LoanType loan : loanList) {
			LoanTypeDTO loanTyp = new LoanTypeDTO();
			
			loanTyp.setLoanTypeId(loan.getLoanTypeId());
			loanTyp.setLoanTypeName(loan.getLoanTypeName());
			loanTyp.setLoanInterestrate(loan.getLoanInterestrate());
			loanTyp.setLoanTermInYear(loan.getLoanTermInYear());
			loanList2.add(loanTyp);
		}
		
		
		
		return loanList2;
	}
	
	
	

}
