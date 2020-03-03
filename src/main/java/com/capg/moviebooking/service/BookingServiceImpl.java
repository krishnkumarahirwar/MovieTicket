package com.capg.moviebooking.service;

import java.util.Set;

import com.capg.moviebooking.entities.Booking;
import com.capg.moviebooking.util.Validate;
import com.capg.movieticket.booking.dao.BookingDaoImpl;
import com.capg.movieticket.booking.dao.IBookingDao;
import com.capg.movieticket.booking.dao.PaymentMethod;
import com.capg.moviebooking.entities.Seat;


public class BookingServiceImpl implements IBookingService {
	private IBookingDao dao;
	
	
	public BookingServiceImpl(BookingDaoImpl dao) {
		this.dao=dao;
	}

	/*
	 *@param:takes booking object 
	 *@return: void
	 **/
	@Override
	public void addBooking(Booking b) {
		Validate.validateId(b.getBookingId());
		dao.addBooking(b);
		
		
	}

	/*
	 *@param: takes booking object and calculates the cost 
	 *@return: total cost
	 **/
	
	@Override
	public double calculateTotalCost(Booking b) {
		Validate.validateId(b.getBookingId());
		double d=dao.calculateTotalCost(b);
		return d;
	}
	/*
	 *@param: takes payment method by user 
	 *@return: payment method
	 **/
	
	@Override
	public PaymentMethod choosePaymentMethod() {
		PaymentMethod pm=dao.choosePaymentMethod();		
		return pm;
	}
	/*
	 *@param: takes payment method 
	 *@return: boolean
	 **/
	
	@Override
	public boolean makePayment(PaymentMethod D) {
		boolean flag=dao.makePayment(D);
		return flag;
	}
	/*
	 *@param: takes seat and cancels the booking
	 *@return: boolean
	 **/
	@Override
	public boolean cancelTickets(Seat s) {
		boolean flag=dao.cancelTickets(s);
		return flag;
	}
	/*
	 *returns set of seats
	 */
	@Override
	public Set<Booking> allBooking(){
		Set<Booking> s=dao.allBooking();
		return s;
	}
	

}
