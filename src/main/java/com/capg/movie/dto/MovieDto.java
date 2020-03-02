package com.capg.movieticket.movie.dto;

public class MovieDto {
public MovieDto() {
	
}



/**
* declaring variables
*/	
private int movieid;
private String moviename;
private String moviegenre;
private String moviedirector;
private int movielength;
public String language="Hindi";


/**
* Constructor
*/	

public MovieDto(int movieid, String moviename, String moviegenre, String moviedirector, int movielength) {
	super();
	this.movieid = movieid;
	this.moviename = moviename;
	this.moviegenre = moviegenre;
	this.moviedirector = moviedirector;
	this.movielength = movielength;
}




/**
* getters&setters
*/	
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
* returns string
*/	
@Override
public String toString() {
    String display=movieid+" "+moviename+" "+moviegenre+" "+language+" "+moviedirector+" "+movielength ;
    return display;
}
}
