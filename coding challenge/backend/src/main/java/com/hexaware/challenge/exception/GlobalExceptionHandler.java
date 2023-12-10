package com.hexaware.challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({
		Exception.class, PlayerNotFoundException.class
	})
      public ResponseEntity<String> handleResourceExceptions(Exception e) {
		
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}
	
}
