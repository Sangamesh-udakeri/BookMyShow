package com.project.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Theatre extends BaseModel {

	private String name;
	private String address;
	@OneToMany
	private List<Show> upcomingShows;
	@OneToMany(mappedBy = "theatre")
	private List<Auditorium> auditoriums;
	public List<Auditorium> getAuditoriums() {
		return auditoriums;
	}
	public void setAuditoriums(List<Auditorium> auditoriums) {
		this.auditoriums = auditoriums;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Show> getUpcomingShows() {
		return upcomingShows;
	}
	public void setUpcomingShows(List<Show> upcomingShows) {
		this.upcomingShows = upcomingShows;
	}
	
}
