package com.wendy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendy.model.User;
import com.wendy.repository.UserRepository;

/**
 * 
 * @author XX605
 *
 * @Service Annotation 
 * 
 *  - this annotation can be used with classes and interfaces
 *  - this annotation behave the way using @component 
 *  - these class know as Domain or business logics
 */


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository ;
	
	@Override
	public List<User> getUsers() {
		return userRepository.getUsers();
	}

	@Override
	public User findUserById(long id) {
		return userRepository.findUserById(id);
	}

	@Override
	public void createUser(User user) {
		userRepository.createUser(user);
	}


	@Override
	public User Update(User user, long id) {
		return  userRepository.Update(user, id);
	}


	@Override
	public User deleteUserById(long userId) {
		return userRepository.deleteUserById(userId);
	}



}