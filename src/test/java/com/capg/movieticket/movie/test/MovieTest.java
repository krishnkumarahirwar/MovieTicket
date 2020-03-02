package com.capg.movieticket.movie.test;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import com.capg.movieticket.movie.entities.Movie;
import com.capg.movieticket.movie.dao.*;
import com.capg.movieticket.movie.entities.*;
import com.capg.movieticket.movie.exceptions.*;
import com.capg.movieticket.movie.services.*;

public class MovieTest {
	private IMovieTicketService service;          
	
	
	@BeforeEach
	public void setup() {
		service = new MovieTicketServiceImpl(new MoviedaoImpl() );        
	}
	
	@AfterEach
	public void clear() {
		
	MoviedaoImpl.store.clear();
	}
	
	
	

/**
* test case 1 for adding movie
*/	
	@Test
	public void testAddMovie_1() {
		Movie movie=new Movie(3001,"ABCD","comedy","Remo",2,"hindi");
		Movie result = service.addMovie(movie);
		Assertions.assertEquals(movie.getMovieid(), result.getMovieid());
		Assertions.assertEquals(movie.getMoviename(), result.getMoviename());
		Assertions.assertEquals(movie.getMoviegenre(),result.getMoviegenre());
		Assertions.assertEquals(movie.getMoviedirector(), result.getMoviedirector());
		Assertions.assertEquals(movie.getMovielength(),result.getMovielength());
		Assertions.assertEquals(movie.getLanguage(),result.getLanguage());
	}
	

/**
* test case 2 for adding movie if movie is null throw exception
*/	
	@Test
	public void testAddMovie_2() {
		Executable executable=()-> service.addMovie(null);
		Assertions.assertThrows(IncorrectArgumentException.class, executable);
	}
	
	
	

/**
* test case 1 for searching movie 
*/
	
	@Test
	public void testsearchMovie_1() {
		Executable executable=()-> service.searchMovie(null);
		Assertions.assertThrows(IncorrectArgumentException.class, executable);
	}
	
	

/**
* test case 2 for searching movie if movie is null throw exception
*/
	@Test
	public void testseachMovie_2() {
		Movie movie=new Movie(3001,"ABCD","comedy","Remo",2,"hindi");
		String moviename=movie.getMoviename();
		Executable executable=()-> service.searchMovie(moviename);
		Assertions.assertThrows(MovieNotFoundException.class, executable);
	}
	

/**
* test case 1 for deleting movie 
*/
	
	@Test
	public void testDeleteMovie_1() {
		Executable executable=()-> service.delete(0);
	Assertions.assertThrows(IncorrectArgumentException.class, executable);
	}
	

/**
* test case 2 for deleting movie 
*/
	
	@Test
	public void testDeleteMovie_2() {
	Movie newmovie=new Movie(3001,"ABCD2","comedy","Remo",2,"hindi");
	Map<Integer,Movie> movielist=MoviedaoImpl.store;
	movielist.put(3001, newmovie);
	int movieid=newmovie.getMovieid();
	service.delete(movieid);
	boolean isEmpty=movielist.isEmpty();
	Assertions.assertEquals(true,isEmpty);
	
	}
	

	
	
	
	
}
