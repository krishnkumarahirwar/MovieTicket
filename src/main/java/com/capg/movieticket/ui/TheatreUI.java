package com.capg.movieticket.ui;

import java.util.*;

import com.capg.movieticket.dao.*;
import com.capg.movieticket.entities.Movie;
import com.capg.movieticket.entities.Theatre;
import com.capg.movieticket.services.ITheatreServices;
import com.capg.movieticket.services.TheatreServiceImpl;

public class TheatreUI {
	private ITheatreServices service = new TheatreServiceImpl(new TheatreDaoImpl());

	public static void main(String args[]) {
		TheatreUI theatre = new TheatreUI();
		theatre.runUI();
	}

	public void runUI() {

		Movie m1 = new Movie(1, "lion king", "Dance", "remo", 2,"english");
		Movie m2 = new Movie(2, "kung fu panda", "Dance", "remo", 2,"englis");
		Movie m3 = new Movie(3, "friends", "Dance", "remo", 2,"hindi");
		Movie m4 = new Movie(4, "rango", "Dance", "remo", 2,"english");

		List<Movie> l1 = new ArrayList<>();
		l1.add(m1);
		l1.add(m2);
		l1.add(m3);
		l1.add(m4);
		List<Movie> l2 = new ArrayList<>();
		l2.add(m1);
		l2.add(m2);
		l2.add(m3);
		List<Movie> l3 = new ArrayList<>();
		l3.add(m1);
		l3.add(m2);
		l3.add(m4);

		Theatre t1 = new Theatre(2001, "sangam", "bhopal", "jaade", "7509717656", l1);
		Theatre t2 = new Theatre(2012, "bharat", "bhopal", "krishna", "7509717656", l2);
		Theatre t3 = new Theatre(2023, "elite", "bhopal", "yasir", "7509717656", l3);
		service.addTheatre(t1);
		service.addTheatre(t2);
		//service.deleteTheatre(201);
		System.out.println("M :"+service.searchMovie(m1));

		Set<Theatre> theatre = service.allTheatre();
		print(theatre);

	}

	void print(Theatre theatre) {

		System.out.println(theatre.getTheatreId() + " " + theatre.getManagerName() + " " + theatre.getTheatreCity()
				+ " " + theatre.getTheatreName() + " " + theatre.getManagerContact());
		List<Movie> t = theatre.getListOfMovies();
		for (Movie m : t) {
			System.out.println(m.getMoviename());
		}
	}

	void print(Collection<Theatre> theatre) {
		for (Theatre t : theatre)
			print(t);
	}

}
