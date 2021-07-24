package com.wendy.service;

import java.util.List;

import com.wendy.model.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User findUserById(long id);
	public void createUser(User user);
	public User deleteUserById(long userId);
	public User Update(User user, long id);

	
}
