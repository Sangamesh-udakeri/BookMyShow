package com.project.models;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Auditorium extends BaseModel {

	private String name;
	@OneToMany
	private List<Seat> seats;
	private int capacity;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<AuditoriumFeature> auditoriumFeatures;
	@ManyToOne
	private Theatre theatre;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<AuditoriumFeature> getAuditoriumFeatures() {
		return auditoriumFeatures;
	}
	public void setAuditoriumFeatures(List<AuditoriumFeature> auditoriumFeatures) {
		this.auditoriumFeatures = auditoriumFeatures;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	
}
