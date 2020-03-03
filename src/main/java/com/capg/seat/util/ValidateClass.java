package com.capg.movieticket.seat.util;

import com.capg.movieticket.seat.exceptions.IncorrectSeatIdException;

public class ValidateClass {

	public static void validateId(int seatId) {
		if(Integer.toString(seatId).length()<6)
			throw new IncorrectSeatIdException("seatid length should not be less than 6 ");
	}
	}
