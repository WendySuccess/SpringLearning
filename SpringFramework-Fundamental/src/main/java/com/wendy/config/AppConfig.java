package com.wendy.config;

import org.springframework.context.annotation.*;

import com.wendy.models.Employee;
import com.wendy.models.Student;

@Configuration
public class AppConfig {
	
	@Bean(name = "studentObj")
	public Student getStudentDetails() {
		Student student = new Student();
		student.setId(5001);
		student.setName("Kelly");
		return student;
	}
	
	@Bean(name = "empObj")
	public Employee getEmployee() {
		Employee emp = new Employee("Polla",500);
		return emp;
		
	}

}
