package com.wendy.models;

public class Employee {
	
	private int id ;
	private String name;
	public Employee() {
		
		super();
		System.out.print("Default Constructor invoked");

	}
	public Employee(int id, String name) {
		
		super();
		System.out.print("Parameter constructor invoked");
		this.id = id;
		this.name = name;
	}
	
	public Employee( String name, int id) {
		
		super();
		System.out.print("Parameter constructor invoked");
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
