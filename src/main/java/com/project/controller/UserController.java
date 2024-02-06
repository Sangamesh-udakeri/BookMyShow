package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project.dto.CreateUserReqDto;
import com.project.dto.CreateUserResDto;
import com.project.models.User;
import com.project.service.UserService;

@Controller
public class UserController {

	UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	public CreateUserResDto createUser(CreateUserReqDto createUserReqDto) {
		
		User createUser = userService.createUser(createUserReqDto.getEmail());
		CreateUserResDto createUserResDto=new CreateUserResDto();
		createUserResDto.setUser(createUser);
		return createUserResDto;
	}
}
