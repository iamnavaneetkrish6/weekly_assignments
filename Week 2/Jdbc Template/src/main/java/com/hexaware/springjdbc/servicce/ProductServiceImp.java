package com.hexaware.springjdbc.servicce;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.IProductDao;
import com.hexaware.springjdbc.model.Product;


@Service
public class ProductServiceImp implements IproductService {

	
	IProductDao dao;
	
	
	@Override
	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(pid);
	}

	@Override
	public Product getProductBYID(int pid) {
		// TODO Auto-generated method stub
		return dao.getProductBYID(pid);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

}
