package com.wendy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendy.model.Product;
import com.wendy.repository.ProductRepository;

@Service
public class ProductService {
	
	 @Autowired
	 ProductRepository productRepository;

	 public List<Product>getAllProduct(){
		 return productRepository.findAll();
	 }
	 
	 public Product addProduct(Product product) {
		 return productRepository.save(product);
		 
	 }
	 
	 public Product updateProduct(Product product) {
		 return productRepository.save(product);
	 }
	 
	 public void deleteProductById(Long id) {
		 productRepository.deleteById(id); 
	    }
	 
	 
	 public Optional<Product> findProductById(Long id) {
		 Optional<Product> Product = productRepository.findById(id);
	        return Product;
	    }
	 
}
