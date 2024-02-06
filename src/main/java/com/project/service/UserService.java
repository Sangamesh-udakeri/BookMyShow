package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.User;
import com.project.repository.UserRepository;

@Service
public class UserService {

	UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public User createUser(String email) {
		User user=new User();
		user.setEmail(email);
		return userRepository.save(user);
	}
}
