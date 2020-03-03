package com.capg.movieticket.dao;

import java.util.*;

import com.capg.movieticket.entities.Movie;
import com.capg.movieticket.entities.Theatre;

public interface ITheatreDao {
	Theatre addTheatre(Theatre theatre);
	boolean deleteTheatre(int theatreId);
	List<String> searchMovie(Movie movie);
	Set<Theatre> allTheatre();
	
	
}
