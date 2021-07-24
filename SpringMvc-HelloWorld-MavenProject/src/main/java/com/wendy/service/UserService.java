package com.wendy.service;

import java.util.List;

import com.wendy.model.User;

public interface UserService {

	
	void save(User user);
    List<User> list();
}
