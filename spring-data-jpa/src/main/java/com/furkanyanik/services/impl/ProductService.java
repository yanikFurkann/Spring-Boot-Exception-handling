package com.furkanyanik.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furkanyanik.exception.BaseException;
import com.furkanyanik.exception.ErorMessage;
import com.furkanyanik.exception.MessageType;
import com.furkanyanik.model.Product;
import com.furkanyanik.repository.ProductRepository;
import com.furkanyanik.services.IProductService;
@Service
public class ProductService implements IProductService{
@Autowired
private ProductRepository productRepository;
	
	
	@Override
	public Product saveProduct(Product product) {
		return 	productRepository.save(product);
		
	}


	@Override
	public List<Product> findAllProducts() {
	return	productRepository.findAll();
		
	}


	@Override
	public Product findByProduct(Integer Id) {
			
		Optional<Product> productOptional=productRepository.findById(Id);
	
		
		if (productOptional.isEmpty()) {
	throw new BaseException(new ErorMessage(MessageType.PRODUCT_NOT_FOUNT,Id.toString()));
	
	
		}
		
		
		 return	productOptional.get();
	}


	@Override
	public void deleteProduct(Integer id) {
	Optional<Product> productOptional=productRepository.findById(id);
	if (productOptional.isEmpty()) {
		throw new BaseException(new ErorMessage(MessageType.PRODUCT_NOT_FOUNT, id.toString()));
	}
	else
		
	productRepository.deleteById(id);
	throw new BaseException(new ErorMessage(MessageType.PRODUCT_SUCCESSFULLY_DELETE, id.toString()));
	}

}
