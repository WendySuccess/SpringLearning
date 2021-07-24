package com.wendy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendy.model.ProductCategory;
import com.wendy.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {

	@Autowired
	 ProductCategoryRepository productCategoryRepository;
	
	 public List<ProductCategory>getAllproductCategory(){
		 return productCategoryRepository.findAll();
	 }
}
