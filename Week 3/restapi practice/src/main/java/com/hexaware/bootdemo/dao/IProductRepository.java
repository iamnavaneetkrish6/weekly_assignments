package com.hexaware.bootdemo.dao;

import java.util.Set;

import com.hexaware.bootdemo.entity.Product;

public interface IProductRepository {
	public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public Product getByProductId(int productId);
    public void deleteByProductId(int productId);
    public Set<Product> getAllProduct();

}
