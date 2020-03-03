package com.capg.movieticket.util;

import com.capg.movieticket.exception.IncorrectArgumentException;
import com.capg.movieticket.exception.TheatreIdNotValidException;

public class ValidatedMethods {
	
	public static void validateTheatreID(int theatreId) {
		String str=Integer.toString(theatreId);
		if(str.length()<4)
			throw new TheatreIdNotValidException("Theatre id length should be greater than 3");
		else {
			if(str.charAt(0)=='2');
			else
				throw new TheatreIdNotValidException("first character should be 2");
				
				
		}
			
	}
	public static void validateManagerNumber(String str) {
		if(str.length()<10 || str.length()>10) {
			throw new IncorrectArgumentException("mobile no.should be equal to 10");
		}
	}

}
