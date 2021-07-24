package com.wendy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wendy.config.AppConfig;
import com.wendy.models.Employee;
import com.wendy.models.Student;
import com.wendy.models.User;

public class Application {

	
		public static void main(String[] args) {
//			User user = new User();
//			user.setname("wendy");
//			System.out.print(user);
			
//			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//			User user = context.getBean("userObj",User.class);
//			System.out.print(user);
//			((AbstractApplicationContext)context).close();
			
//			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//			Student student = context.getBean("studentObj",Student.class);
//			System.out.print(student);
//			((AbstractApplicationContext)context).close();
			
			
//			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//			Employee user = context.getBean("empobj",Employee .class);
//			System.out.print(user);
//			((AbstractApplicationContext)context).close();
			
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee student = context.getBean("empObj",Employee.class);
		System.out.print(student);
		((AbstractApplicationContext)context).close();
			
			
		}
}
