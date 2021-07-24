package com.wendy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

}
