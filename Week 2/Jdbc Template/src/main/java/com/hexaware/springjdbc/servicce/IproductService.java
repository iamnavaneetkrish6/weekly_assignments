package com.hexaware.springjdbc.servicce;

import java.util.List;

import com.hexaware.springjdbc.model.Product;

public interface IproductService {

	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	
	public boolean deleteProduct (int pid);
	
	public Product getProductBYID(int pid);
	
	public List<Product> getAllProduct();
	
}
