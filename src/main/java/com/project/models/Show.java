package com.project.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Show extends BaseModel {

	@ManyToOne
	private Movie movie;
	private Date  startTime;
	private Date  endTime;
	@ManyToOne
	private Auditorium auditorium;
	@OneToMany(mappedBy = "show")
	private List<ShowSeat> showSeats;
	@OneToMany
	private List<ShowSeatType> showSeatsTypes;
	@Enumerated(EnumType.STRING)
	private Language language;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<ShowFeature> showFeatures;
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Auditorium getAuditorium() {
		return auditorium;
	}
	public void setAuditorium(Auditorium auditorium) {
		this.auditorium = auditorium;
	}
	public List<ShowSeat> getShowSeats() {
		return showSeats;
	}
	public void setShowSeats(List<ShowSeat> showSeats) {
		this.showSeats = showSeats;
	}
	public List<ShowSeatType> getShowSeatsTypes() {
		return showSeatsTypes;
	}
	public void setShowSeatsTypes(List<ShowSeatType> showSeatsTypes) {
		this.showSeatsTypes = showSeatsTypes;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public List<ShowFeature> getShowFeatures() {
		return showFeatures;
	}
	public void setShowFeatures(List<ShowFeature> showFeatures) {
		this.showFeatures = showFeatures;
	}
	
}
