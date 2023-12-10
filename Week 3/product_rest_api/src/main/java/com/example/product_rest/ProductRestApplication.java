package com.example.product_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRestApplication.class, args);
	}
	@Bean
    public RestTemplate getRestTemplate() {
    	return new RestTemplate();
    }
}
