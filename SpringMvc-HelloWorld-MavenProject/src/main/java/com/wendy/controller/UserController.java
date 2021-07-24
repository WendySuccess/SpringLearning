package com.wendy.controller;


import java.util.Locale;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wendy.model.User;
import com.wendy.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String userForm(Locale locale , Model model) {
		model.addAttribute("user",new User());
		model.addAttribute("users",userService.list());
//		model.addAttribute("users",userService.list());)
		return "users/userForm";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("User") @Valid User user,
			BindingResult result , Model model) {
				return null;
		
	}
	
	

}
