package com.wendy.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wendy.model.User;

/**
 * 
 * @author XX605
 *
 * @Repsitory Annotation:
 * 
 * This annotation is used with DAO interfaces
 * This helps in internal implementation 
 * Such as connectivity with file system, Network or Database
 * 
 */

@Repository
public class UserRepositoryImp implements UserRepository   {
	
	
	private static List<User> userList = new ArrayList<User>();
	
	public UserRepositoryImp() {
		userList.add(new User(101,"King","Kochhar","king@gamil.com"));
		userList.add(new User(102,"John","Smith","John@gamil.com"));
		userList.add(new User(103,"Sarah","Bowling","sarah@gamil.com"));
		userList.add(new User(104,"Gautam","Bhalla","guata@gamil.com"));
	}
	
	
	@Override
	public List<User> getUsers() {
		return userList;
	}

	@Override
	public User findUserById(long id) {
		for(User user: userList)
			if(user.getId() == id)
				return user;
		return null;
	}


	@Override
	public void createUser(User user) {
		userList.add(user);
		
	}


	@Override
	public User deleteUserById(long id) {
		User user = findUserById(id);
		if(user != null) {
			userList.remove(user);
			return user;
		}
		return null;
	}


	@Override
	public User Update(User user, long id) {
		User usr = findUserById(id);
		if(usr!=null) {
			usr.setFirstName(user.getFirstName());
			usr.setLastName(user.getLastName());
			usr.setEmail(user.getEmail());
			
			return usr;
		}
		return null;
	}

}
