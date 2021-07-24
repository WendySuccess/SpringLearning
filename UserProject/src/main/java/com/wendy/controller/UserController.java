package com.wendy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wendy.dao.UserDao;
import com.wendy.models.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserDao dao ;
	
	@RequestMapping("/")
	public String getUser(Model model) {
		List<User> list = dao.getUsers();
		System.out.println(list);
		model.addAttribute("list", list);
		return "user/userlist";
	}
}
