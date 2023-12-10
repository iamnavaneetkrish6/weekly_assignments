package com.hexaware.bootdemo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.bootdemo.entity.Product;
import com.hexaware.bootdemo.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	IProductService service;
	@GetMapping("/getall")
	public Set<Product> getAllProducts() {
		
		return service.getAllProduct();
		
	}
	@PostMapping("/add")
   public Product addProduct(@RequestBody Product product) {
	   return service.addProduct(product);
   }
	@PutMapping("/update")
	   public Product updateProduct(@RequestBody Product product) {
		   return service.updateProduct(product);
	   }
	@DeleteMapping("/delete/{pid}")
	   public void deleteProduct(@PathVariable int pid) {
		   service.deleteByProductId(pid);
	   }
	@GetMapping("/get/{pid}")
	public Product getProduct(@PathVariable int pid) {
		return service.getByProductId(pid);
				
	}
}
