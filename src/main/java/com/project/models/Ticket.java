package com.project.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ticket extends BaseModel{

	@ManyToOne
	private User bookedBy;
	@ManyToOne
	private Show show;
	@ManyToMany
	private List<ShowSeat> showSeats;
	@Enumerated(EnumType.STRING)
	private TicketStatus ticketStatus;
	private double amount;
	private Date timeOfBooking;
	
}


  