package com.wendy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendy.model.Purchase;
import com.wendy.repository.PurchaseRepository;

@Service
public class PurchaseService {
	
	 @Autowired
	 PurchaseRepository purchaseRepository;

	 public List<Purchase>getAllPurchase(){

		 return purchaseRepository.findAll();
	 }

}
