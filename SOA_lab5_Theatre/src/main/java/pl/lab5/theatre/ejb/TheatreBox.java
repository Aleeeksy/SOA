package pl.lab5.theatre.ejb;

import java.util.ArrayList;


import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;

import javax.ejb.Lock;
import javax.ejb.LockType;

import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.apache.log4j.Logger;

import pl.lab5.theatre.ejb.*;

@Singleton
@Startup
public class TheatreBox {
	private ArrayList<Seat> seatList;
	private static final Logger logger = Logger.getLogger(TheatreBox.class);
	private static final LockType READ = null;
	private static final LockType WRITE = null;
	
	@PostConstruct
	public void setupTheatre(){
		seatList = new ArrayList<Seat>();
		int id = 0;
		for (int i=0;i<5;i++) {
			Seat seat = new Seat(++id, "Parter", 40);
			seatList.add(seat);
		}
	
		for (int i=0;i<5;i++) {
			Seat seat = new Seat(++id, "Balkon I", 20);
			seatList.add(seat);
		}
		for (int i=0;i<5;i++) {
			Seat seat = new Seat(++id, "Balkon II", 10);
			seatList.add(seat);
		}
			logger.info("Utworzono listê miejsc.");
	}
	
	@Lock(LockType.READ)
		public ArrayList<Seat> getSeatList() {
		return seatList;
	}
	
	@Lock(LockType.READ)
	public int getSeatPrice(int id) {
		return getSeatList().get(id).getPrice();
	}
	
	@Lock(LockType.WRITE)
	public void buyTicket(int seatId ) {
		Seat seat = getSeatList().get(seatId);
		seat.setBooked(true);
	}
}