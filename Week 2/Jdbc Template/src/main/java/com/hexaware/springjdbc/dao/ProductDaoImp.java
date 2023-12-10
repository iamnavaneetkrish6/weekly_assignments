package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Product;


@Repository
public class ProductDaoImp implements IProductDao {

	JdbcTemplate jdbcTemplate;

	
	
	
	@Autowired
	public ProductDaoImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	
	@Override
	public boolean createProduct(Product product) {

		String insert = "insert into Product values(?,?,?)";
		
	     int count =	jdbcTemplate.update(insert, product.getId(),product.getProductName(),product.getPrice());
		
		return count >0;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductBYID(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
