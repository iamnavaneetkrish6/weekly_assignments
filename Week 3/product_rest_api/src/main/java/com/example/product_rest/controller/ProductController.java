package com.example.product_rest.controller;

import java.util.List;

import javax.validation.constraints.Min;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_rest.dto.ProductDTO;
import com.example.product_rest.entities.Products;
import com.example.product_rest.exceptions.ProductNotFoundException;
import com.example.product_rest.services.IProductService;
@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	IProductService service;
    org.slf4j.Logger logger= LoggerFactory.getLogger(ProductController.class);
	@PostMapping("/add")
	public Products addProduct( @RequestBody ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return service.addProduct(productDTO);
	}

	@GetMapping("/get/{pid}")
	public ProductDTO getById(@PathVariable @Min(1) int pid) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		ProductDTO productDTO;
		productDTO=service.getBYId(pid);
		if(productDTO.getPid()==0) {
			throw new ProductNotFoundException(HttpStatus.BAD_REQUEST,"this is not good"+pid);
		}
		return productDTO;
		
	}

	@GetMapping("/getall")
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@GetMapping("/div/{a}/{b}")
	public double div(@PathVariable int a, @PathVariable int b) {
		System.out.println(a);
		logger.info("i am info");
		logger.warn("i am warning");
		return a/b;
	}
	@ResponseStatus(value=HttpStatus.FORBIDDEN,reason="Sorry you cant divide by zero")
	@ExceptionHandler(ArithmeticException.class)
	public void handleEception() {
		
	}
	/*@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="sorry")
	@ExceptionHandler(ProductNotFoundException.class)
	public  void handleProductNotFoundExp(){
		//return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}*/
	
}

