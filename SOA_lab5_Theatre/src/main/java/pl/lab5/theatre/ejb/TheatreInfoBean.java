package pl.lab5.theatre.ejb;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import pl.lab5.theatre.ejb.*;

@Stateless
@Remote(TheatreInfo.class)
public class TheatreInfoBean implements TheatreInfo {
	
	@EJB TheatreBox box;
	

	public String printSeatList() {
		ArrayList<Seat> seats= box.getSeatList();
		StringBuffer sb = new StringBuffer();
		for (Seat seat: seats) {
			sb.append(seat.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}