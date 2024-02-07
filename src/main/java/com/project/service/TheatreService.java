package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.exception.CityNotFoundException;
import com.project.models.City;
import com.project.models.Theatre;
import com.project.repository.CityRepository;
import com.project.repository.TheatreRepository;

@Service
public class TheatreService {

	private TheatreRepository theatreRepository;
	private CityRepository cityRepository;
	@Autowired
	public TheatreService(TheatreRepository theatreRepository,CityRepository cityRepository) {
		this.theatreRepository=theatreRepository;
		this.cityRepository=cityRepository;
	}
	public Theatre createTheatre(String name,String address,Long cityId) throws CityNotFoundException {
		
		Optional<City> city = cityRepository.findById(cityId);
		if(!city.isPresent()) {
			throw new CityNotFoundException("No City With The Id");
		}
	
		Theatre theatre=new Theatre();
		theatre.setName(name);
		theatre.setAddress(address);
		
		return theatreRepository.save(theatre);
		
		
		
	}
}
