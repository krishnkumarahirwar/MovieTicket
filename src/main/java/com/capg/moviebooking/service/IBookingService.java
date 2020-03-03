package com.capg.moviebooking.service;

import java.util.Set;

import com.capg.moviebooking.entities.Booking;
import com.capg.movieticket.booking.dao.PaymentMethod;
import com.capg.moviebooking.entities.Seat;

public interface IBookingService {
	void addBooking(Booking b);
	double calculateTotalCost(Booking b);
	PaymentMethod choosePaymentMethod();
	boolean makePayment (PaymentMethod Double);
	boolean cancelTickets(Seat s);
	public Set<Booking> allBooking();

}
