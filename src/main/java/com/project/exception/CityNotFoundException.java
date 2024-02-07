package com.project.exception;

import lombok.experimental.SuperBuilder;

public class CityNotFoundException extends Exception {

	public CityNotFoundException(String message) {
		super(message);
	}
}
