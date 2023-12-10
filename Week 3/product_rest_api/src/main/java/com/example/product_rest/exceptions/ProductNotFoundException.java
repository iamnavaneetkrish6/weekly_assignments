package com.example.product_rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ProductNotFoundException extends ResponseStatusException{

	public ProductNotFoundException(HttpStatus status,String msg) {
		super(status,msg);
		
	}
		
	}


