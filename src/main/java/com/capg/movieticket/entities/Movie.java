package com.capg.movieticket.entities;

import java.util.ArrayList;
import java.util.List;

public class Movie {
private int movieid;
private String moviename;
private String moviegenre;
private String moviedirector;
private int movielength;
public String language;




public Movie(String moviename) {
	super();
	this.moviename = moviename;
}
public Movie(int movieid, String moviename, String moviegenre, String moviedirector, int movielength,String language) {
	super();
	this.movieid = movieid;
	this.moviename = moviename;
	this.moviegenre = moviegenre;
	this.moviedirector = moviedirector;
	this.movielength = movielength;
	this.language=language;
}
public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public String getMoviegenre() {
	return moviegenre;
}
public void setMoviegenre(String moviegenre) {
	this.moviegenre = moviegenre;
}
public String getMoviedirector() {
	return moviedirector;
}
public void setMoviedirector(String moviedirector) {
	this.moviedirector = moviedirector;
}
public int getMovielength() {
	return movielength;
}
public void setMovielength(int movielength) {
	this.movielength = movielength;
}

public List<String> listOfMovie(List<Theatre> l){
	
	
	return null;
	
	
}

@Override
public int hashCode() {
    return movieid;
}


public boolean euqals(Object obj) {
	if(obj==this) 
		return true;
	if(obj==null)
      return false;
	if(getClass()!=obj.getClass())
		return false;
	
	Movie movie=(Movie) obj;
	if(moviename==null) {
		if(movie.moviename!=null)
			return false;
	}
	else if(moviename.equals(movie.moviename))
	return false;

	
		if(movieid!=movie.movieid)
	return false;
		
		
		if(moviegenre==null) {
			if(movie.moviegenre!=null)
				return false;
		}
		else if(moviegenre.equals(movie.moviegenre))
		return false;
		
		
		if(moviedirector==null) {
			if(movie.moviedirector!=null)
				return false;
		}
		else if(moviedirector.equals(movie.moviedirector))
		return false;
		

		if(movielength!=movie.movielength)
	return false;
	

	return true;	
	
	
}




}

