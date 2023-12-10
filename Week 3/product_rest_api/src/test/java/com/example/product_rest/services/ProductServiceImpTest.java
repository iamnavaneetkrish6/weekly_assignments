package com.example.product_rest.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.product_rest.dto.ProductDTO;
import com.example.product_rest.entities.Products;
@SpringBootTest
class ProductServiceImpTest {
    @Autowired
	IProductService service;
	
	@Test
	void testAddProduct() {
		ProductDTO productDTO=new ProductDTO();
		productDTO.setPname("pen");
		productDTO.setPrice(2000);
		Products product =service.addProduct(productDTO);
		//assertNotNull(product);
		assertEquals("pen",product.getPname());
		
		
	}

	@Test
	void testGetBYId() {

	}

	@Test
	void testGetAll() {
		
	}

}
