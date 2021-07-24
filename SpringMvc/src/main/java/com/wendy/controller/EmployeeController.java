package com.wendy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wendy.dao.EmployeeDao;
import com.wendy.models.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao ;
	
	@RequestMapping("/")
	public String getEmployees(Model model) {
		List<Employee> list = dao.getEmployees();
		System.out.println(list);
		model.addAttribute("list", list);
		return"employees/employees";
		
	}

}
