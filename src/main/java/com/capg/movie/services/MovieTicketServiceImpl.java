package com.capg.movieticket.movie.services;
import com.capg.movieticket.movie.util.*;
import java.util.Set;

import com.capg.movieticket.movie.dao.IMovieTicketDao;
import com.capg.movieticket.movie.entities.Movie;
import com.capg.movieticket.movie.exceptions.IncorrectArgumentException;

public class MovieTicketServiceImpl implements IMovieTicketService {
	

/**
* creating object of dao interface
*/	
	private IMovieTicketDao dao;
	

/**
* initializing object dao
*/	
	public MovieTicketServiceImpl(IMovieTicketDao dao) {
		this.dao = dao;
	}

	
	
	
/**
 * @param:takes the object of movie(reference) and add the movie,also performs validation on id
 * @return: void
 */

	@Override
	public Movie addMovie(Movie movie) {
		
		dao.addMovie(movie);
		Validation.validateId(movie.getMovieid());
		return movie;
	}
	
	

/**
 * @param:takes the name of movie and  search the movie 
 *  * @return: movie
 */	

	@Override
	public Movie searchMovie(String movieName) {
		Movie movie = dao.searchMovie(movieName);
		return movie;
	}

	

/**
 * @param:takes id of movie and deletes movie also throws exception if id is null
 *  * @return: void
 */	
	@Override
	public void delete(int movieid) {
		if(movieid==0)
			throw new IncorrectArgumentException("Movie id cannot be 0(ZERO)");

		dao.delete(movieid);
	}

	
	

/**
 * @param:null
 *  * @return:set of movie
 */	
	@Override
	public Set<Movie> allMovies() {

		Set<Movie> movies = dao.allMovies();

		return movies;
	}

}
