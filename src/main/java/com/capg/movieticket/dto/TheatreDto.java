package com.capg.movieticket.dto;

import com.capg.movieticket.entities.Movie;

/*
 * declaring variables
 */
public class TheatreDto {
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private String managerName;
	private String managerContact;
	Movie listOfMovies;
	

/*
 * constuctor
 */
	public TheatreDto(int theatreId, String theatreName, String theatreCity, String managerName, String managerContact,
			Movie listOfMovies) {
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.managerName = managerName;
		this.managerContact = managerContact;
		this.listOfMovies = listOfMovies;
	}

/*
 * getters&setters
 */
	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	public Movie getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(Movie listOfMovies) {
		this.listOfMovies = listOfMovies;
	}


/*
 * displays theatre info
 */
	@Override
	public String toString() {
		String display=theatreId+" "+theatreName+" "+theatreCity+" "+managerName+" "+managerContact+" "+listOfMovies;
	return display;
	
	}

}

