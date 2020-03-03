package com.capg.movieticket.entities;

import java.util.List;



/*
 * declaring variables
 */
public class Theatre {
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private String managerName;
	private String managerContact;
	List<Movie> listOfMovies;
	
	

/*
 * constuctor
 */
	public Theatre(int theatreId, String theatreName, String theatreCity, String managerName, String managerContact,
			List<Movie> listOfMovies) {
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

	public List<Movie> getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(List<Movie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}

	

/*
 * hashcode
 */
	@Override
	public int hashCode() {
		return theatreId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theatre other = (Theatre) obj;
		if (listOfMovies == null) {
			if (other.listOfMovies != null)
				return false;
		} else if (!listOfMovies.equals(other.listOfMovies))
			return false;
		if (managerContact == null) {
			if (other.managerContact != null)
				return false;
		} else if (!managerContact.equals(other.managerContact))
			return false;
		if (managerName == null) {
			if (other.managerName != null)
				return false;
		} else if (!managerName.equals(other.managerName))
			return false;
		if (theatreCity == null) {
			if (other.theatreCity != null)
				return false;
		} else if (!theatreCity.equals(other.theatreCity))
			return false;
		if (theatreId != other.theatreId)
			return false;
		if (theatreName == null) {
			if (other.theatreName != null)
				return false;
		} else if (!theatreName.equals(other.theatreName))
			return false;
		return true;
	}

	
	

}
