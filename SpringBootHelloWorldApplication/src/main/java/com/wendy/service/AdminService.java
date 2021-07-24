package com.wendy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendy.model.Admin;
import com.wendy.repository.AdminRepository;

@Service
public class AdminService {
	
	 @Autowired
	 AdminRepository adminRepository;
	 
	 public List<Admin>getAllAdmin(){
		 //System.out.println(tutorialRepository.findAll());
		 return adminRepository.findAll();
	 }

	 public String login() {
		 System.out.println("here is login controller");
		return null;
		 
	 }
}
