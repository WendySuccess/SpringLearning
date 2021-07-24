package com.wendy.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wendy.models.HelloWorld;

@Controller
@RequestMapping("/")
public class HelloworldController {
	
	@RequestMapping("/")
	public String getMessage() {
		return "/helloWorld";
	}
	
	@RequestMapping("/message")
	public String getMessageDetails(Model model) {
		HelloWorld hellowworld = new HelloWorld();
		hellowworld.setMessage("Let learn ");
		hellowworld.setDateTime(LocalDateTime.now().toString());
        
        model.addAttribute("helloWorld", hellowworld);
		return "/message";
	}

}
