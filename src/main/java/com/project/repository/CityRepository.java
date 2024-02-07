package com.project.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.models.City;

public interface CityRepository extends JpaRepository<City, Long> {

	@Override
	Optional<City> findById(Long id);
}
