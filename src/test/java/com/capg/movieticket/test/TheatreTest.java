package com.capg.movieticket.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.capg.movieticket.dao.*;
import com.capg.movieticket.entities.Movie;
import com.capg.movieticket.entities.Theatre;
import com.capg.movieticket.exception.*;
import com.capg.movieticket.services.*;

public class TheatreTest {
	private ITheatreServices service;
	@BeforeEach
	public void setup() {
		
		service=new TheatreServiceImpl(new TheatreDaoImpl());
		
	}
	@AfterEach
	public void clear() {
		TheatreDaoImpl.store.clear();
	}
	
	
	

	 /*
	  *test case 1 for adding theatre where theatre is not null
	  */
	@Test
	public void testaddtheatre_1() {
		Movie m1 = new Movie(1, "ABCD", "Dance", "remo", 2,"hindi");
		Movie m2 = new Movie(2, "ABCd2", "Dance", "remo", 2,"hindi");
		List<Movie> l1 = new ArrayList<>();
		l1.add(m1);
		l1.add(m2);
		
		Theatre t1 = new Theatre(2001, "sangam", "bhopal", "jaade", "7509717656", l1);
		Theatre result=service.addTheatre(t1);
		Assertions.assertEquals(t1.getTheatreId(), result.getTheatreId());
		Assertions.assertEquals(t1.getTheatreName(),result.getTheatreName());
		Assertions.assertEquals(t1.getTheatreCity(),result.getTheatreCity());
		Assertions.assertEquals(t1.getManagerName(),result.getManagerName());
		Assertions.assertEquals(t1.getManagerContact(),result.getManagerContact());
		Assertions.assertEquals(t1.getListOfMovies(),result.getListOfMovies());
	}
	
	

	 /*
	  *test case 2 for adding theatre where theatre is null
	  */
@Test
public void testaddtheatre_2() {
	Executable executable=()->service.addTheatre(null);
	Assertions.assertThrows(IncorrectArgumentException.class, executable);
}



/*
 *test case 1 for deleting theatre where theatre id is null
 */
@Test
public void testdeletetheatre_1() {
	Executable executable=()->service.deleteTheatre(0);
	Assertions.assertThrows(TheatreIdNotValidException.class, executable);
}



/*
 *test case 2 for deleting theatre where theatre is not null
 */
@Test
public void testdeletetheatre_2() {
	Movie m1 = new Movie(1, "ABCD", "Dance", "remo", 2,"hindi");
	Movie m2 = new Movie(2, "ABC", "Dance", "remo", 2,"hindi");
	List<Movie> l1 = new ArrayList<>();
	l1.add(m1);
	l1.add(m2);
	Theatre theatrenew=new Theatre(2001, "Sangam", "Bhopal"," Anirudh", "9878766543", l1);
	Map<Integer,Theatre> theatrelist=TheatreDaoImpl.store;
	theatrelist.put(2001,theatrenew);
	int theatreteid=theatrenew.getTheatreId();
	service.deleteTheatre(theatreteid);
	boolean isEmpty=theatrelist.isEmpty();
	Assertions.assertEquals(true, isEmpty);
}



/*
 *test case 1 for searching movie where movie is null
 */
@Test
public void testsearchmovie_1() {
	Executable executable=()->service.searchMovie(null);
	Assertions.assertThrows(MovieNotFoundException.class, executable);
}


/*
 *test case 2 for searching movie where movie is not null
 */
@Test
public void testsearchmovie_2() {
	Movie m1 = new Movie(1, "ABCD", "Dance", "remo", 2,"hindi");
	Movie m2 = new Movie(2, "ABC", "Dance", "remo", 2,"hindi");
	List<Movie> l1 = new ArrayList<>();
	Movie m3 = new Movie(4, "kk badhsha", "Dance", "remo", 2,"hindi");
	l1.add(m1);
	l1.add(m2);
	Theatre theatrenew=new Theatre(2001, "Sangam", "Bhopal"," Anirudh", "9878766543", l1);
	//Movie movie=theatrenew.getListOfMovies();
	Map<Integer,Theatre> store = TheatreDaoImpl.store;
	store.put(2001, theatrenew);
	Executable executable=()->service.searchMovie(m3);
	Assertions.assertThrows(MovieNotFoundException.class,executable);
	
}




}
