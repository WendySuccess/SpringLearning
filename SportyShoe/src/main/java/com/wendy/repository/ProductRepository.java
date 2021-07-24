package com.wendy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.model.Product;
import com.wendy.model.Tutorial;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
