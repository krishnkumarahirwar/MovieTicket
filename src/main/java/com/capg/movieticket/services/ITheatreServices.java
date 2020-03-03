package com.capg.movieticket.services;

import java.util.*;

import com.capg.movieticket.entities.Movie;
import com.capg.movieticket.entities.Theatre;

public interface ITheatreServices {

	Theatre addTheatre(Theatre theatre);
	boolean deleteTheatre(int theatreId);
	List<String> searchMovie(Movie movie);
	Set<Theatre> allTheatre();
	
}
