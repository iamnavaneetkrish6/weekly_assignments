package com.example.restcrud.test.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restcrud.test.dto.LoanTypeDTO;
import com.example.restcrud.test.exception.LoanTypeNotFoundException;
import com.example.restcrud.test.service.ILoanTypeService;

@RestController
@RequestMapping("/api/loantype")
public class LoanTypeController {

	@Autowired
	ILoanTypeService loanTypeService;
	
	@PostMapping(value ="/add", consumes = "application/json", produces = "application/json")
	public LoanTypeDTO addLoanType(@RequestBody LoanTypeDTO loanType) {
		
		return loanTypeService.createLoanType(loanType);
	}
	
	@PutMapping(value="/update",consumes = "application/json", produces = "application/json" )
	public LoanTypeDTO updateLoanType(@RequestBody LoanTypeDTO loanType) {
		
		return loanTypeService.updateLoanType(loanType);
	}
	
	@DeleteMapping(value ="/delete/{id}",consumes = "application/json")
	public String deleteLoanType(@PathVariable int id) {
		
		loanTypeService.deleteLoanType(id);
		return "Deleted the LoanType ";
	}
	
	
	
	
	@GetMapping(value="/getbyid/{id}",produces = "application/json")
	public LoanTypeDTO getByLoanTypeId(@PathVariable int id) {
		
		LoanTypeDTO loan = loanTypeService.getLoanTypeId(id);
		
		if(loan.getLoanTypeId() == 0) {
			throw new LoanTypeNotFoundException(HttpStatus.NOT_FOUND,"Loantype not Found"+id);
		}
		
		
		
		
		return loan;
	}
	
	@ExceptionHandler({LoanTypeNotFoundException.class})
	public ResponseEntity<String> NotFoundExp(LoanTypeNotFoundException le){
		
		return new ResponseEntity<>(le.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	@GetMapping(value="/getAll", produces = "application/json")
	public List<LoanTypeDTO> getAllLoanTypes() {
		
		return loanTypeService.getAllLoanType();
	}
	
	@GetMapping(value="/getAllinterestratesorted/{termyear}", produces = "application/json")
	public List<LoanTypeDTO> getAllLoanTypesSorted(@PathVariable int year) {
		
		return loanTypeService.getLoanTypeInterestRateSorted(year);
	}
	
	@GetMapping(value="/getAllinterestratelt/{rate}", produces = "application/json")
	public List<LoanTypeDTO> getAllLoanTypesInterRateLT(@PathVariable int rate) {
		
		return loanTypeService.getLoanTypeInterestRateLessThan(rate);
	}
	
	@GetMapping(value="/getbyName/{Name}",produces = "application/json")
	public LoanTypeDTO getByLoanTypeByName(@PathVariable String name) {
		
		return loanTypeService.getLoanTypeByName(name);
	}
	
	
	@GetMapping(value="/getAllinterestratedesc", produces = "application/json")
	public List<LoanTypeDTO> getAllLoanTypesInterRateDesc() {
		
		return loanTypeService.getLoanTypeInterestRateDeseSorted();	
}
}