package com.capg.movieticket.movie.util;

import com.capg.movieticket.movie.exceptions.IncorrectArgumentException;

public class Validation {
	
	
		public static void validateId(int id) {
			String str=Integer.toString(id);
			if(str.length()<4)
				throw new IncorrectArgumentException("Id cannot be less than 1");
			
			else {
				if(str.charAt(0)!='3')
					throw new IncorrectArgumentException("Id should start with 3");
			}
}
	
}

