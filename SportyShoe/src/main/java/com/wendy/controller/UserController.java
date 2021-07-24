package com.wendy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

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
	
	 @Autowired
	    private BCryptPasswordEncoder bCryptPasswordEncoder;


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
	 
	 @GetMapping("/ChangePassword")
	    public String ChangePassword(Model model) {
		 	
		 	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		 	System.out.println(auth.getPrincipal());
	        model.addAttribute("user", auth.getPrincipal());
	        
	        return "ChangePassword";
	    }

	    @PostMapping("/ChangePassword")
	    public RedirectView ChangePassword(@ModelAttribute("user") User userForm, RedirectAttributes redirectAttributes) {
	    	final RedirectView redirectView = new RedirectView("/User/ChangePassword", true);
	    	System.out.println(userForm);
	    	 User usertosave = userService.findByUsername(userForm.getUsername());
	    		System.out.println(usertosave);
	    	usertosave.setPassword(bCryptPasswordEncoder.encode(userForm.getPassword()));
	        //user.setRoles(new HashSet<>(roleRepository.findAll()));
	        userRespository.save(usertosave);
	        redirectAttributes.addFlashAttribute("addProductSuccess", true);
	        return redirectView;

	    }
	
}
