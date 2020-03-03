
package com.capg.movieticket.seat.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.capg.movieticket.seat.entities.Seat;
import com.capg.movieticket.seat.exceptions.*;


public class SeatDaoImpl implements ISeatDao {
	public static Map<Integer, Seat> store = new HashMap<>();
	/*
	 *@param: takes object of seat
	 *@return: seat
	 **/
	@Override
	public Seat bookSeat(Seat s) {
		store.put(s.getSeatId(),s);
		
		return s;
	}
	/*
	 *@param: takes seat id and throws exception if id is 0
	 *@return: null
	 **/
	@Override
	public Seat cancelSeatBooking(int SeatId) {
		boolean flag=false;
		if(SeatId==0)
			throw new IncorrectSeatIdException("Seat id should not be 0");
		Set<Integer> s=store.keySet();
		for(Integer seat:s) {
			if(seat==SeatId) {
				store.remove(SeatId);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			throw new IncorrectArgumentException("Seat is not booked");
		}
		return null ;

		}
	
	/*
	 *@param: takes seat id checks whether seat is available or not
	 *@return: enum
	 **/
	public void Seat(int SeatId) {
		
		if(store.containsKey(SeatId)) {
			
			blockSeat bs1 = blockSeat.SEAT_NOTAVAILABLE;
			System.out.println(bs1);
		}
		else {
			blockSeat bs2 = blockSeat.SEAT_AVAILABLE;
			System.out.println(bs2);
		}
	}
	
	/*
	  *returns set of seats
	 */
	public Set<Seat> allSeat(){
		Collection<Seat>s=store.values();
		Set<Seat> seat=new HashSet<>(s);
		return seat;
		
	}
}