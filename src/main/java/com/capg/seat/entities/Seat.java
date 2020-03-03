package com.capg.movieticket.seat.entities;

public class Seat {
	
	/*
	 * declaring variables
	 */
	private int seatId;
	private double seatPrice;
	
	
	/*
	 * constructor
	 */
	public Seat(int seatId, double seatPrice) {
		this.seatId=seatId;
		this.seatPrice=seatPrice;
	}
	
	/*
	 * getters&setters
	 */
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	/*
	 * enum
	 */
	public enum seatStatus{
		SEAT_AVAILABLE,
		SEAT_NOTAVAILABLE;
	}
	
	/*
	 * hashcode
	 */
	@Override
	public int hashCode() {
		return seatId;
	}
	
	/*
	 * overriding equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		if (seatId != other.seatId)
			return false;
		if (Double.doubleToLongBits(seatPrice) != Double.doubleToLongBits(other.seatPrice))
			return false;
		return true;
	}
}