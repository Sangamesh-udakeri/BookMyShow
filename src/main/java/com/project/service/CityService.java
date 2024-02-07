package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.City;
import com.project.repository.CityRepository;

@Service
public class CityService {

	CityRepository cityRepository;
	
	@Autowired
	public CityService(CityRepository cityRepository) {
		this.cityRepository=cityRepository;
	}
	public City addCity(String name) {
		City city=new City();
		city.setName(name);
		return cityRepository.save(city);
	}
	
}
