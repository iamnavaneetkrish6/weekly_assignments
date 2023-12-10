package com.hexaware.bootdemo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.bootdemo.dao.IProductRepository;
import com.hexaware.bootdemo.entity.Product;
@Service
public class ProductServiceImp implements IProductService {
    @Autowired
	IProductRepository repo;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.addProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.addProduct(product);
	}

	@Override
	public Product getByProductId(int productId) {
		// TODO Auto-generated method stub
		return repo.getByProductId(productId);
	}

	@Override
	public void deleteByProductId(int productId) {
		// TODO Auto-generated method stub
		repo.deleteByProductId(productId);
	}

	@Override
	public Set<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return repo.getAllProduct();
	}

}
