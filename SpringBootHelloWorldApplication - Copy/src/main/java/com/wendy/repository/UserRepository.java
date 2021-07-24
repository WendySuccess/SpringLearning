package com.wendy.repository;

import java.util.List;

import com.wendy.model.User;

public interface UserRepository {
	
	public List<User> getUsers();
	public User findUserById(long id);
	public void createUser(User user);
	public User deleteUserById(long id);
	public User Update(User user, long id);

}
