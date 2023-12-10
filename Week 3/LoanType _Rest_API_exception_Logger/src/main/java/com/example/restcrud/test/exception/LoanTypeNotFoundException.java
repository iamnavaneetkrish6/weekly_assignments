package com.example.restcrud.test.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class LoanTypeNotFoundException extends ResponseStatusException{

	public LoanTypeNotFoundException(HttpStatusCode status, String Msg) {

		super(status,Msg);
	
	}

}
