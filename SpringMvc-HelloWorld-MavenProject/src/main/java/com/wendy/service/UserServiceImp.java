package com.wendy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wendy.dao.UserDao;
import com.wendy.dao.UserDaoImp;
import com.wendy.model.User;

public class UserServiceImp implements UserService {
	
	
	@Autowired
	UserDao userDao;
	
//	UserDaoImp dao = new UserDaoImp();

	@Override
	@Transactional
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	@Transactional
	public List<User> list() {
		return userDao.list();
	}

}
