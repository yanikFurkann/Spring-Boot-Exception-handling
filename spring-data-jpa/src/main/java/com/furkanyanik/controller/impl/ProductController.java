package com.furkanyanik.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furkanyanik.controller.IProductController;
import com.furkanyanik.model.Product;
import com.furkanyanik.services.IProductService;
@RestController
@RequestMapping("/rest/api/product")
public class ProductController implements IProductController {
@Autowired
	private IProductService productService;
	


@PostMapping(path = "/save")
	@Override
	public Product saveProduct(@RequestBody Product product) {
	return	productService.saveProduct(product);
		
	}

@GetMapping(path = "/list")
@Override
public List<Product> findAllProducts() {
return	productService.findAllProducts();

}


@GetMapping(path = "/list/{id}")
@Override
public Product findByProduct(@PathVariable(name = "id") Integer Id) {
return	productService.findByProduct(Id);

}
@DeleteMapping(path = "/delete/{id}")
@Override
public void deleteProduct(@PathVariable(name = "id") Integer id) {
productService.deleteProduct(id);
	
}






}
