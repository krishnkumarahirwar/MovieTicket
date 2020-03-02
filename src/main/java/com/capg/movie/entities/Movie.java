package com.capg.movieticket.movie.entities;




/**
* declaring variables
*/	
public class Movie {
private int movieid;
private String moviename;
private String moviegenre;
private String moviedirector;
private int movielength;
private String language;



/**
* Constructor
*/	
public Movie(int movieid, String moviename, String moviegenre, String moviedirector, int movielength,String language) {
	super();
	this.movieid = movieid;
	this.moviename = moviename;
	this.moviegenre = moviegenre;
	this.moviedirector = moviedirector;
	this.movielength = movielength;
	this.language=language;
}


/**
* getters&setters
*/	
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
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


/**
* hashcode
*/	
@Override
public int hashCode() {
    return movieid;
}





}
