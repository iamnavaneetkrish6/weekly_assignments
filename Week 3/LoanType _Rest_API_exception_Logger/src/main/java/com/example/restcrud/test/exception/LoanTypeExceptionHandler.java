package com.example.restcrud.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LoanTypeExceptionHandler {

	@ExceptionHandler({Exception.class})
	public ResponseEntity<String> exceptionHandler(Exception e){
		
		return new ResponseEntity<String>(e.toString(), HttpStatus.NOT_FOUND);
	}

}
