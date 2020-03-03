package com.capg.movieSeat;


import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.capg.movieticket.seat.dao.SeatDaoImpl;
import com.capg.movieticket.seat.entities.Seat;
import com.capg.movieticket.seat.exceptions.*;
import com.capg.movieticket.seat.service.SeatServiceImpl;


public class SeatServiceImplTest {
	SeatServiceImpl service;

	@BeforeEach
	public void setup() {
		service = new SeatServiceImpl(new SeatDaoImpl());
	}
	
	@AfterEach
	public void clear() {
		SeatDaoImpl.store.clear();
	}
	//Test case 1 for booking a seat
	@Test
	public void testBookSeat_1() {
		Seat s=new Seat(1111101,2000);
		Seat result=service.bookSeat(s);
		
		Assertions.assertEquals(1111101,result.getSeatId());
		Assertions.assertEquals(2000,result.getSeatPrice());
	}
	//Test case 2 to cancel a seat booking
	@Test
	public void testCancelSeatBooking_1() {
		Executable executable=()->service.cancelSeatBooking(1111101);
		Assertions.assertThrows(IncorrectArgumentException.class, executable);
	}
	//Test case 3 to cancel seat booking
	@Test
	public void testCancelSeatBooking_2() {
		Seat s=new Seat(1111101,2000);
		Map<Integer,Seat> seatnew=SeatDaoImpl.store;
		seatnew.put(1111101,s);
		int seatid=s.getSeatId();
		service.cancelSeatBooking(seatid);
		boolean isEmpty=seatnew.isEmpty();
		Assertions.assertEquals(true, isEmpty);
	}
}
