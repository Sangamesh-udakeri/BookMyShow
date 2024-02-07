package com.project;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.controller.CityController;
import com.project.controller.UserController;
import com.project.dto.CreateUserReqDto;
import com.project.dto.CreateUserResDto;
import com.project.models.City;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

	@Autowired
	UserController controller;
	
	@Autowired
	CityController cityController;
	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		City addCity = cityController.addCity("Bangalore");
		System.out.println(addCity);
	}

}
