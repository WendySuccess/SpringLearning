package com.wendy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wendy.model.Purchase;
import com.wendy.model.User;
import com.wendy.repository.PurchaseRepository;
import com.wendy.repository.UserRepository;
import com.wendy.service.PurchaseService;
import com.wendy.service.UserServiceImpl;

@Controller
@RequestMapping("/Report")
public class PurchaseController {
	
	
	@Autowired
	PurchaseRepository purchaseRespository;
	
	@Autowired
	PurchaseService purchaseService;

	@RequestMapping("/")
	public String getList(Model model) {
		model.addAttribute("purchase", new Purchase());
		try {
			List<Purchase> purchase = purchaseService.getAllPurchase();
			System.out.println(purchase);
			if(purchase.isEmpty()) {}
			else {
				model.addAttribute("purchase", purchase);
			}
		} catch (Exception ex)
		{}
		return "purchaseList";
	}
	
	 @SuppressWarnings("null")
	@PostMapping("/search")
	public String Search(@ModelAttribute("user") User user,Model model) {
//		 System.out.println(user.getUsername());
//		 User userserach = userService.findByUsername(user.getUsername());
//		 System.out.println("below is user search");
//		 System.out.println(userserach);
//		 List<User> users = new  ArrayList<User>()  ;
//		
//		 if(userserach == null) {}
//			else {
//				 users.add(userserach);
//				 model.addAttribute("users", users);
//			}
		return "userList";
	}

}
