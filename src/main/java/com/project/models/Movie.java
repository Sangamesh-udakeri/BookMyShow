package com.project.models;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
@Entity
public class Movie extends BaseModel {

	private String name;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<Language> languages;
	@ManyToMany
	private List<Actor> actors;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<MovieFeature> movieFeatures;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	public List<MovieFeature> getMovieFeatures() {
		return movieFeatures;
	}
	public void setMovieFeatures(List<MovieFeature> movieFeatures) {
		this.movieFeatures = movieFeatures;
	}
	
}
