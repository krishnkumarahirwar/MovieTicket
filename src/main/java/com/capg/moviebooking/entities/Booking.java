package com.capg.moviebooking.entities;

import java.time.LocalDate;

import com.capg.moviebooking.entities.Seat;

public class Booking {
private int bookingId;
private int movieId;
private int showId;
Show showRef;
private int transactionId;
private double totalCost;
Ticket ticket;
private Seat Seat;
public Booking() {
	super();
	
}
public Booking(int bookingId, int movieId, int showId, Show showRef, int transactionId, double totalCost, Ticket ticket,
		Seat Seat) {
	
	this.bookingId = bookingId;
	this.movieId = movieId;
	this.showId = showId;
	this.showRef = showRef;
	this.transactionId = transactionId;
	this.totalCost = totalCost;
	this.ticket = ticket;
	
	this.Seat=Seat;
}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public Show getShowRef() {
	return showRef;
}
public void setShowRef(Show showRef) {
	this.showRef = showRef;
}
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public double getTotalCost() {
	return totalCost;
}
public void setTotalCost(double totalCost) {
	this.totalCost = totalCost;
}
public Ticket getTicket() {
	return ticket;
}
public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}


public Seat getSeat() {
	return Seat;
}
public void setSeat(Seat seat) {
	this.Seat = Seat;
}
@Override
public int hashCode() {
	return bookingId;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Booking other = (Booking) obj;
	
	if (bookingId != other.bookingId)
		return false;
	if (movieId != other.movieId)
		return false;
	if (showId != other.showId)
		return false;
	if (showRef == null) {
		if (other.showRef != null)
			return false;
	} else if (!showRef.equals(other.showRef))
		return false;
	if (ticket == null) {
		if (other.ticket != null)
			return false;
	} else if (!ticket.equals(other.ticket))
		return false;
	if (Double.doubleToLongBits(totalCost) != Double.doubleToLongBits(other.totalCost))
		return false;
	if (transactionId != other.transactionId)
		return false;
	return true;
}



}
