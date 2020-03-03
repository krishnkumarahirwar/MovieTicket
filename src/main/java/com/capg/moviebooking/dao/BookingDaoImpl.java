package com.capg.movieticket.booking.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.capg.moviebooking.entities.Booking;
import com.capg.moviebooking.entities.Seat;
import com.capg.moviebooking.exceptions.IncorrectArgumentException;

public class BookingDaoImpl implements IBookingDao {
	
		public static HashMap<Integer,Booking> store=new HashMap<>();
		
		
		/*
		 *@param: takes booking object 
		 *@return: void
		 **/
		@Override
		public void addBooking(Booking b) {
		store.put(b.getBookingId(), b);
	}

		/*
		 *@param: takes booking object and calculates the cost 
		 *@return: total cost
		 **/
		
		@Override
		public double calculateTotalCost(Booking b) {
			double tc=b.getTotalCost();
			return tc;
		}

		/*
		 *@param: takes payment method by user 
		 *@return: payment method
		 **/
		
		@Override
		public PaymentMethod choosePaymentMethod() {
		
			Scanner in=new Scanner(System.in);
			PaymentMethod pm=null;
			System.out.println("choose payment method");
			System.out.println("1.upi");
			System.out.println("2.cash");
			int i=in.nextInt();
			switch(i) {
			case 1:System.out.println("using upi");
						pm=new PaymentMethod();
						pm.setPayment("upi");
						break;
			case 2:System.out.println("using cash");
						pm=new PaymentMethod();
						pm.setPayment("cash");
						break;
			default:throw new IncorrectArgumentException("payments method is not valid"); 
			
			}
			
			return pm;
		}

		/*
		 *@param: takes payment method 
		 *@return: boolean
		 */
		
	@Override
	public boolean makePayment(PaymentMethod pm) {
		if(pm==null)
			throw new NullPointerException("payment method should have payment mode");
		boolean flag=false;
		if(pm.getPayment().equals("upi")) {
			System.out.println("payment is done via upi");
			flag=true;
		}
		else if(pm.getPayment().equals("cash")) {
			System.out.println("payment is done via cash");
			flag=true;
		}
		else {
			throw new IncorrectArgumentException("not valid mode");
		}
		
		return flag;
	}

	/*
	 *@param: takes seat 
	 *@return: boolean
	 */
	
	@Override
	public boolean cancelTickets(Seat s) {
		boolean temp=true;
		Collection<Booking>c=store.values();
		for(Booking b:c) {
			if(b.getSeat().getSeatId()==s.getSeatId()) {
				store.remove(b.getBookingId());
				temp=true;
			}
		}
		return temp;
	}
	

	/*
	 *@return set of seats booked
	*/
	
	@Override
	public Set<Booking> allBooking(){
		
		Collection<Booking>c=store.values();
		Set<Booking> s=new HashSet<>(c);
		return s;
	}
}