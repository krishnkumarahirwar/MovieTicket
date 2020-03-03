package com.capg.movieticket.booking.dao;

public class PaymentMethod {

	/*
	 *declaring variable payment
	 */
	
	private String payment;
	
	/*
	 *default constructor
	 */
	public PaymentMethod() {
		}

	
	/*
	 * constructor
	 */
	public PaymentMethod(String payment) {
		
		this.payment=payment;
	}
	/*
	 * getters and setters
	 */
	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	
	/*
	 *overriding equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentMethod other = (PaymentMethod) obj;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		return true;
	}
	

	
}
