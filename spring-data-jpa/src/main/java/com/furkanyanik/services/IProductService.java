package com.furkanyanik.services;

import java.util.List;

import com.furkanyanik.model.Product;

public interface IProductService {
public Product saveProduct (Product product);

public List<Product> findAllProducts();

public Product findByProduct(Integer Id);

public void deleteProduct(Integer Id);

}
