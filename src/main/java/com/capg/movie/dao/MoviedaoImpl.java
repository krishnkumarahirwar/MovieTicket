package com.capg.movieticket.movie.dao;

import java.util.*;
import java.util.stream.Collectors;

import com.capg.movieticket.movie.entities.Movie;
import com.capg.movieticket.movie.exceptions.IncorrectArgumentException;
import com.capg.movieticket.movie.exceptions.MovieNotFoundException;
import com.capg.movieticket.movie.services.IMovieTicketService;

public class MoviedaoImpl implements IMovieTicketDao {

	public static Map<Integer, Movie> store = new HashMap<>();         
	
	
	
/**
 * @param:takes the object of movie(reference) and checks if null throws exception else add the movie
 * @return: void
 */
	
	@Override
	public void addMovie(Movie movie) {
		if (movie == null) {
			throw new IncorrectArgumentException("Movie should not be null");                                              
	}
		store.put(movie.getMovieid(), movie);
	}
	
	
	
/**
 * @param:takes the name of movie and checks if null throws exception else search the movie if exists
 *  * @return: movie
 */	
	@Override
	public Movie searchMovie(String movieName) {
		if(movieName==null) {
			throw new IncorrectArgumentException("Movie name should not be null");
		}
		List<Movie> movies = store.values().stream().filter(movie -> movie.getMoviename().equals(movieName))                    
				.collect(Collectors.toList());
		if (movies.isEmpty()) {
			throw new MovieNotFoundException("Movie not found");
		}
		Movie movie = movies.get(0);
		return movie;

	}
	
	
/**
 * @param:takes id of movie and deletes movie if it exists and throws exception if movie doesnt exist
 *  * @return: void
 */	

	@Override
	public void delete(int movieid) {
		Set<Integer> s = store.keySet();
		for (Integer i : s) {
			if (movieid == i) {
				Movie movie = store.remove(movieid);                                                                         
				break;
			} else
				throw new MovieNotFoundException("movie does not exist");
		}

	}

	
	
	
	
/**
 * @param:null
 *  * @return:set of movie
 */	
	
	@Override
	public Set<Movie> allMovies() {
		Collection<Movie> movies = store.values();
		Set<Movie> movielist = new HashSet<>(movies);
		return movielist;
	}

}
