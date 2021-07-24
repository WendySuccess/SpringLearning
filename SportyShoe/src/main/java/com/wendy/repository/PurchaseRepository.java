package com.wendy.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.wendy.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase,Long> {
	
}
