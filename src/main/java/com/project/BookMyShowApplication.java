package com.project;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.controller.UserController;
import com.project.dto.CreateUserReqDto;
import com.project.dto.CreateUserResDto;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

	@Autowired
	UserController controller;
	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		CreateUserReqDto createUserReqDto=new CreateUserReqDto();
		createUserReqDto.setEmail("Sangamesh@gmail.com");
		CreateUserResDto createUser = controller.createUser(createUserReqDto);
		System.out.println(createUser);
	}

}
