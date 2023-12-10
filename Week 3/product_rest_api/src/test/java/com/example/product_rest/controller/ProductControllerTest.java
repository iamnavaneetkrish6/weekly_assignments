package com.example.product_rest.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.product_rest.dto.ProductDTO;
import com.example.product_rest.entities.Products;

import ch.qos.logback.classic.Logger;
@SpringBootTest
class ProductControllerTest {
    @Autowired
	RestTemplate restTemplate;
    org.slf4j.Logger logger =LoggerFactory.getLogger(ProductControllerTest.class);
	@Test
	void testAddProduct() {
		ProductDTO productDTO=new ProductDTO();
		productDTO.setPname("pendrive");
		productDTO.setPrice(200);
		Products product=restTemplate.postForObject("http://localhost:8181/api/products/add",productDTO, Products.class);
		assertNotNull(product);
	}

	@Test
	void testGetById() {
		int pid=1;
		//ResponseEntity<Products> response=restTemplate.getForEntity("http://localhost:8181/api/products/get/"+pid,Products.class);//response.getBody();
		Products product=restTemplate.getForObject("http://localhost:8181/api/products/get/"+pid,Products.class);
		
	    logger.info("uday"+product);
	    assertTrue(product.getPid()>0);
	    
	}

	@Test
	void testGetAll() {
		List<Products> products=restTemplate.getForObject("http://localhost:8181/api/products/getall",List.class);
	    logger.info("list of products"+products);
	    assertNotNull(products);
	}

	/*@Test
	void testDiv() {
		fail("Not yet implemented");
	}

	@Test
	void testHandleEception() {
		fail("Not yet implemented");
	}*/

}
