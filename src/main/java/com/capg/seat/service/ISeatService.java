package com.capg.movieticket.seat.service;
import java.util.Set;

import com.capg.movieticket.seat.entities.Seat;

public interface ISeatService {
	
	Seat bookSeat(Seat s);
	
	Seat cancelSeatBooking(int SeatId);
	void Seat(int SeatId);
	Set<Seat> allSeat();
	public enum blockSeat{
		
		SEAT_AVAILABLE,
		SEAT_NOTAVAILABLE;
	}

}
