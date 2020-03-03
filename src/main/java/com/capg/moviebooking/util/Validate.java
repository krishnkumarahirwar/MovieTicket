package com.capg.moviebooking.util;

import com.capg.moviebooking.exceptions.IncorrectBookingIdException;

public class Validate {

	public static void validateId(int bookingId) {
		if(Integer.toString(bookingId).length()<6||Integer.toString(bookingId).length()>6)
			throw new IncorrectBookingIdException("bookingid length should be 6");
	}

}
