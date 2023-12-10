package com.hexaware.bootdemo.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.hexaware.bootdemo.entity.Product;
@Repository
public class ProductRepositoryImp implements IProductRepository {
    Set<Product> productSet=new HashSet<Product>();
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productSet.add(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		productSet.add(product);
		System.out.println(product);
		return product;
	}

	@Override
	public Product getByProductId(int productId) {
		// TODO Auto-generated method stub
		Product product1=null;
		for(Product product:productSet) {
			if(product.getProductId()==productId) {
				product1=product;
			}
		}
		return product1;
	}

	@Override
	public void deleteByProductId(int productId) {
		// TODO Auto-generated method stub
		for(Product product:productSet) {
			if(product.getProductId()==productId) {
				productSet.remove(product);
				System.out.println("sucessfully deleted");
			}
		}
	}

	@Override
	public Set<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productSet;
	}

}
