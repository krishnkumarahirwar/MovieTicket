package com.capg.movieticket.movie.services;
import com.capg.movieticket.movie.dao.*;
import com.capg.movieticket.movie.dto.*;
import com.capg.movieticket.movie.entities.*;
import com.capg.movieticket.movie.services.*;

import java.util.Set;


public interface IMovieTicketService {

	Movie addMovie(Movie movie);
	
	void delete(int movieid);
	
	Movie searchMovie(String movieName);
	
	Set<Movie> allMovies();
	
	

	
}
