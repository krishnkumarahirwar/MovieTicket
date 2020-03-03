package com.capg.movieticket.services;

import java.util.*;

import com.capg.movieticket.dao.ITheatreDao;
import com.capg.movieticket.entities.Movie;
import com.capg.movieticket.entities.Theatre;
import com.capg.movieticket.exception.IncorrectArgumentException;
import com.capg.movieticket.exception.TheatreIdNotValidException;
import com.capg.movieticket.util.ValidatedMethods;
public class TheatreServiceImpl implements ITheatreServices{

/*
 * creating object of theatre DAO
 */
	private ITheatreDao dao;
	

/*
 * initializing object dao
 */
	public TheatreServiceImpl(ITheatreDao dao) {
		this.dao=dao;
	}
	
	
	
	 /*
	  * @param:takes theatre as input and if null throws exception else add theatre also validates the theatre id and manager contact number
	  * @return:theatre
	  */
	@Override
	public Theatre addTheatre(Theatre theatre) {
		if(theatre== null) {
			throw new IncorrectArgumentException("Theatre is Null");
		}
			ValidatedMethods.validateTheatreID(theatre.getTheatreId());
			ValidatedMethods.validateManagerNumber(theatre.getManagerContact());
			return dao.addTheatre(theatre);
	}

	 /*
	  * @param:takes theatre id as input and if 0 throws exception else deletes the theatre for the same id
	  * @return:boolean
	  */
	@Override
	public boolean deleteTheatre(int theatreId) {
		if(theatreId==0) {
			throw new TheatreIdNotValidException("theatre id should not be zero");
		}
		boolean flag=dao.deleteTheatre(theatreId);
		return flag;
	}

	

	 /*
	  * @param:takes movie as input and search for the particular movie in theatre 
	  * @return:string
	  */
	@Override
	public List<String> searchMovie(Movie movie) {
		List<String> str=dao.searchMovie(movie);
		return str;
	}

	

	 /*
	  *returns list of theatre
	  */
	@Override
	public Set<Theatre> allTheatre() {
		Set<Theatre> s=dao.allTheatre();
		return s;
	}

}
