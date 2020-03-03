package com.capg.movieticket.booking.dao;

import java.util.Set;

import com.capg.moviebooking.entities.Booking;
import com.capg.moviebooking.entities.Seat;

public interface IBookingDao {
	
	void addBooking(Booking b);
	double calculateTotalCost(Booking b);

	PaymentMethod choosePaymentMethod();

	boolean makePayment(PaymentMethod Double);

	boolean cancelTickets(Seat s);
	Set<Booking> allBooking();
}
