package com.wendy.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wendy.model.User;

public class UserDaoImp implements UserDao {
	
	
	@Autowired
	SessionFactory sessionFactory ;
	

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> list() {
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

}
