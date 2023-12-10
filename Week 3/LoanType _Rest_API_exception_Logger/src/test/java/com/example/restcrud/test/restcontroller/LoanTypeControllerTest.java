package com.example.restcrud.test.restcontroller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.example.restcrud.test.dto.LoanTypeDTO;

@SpringBootTest
class LoanTypeControllerTest {

	@Autowired
	RestTemplate restTemplate;
	
	Logger logger = LoggerFactory.getLogger(LoanTypeController.class);
	
	String baseURL = "http://localhost:8186/api/loantype";
	
	@Test
	void testAddLoanType() {
		
		LoanTypeDTO loanTypeDto = new LoanTypeDTO();
		loanTypeDto.setLoanTypeName("Education Loan");
		loanTypeDto.setLoanInterestrate(3);
		loanTypeDto.setLoanTermInYear(6);
		
		LoanTypeDTO p =    restTemplate.postForObject(baseURL+"/add", loanTypeDto , LoanTypeDTO.class);
             
		logger.info("LoanType Added"+ loanTypeDto.getLoanTypeName());
		
		assertNotNull(p);
	
	
	}

	@Test
	void testUpdateLoanType() {

		LoanTypeDTO loanTypeDto = new LoanTypeDTO();
		loanTypeDto.setLoanTypeName("Education Loan");
		loanTypeDto.setLoanInterestrate(4);
		loanTypeDto.setLoanTermInYear(6);
	
		restTemplate.put(baseURL+"/update", loanTypeDto);
		
		logger.info("update" + loanTypeDto.getLoanTypeName());
	}

	@Test
	void testDeleteLoanType() {
		fail("Not yet implemented");
	}

	@Test
	void testGetByLoanTypeId() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllLoanTypes() {
		fail("Not yet implemented");
	}

}
