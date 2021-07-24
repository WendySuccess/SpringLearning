package com.wendy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.wendy.model.User;
import com.wendy.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping("/")
	public List<User> getUsers() {
		List<User> users = userService.getUsers();
		return users;
	}
	
	@RequestMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable int userId) {
		User user = userService.findUserById(userId);
		if(user == null)
			return new ResponseEntity<>(user,HttpStatus.NOT_FOUND);	
		return new ResponseEntity<>(user,HttpStatus.OK);	
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Void> addNewUser(@RequestBody User user,UriComponentsBuilder ucBuilder){
		userService.createUser(user);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);		
	}
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable int userId){
		User user = userService.deleteUserById(userId);
		if(user == null)
			return new ResponseEntity<>(user,HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(user,HttpStatus.OK);	
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT , consumes = "application/json")
	public ResponseEntity<User> updateUserByID(@RequestBody User user){
		User userUpdated = userService.Update(user,user.getId());
		if(userUpdated == null)
			return new ResponseEntity<>(userUpdated,HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(userUpdated,HttpStatus.OK);	
	}

}
