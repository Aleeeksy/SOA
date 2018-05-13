package pl.lab5.theatre.ejb;



import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateful;

import org.apache.log4j.Logger;

import pl.lab5.theatre.ejb.*;





@Stateful
@Remote(TheatreBooker.class)
public class TheatreBookerBean implements TheatreBooker {
	private static final Logger logger = Logger.getLogger(TheatreBookerBean.class);
	int money;
	@EJB TheatreBox theatreBox;
	
	@PostConstruct
	public void createCustomer() {
		this.money=100;
	}

	public String bookSeat(int seatId) throws SeatBookedException, NotEnoughMoneyException {
		Seat seat = theatreBox.getSeatList().get(seatId);
		// Logika biznesowa.
		if (seat.isBooked()) {
			throw new SeatBookedException("To miejsce jest ju¿ zarezerwowane!");
		}
		if (seat.getPrice() > money) {
			throw new NotEnoughMoneyException("Nie masz wystarczaj¹cych œrodków,aby kupiæ ten bilet!");
		}
		theatreBox.buyTicket(seatId);
		money = money -seat.getPrice();
		logger.info("Rezerwacja przyjêta.");
		return "Rezerwacja przyjêta.";
	}
}