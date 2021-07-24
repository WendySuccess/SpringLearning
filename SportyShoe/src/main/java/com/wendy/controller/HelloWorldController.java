package com.wendy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendy.repository.AdminRepository;
import com.wendy.repository.TutorialRepository;
import com.wendy.service.AdminService;
import com.wendy.service.TutorialService;

@Controller
public class HelloWorldController {
	
	@Autowired
	AdminRepository adminRespository;
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/")
	public String sayHello() {
		System.out.println("test");
		return "welcome";
	}
	
	@RequestMapping("/LoginController")
	public String LoginController() {
		adminService.login();
		return "adminLogin";
	}

}
