package com.wendy.dao;

import java.util.List;

import com.wendy.model.User;

public interface UserDao {
	
	void save(User user);
	List<User> list();

}
