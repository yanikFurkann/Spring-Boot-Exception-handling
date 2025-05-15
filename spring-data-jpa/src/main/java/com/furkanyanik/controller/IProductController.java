package com.furkanyanik.controller;

import java.util.List;

import com.furkanyanik.model.Product;

public interface IProductController {
	public Product saveProduct (Product product);
	public List<Product> findAllProducts();
	public Product findByProduct(Integer Id);
	
	public void deleteProduct(Integer Id);
}
