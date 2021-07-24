package com.wendy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo")
public class HelloWorldController {
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String sayHello() {
		return "helloWorld";
	}

}
