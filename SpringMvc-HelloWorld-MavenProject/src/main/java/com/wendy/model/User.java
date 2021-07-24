package com.wendy.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;



@Entity
@Table(name = "Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid")
	private int Id;
	
	@Column(name = "uname")
	@Size(max = 20 , min = 3 , message = "{user.name.invalid}")
	private String name;
	
	@Column(name = "uemail", unique = true)
	@Email(message ="user.email.invalid}")
	private String email;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	

}
