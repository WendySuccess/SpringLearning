package com.wendy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wendy.models.User;

@Controller
@RequestMapping("/users")
public class userController {

	
		@RequestMapping("/")
		public String getMessage() {
			return "/user-list";
		}
		
		@RequestMapping(value = "/register" , method = RequestMethod.GET)
		public String registerNewUser(Model model) {
			User user = new User();
			model.addAttribute("UserObj",user);
			return "/user-register";
		}
		
		@RequestMapping(value = "/userRegistration" , method = RequestMethod.POST)
		public String registerUser(@ModelAttribute("userObj") User user, Model model) {
			System.out.println(user);
			model.addAttribute("user" , user);
			return "/user-success";
		}
	
	
}
	
