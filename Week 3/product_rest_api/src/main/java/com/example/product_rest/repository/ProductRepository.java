package com.example.product_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.product_rest.entities.Products;
@Repository
public interface ProductRepository extends JpaRepository<Products,Integer>{

}
