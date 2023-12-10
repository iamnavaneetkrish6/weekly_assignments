package com.example.product_rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product_rest.dto.ProductDTO;
import com.example.product_rest.entities.Products;
import com.example.product_rest.repository.ProductRepository;
@Service
public class ProductServiceImp implements IProductService {
    @Autowired
    ProductRepository repo;
	@Override
	public Products addProduct(ProductDTO productDTO) {
		
    	// TODO Auto-generated method stub
		Products product=new Products();
		product.setPname(productDTO.getPname());
		product.setPrice(productDTO.getPrice());
    	return repo.save(product);
	}

	@Override
	public ProductDTO getBYId(int pid) {
		// TODO Auto-generated method stub
		Products product=repo.findById(pid).orElse(new Products());
		ProductDTO productDTO=new ProductDTO();
		productDTO.setPid(product.getPid());
		productDTO.setPname(product.getPname());;
		productDTO.setPrice(product.getPrice());
		return productDTO;
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
