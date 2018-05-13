package pl.lab5.theatre.ejb;

public interface TheatreBooker {

	public String bookSeat(int seatId) throws SeatBookedException, NotEnoughMoneyException;
}
