package com.capg.movieticket.dao;

import java.util.*;

import com.capg.movieticket.entities.Movie;
import com.capg.movieticket.entities.Theatre;
import com.capg.movieticket.exception.IncorrectArgumentException;
import com.capg.movieticket.exception.MovieNotFoundException;
import com.capg.movieticket.exception.TheatreAlreadyExistException;
import com.capg.movieticket.exception.TheatreIdNotValidException;


public class TheatreDaoImpl implements ITheatreDao {
	 public static Map<Integer, Theatre> store = new HashMap<>();
	 
	 
	 
	 /*
	  * @param:takes theatre as input and if null throws exception else add theatre
	  * @return:theatre
	  */
	@Override
	public Theatre addTheatre(Theatre theatre) {
		if(theatre==null) {
			throw new NullPointerException("theatre should have argument");
		}
		store.put(theatre.getTheatreId(), theatre);
		return theatre;
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
		
		boolean flag=false;
		Set<Integer> s=store.keySet();
		for(Integer i:s) {
			if(i==theatreId) {
				store.remove(i);
				flag=true;
				break;
			}
		}
		
		return flag;
	}

	
	
	 /*
	  * @param:takes movie as input and search for the particular movie in theatre throws exception if movie not found
	  * @return:theatre name
	  */
	@Override
	public List<String> searchMovie(Movie movie) {
		boolean flag =false;
		List<String> TName=new ArrayList<String>();
		Collection<Theatre> theatre=store.values();
		for(Theatre t:theatre) {
		if(t.getListOfMovies().contains(movie)){
			TName.add(t.getTheatreName());
			flag=true;
		}}
			if(flag==false) 
				throw new MovieNotFoundException("movie does not exist");
		
		
		
		return TName;
	}

	
	
	 /*
	  *returns list of theatre
	  */
	@Override
	public Set<Theatre> allTheatre() {
		Collection<Theatre> theatre=store.values();
		Set<Theatre> theatreList=new HashSet<>(theatre);
		return theatreList;
	}

	

}
