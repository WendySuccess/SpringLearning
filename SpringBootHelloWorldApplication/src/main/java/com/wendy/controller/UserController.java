package com.wendy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wendy.model.Product;
import com.wendy.model.User;
import com.wendy.repository.ProductRepository;
import com.wendy.repository.UserRepository;
import com.wendy.service.ProductService;
import com.wendy.service.UserServiceImpl;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	UserRepository userRespository;
	
	@Autowired
	UserServiceImpl userService;

	@RequestMapping("/")
	public String getList(Model model) {
		model.addAttribute("user", new User());
		try {
			List<User> users = userService.getAllUser();
			System.out.println(users);
			if(users.isEmpty()) {}
			else {
				model.addAttribute("users", users);
			}
		} catch (Exception ex)
		{}
		return "userList";
	}
	
	 @SuppressWarnings("null")
	@PostMapping("/search")
	public String Search(@ModelAttribute("user") User user,Model model) {
		 System.out.println(user.getUsername());
		 User userserach = userService.findByUsername(user.getUsername());
		 System.out.println("below is user search");
		 System.out.println(userserach);
		 List<User> users = new  ArrayList<User>()  ;
		
		 if(userserach == null) {}
			else {
				 users.add(userserach);
				 model.addAttribute("users", users);
			}
		return "userList";
	}
	
}
