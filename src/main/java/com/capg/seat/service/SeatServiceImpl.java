package com.capg.movieticket.seat.service;

import java.util.Set;

import com.capg.movieticket.seat.dao.ISeatDao;
import com.capg.movieticket.seat.entities.Seat;
import com.capg.movieticket.seat.util.ValidateClass;

public class SeatServiceImpl implements ISeatService {
	/*
	 *creating object of seat DAO interface
	 */
	private ISeatDao dao;

	/*
	 *initializing object dao 
	 */
	    public SeatServiceImpl(ISeatDao dao) {
	        this.dao = dao;
	    }
	   
	    /*
		 *@param: takes object of seat and validates seat id
		 *@return: seat
		 **/
	@Override
	public Seat bookSeat(Seat s) {
		Seat seat=dao.bookSeat(s);
		ValidateClass.validateId(s.getSeatId());
		return seat;
	}
	/*
	 *@param: takes seat id and cancels the booking for that seat
	 *@return: seat id
	 **/
	@Override
	public Seat cancelSeatBooking(int SeatId) {
		
		return dao.cancelSeatBooking(SeatId);
	}

	/*
	 *@param: takes seat id 
	 *@return: void
	 **/
	@Override
	public void Seat(int SeatId) {
		dao.Seat(SeatId);
		
	}
	
	/*
	 returns set of seats
	 */
	@Override
	public Set<Seat> allSeat(){
		Set<Seat>s=dao.allSeat();
		return s;
	}
	
}