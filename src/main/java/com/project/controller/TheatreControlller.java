package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.models.Theatre;
import com.project.service.TheatreService;

public class TheatreControlller {

	TheatreService theatreService;
	
	@Autowired
	public TheatreControlller(TheatreService theatreService) {
		this.theatreService=theatreService;
	}
	
	public Theatre addTheatre(String name,String address,Long cityId) {
		
		return null;
	}
}
