package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project.models.City;
import com.project.service.CityService;

@Controller
public class CityController {

	CityService cityService;
	
	@Autowired
	public CityController(CityService cityService) {
	
		this.cityService=cityService;
	}
	public City addCity(String name) {
		return cityService.addCity(name);
	}
}
