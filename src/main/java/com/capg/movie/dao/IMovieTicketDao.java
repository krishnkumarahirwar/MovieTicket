package com.capg.movieticket.movie.dao;

import java.util.Set;

import com.capg.movieticket.movie.dto.MovieDto;
import com.capg.movieticket.movie.entities.Movie;

public interface IMovieTicketDao {
	
	void addMovie(Movie movie);
	                                                             //CREATING METHODS
	Movie searchMovie(String movieName);
	
	void delete(int movieid);
	
	Set<Movie> allMovies();

	

	
	 

}
