package com.capg.moviebooking;

import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.capg.moviebooking.entities.Booking;
import com.capg.moviebooking.entities.Show;
import com.capg.moviebooking.entities.Ticket;
import com.capg.moviebooking.service.BookingServiceImpl;
import com.capg.movieticket.booking.dao.BookingDaoImpl;
import com.capg.movieticket.booking.dao.PaymentMethod;
import com.capg.moviebooking.entities.Seat;
import com.capg.moviebooking.exceptions.IncorrectArgumentException;

public class BookingServiceImplTest {
	BookingServiceImpl service;
	@BeforeEach
	public void setup() {
		service = new BookingServiceImpl(new BookingDaoImpl());
	}
	
	@AfterEach
	public void clear() {
		BookingDaoImpl.store.clear();
	}
	//test case 1 to add a booking
	@Test
	public void testAddBooking_1() {
		Ticket ticket=new Ticket();
		 Show show=new Show();
		 Seat s1=new Seat(16, 2000);
		Booking b=new Booking(10, 11,12,show, 14,15,ticket,s1);
		Assertions.assertEquals(10,b.getBookingId());
		Assertions.assertEquals(11,b.getMovieId());
		Assertions.assertEquals(12,b.getShowId());
		Assertions.assertEquals(show,b.getShowRef());
		Assertions.assertEquals(14,b.getTransactionId());
		Assertions.assertEquals(15,b.getTotalCost());
		Assertions.assertEquals(ticket,b.getTicket());
		Assertions.assertEquals(s1,b.getSeat());
	}
	//test case 2 to cancel tickets 
	@Test
	public void testCancelTickets_1() {
		Ticket ticket=new Ticket();
		 Show show=new Show();
		 Seat s1=new Seat(16, 2000);
		Booking b=new Booking(10, 11,12,show, 14,15,ticket,s1);
		Map<Integer,Booking> bookingnew=BookingDaoImpl.store;
		bookingnew.put(10,b);
		Seat seat=b.getSeat();
		service.cancelTickets(seat);
		boolean isEmpty=bookingnew.isEmpty();
		Assertions.assertEquals(true, isEmpty);
	}
	//test case 3 to make payment
	@Test
	public void testMakePayment_1() {
		PaymentMethod pm = new PaymentMethod();
		Executable executable=()->service.makePayment(pm);
		Assertions.assertThrows(NullPointerException.class, executable);	
	}
	
	@Test
	public void CancelTicket_1() {
		Booking b=new Booking(123456, 2, 3, null, 4,50, null,null);
	
		Seat seat=b.getSeat();
		service.cancelTickets(seat);
		BookingDaoImpl.store.remove(b.getBookingId());
		Assertions.assertNotNull(b);
		
		
	}
	
	
}

