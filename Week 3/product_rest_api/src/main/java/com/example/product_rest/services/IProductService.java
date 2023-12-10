package com.example.product_rest.services;

import java.util.List;

import com.example.product_rest.dto.ProductDTO;
import com.example.product_rest.entities.Products;

public interface IProductService {
    public Products addProduct(ProductDTO productDTO);
    public ProductDTO getBYId(int pid);
    public List<Products> getAll();
}
