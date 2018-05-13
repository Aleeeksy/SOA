package pl.agh.test.client;

import java.util.Hashtable;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



import pl.lab5.theatre.ejb.NotEnoughMoneyException;
import pl.lab5.theatre.ejb.SeatBookedException;
import pl.lab5.theatre.ejb.TheatreBooker;
import pl.lab5.theatre.ejb.TheatreInfo;


public class RemoteEJBClient {
	private final static java.util.logging.Logger logger = Logger.getLogger(RemoteEJBClient.class .getName());
	private final static Hashtable jndiProperties = new Hashtable();
	public static void main(String[] args) throws Exception {
	testRemoteEJB();
	}
	private static void testRemoteEJB() throws NamingException {
		jndiProperties.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
		final TheatreInfo info = lookupTheatreInfoEJB(); 
		final TheatreBooker book = lookupTheatreBookerEJB(); 
		String command = "";
		/* Kod metody zosta³ pominiêty. Wyœwietla informacjê powitaln¹. */
		dumpWelcomeMessage();
		while (true) {
			command = IOUtils.readLine("> "); 
			if (command.equals("book")) { 
				int seatId = 0;
				try {
					seatId = IOUtils.readInt("Wpisz id miejsca");
				} catch (NumberFormatException e1) {
					logger.info("Niew³aœciwy format!");
					continue;
				}
			
				try {
					String retVal = book.bookSeat(seatId-1);
				}
				catch (SeatBookedException e) {
					logger.info(e.getMessage());
					continue;
				}
		
				catch (NotEnoughMoneyException e) {
					logger.info(e.getMessage());
					continue;
				}
			}
			else if (command.equals("lista")) { 
				logger.info(info.printSeatList().toString());
				continue;
			}
			else if (command.equals("koniec")) { 
				logger.info("¯egnam");
				break;
			}
			else {
				logger.info("Nieznane polecenie"+command);
			}
		}
	}
	
	private static void dumpWelcomeMessage() {
		// TODO Auto-generated method stub
		
	}
	private static TheatreInfo lookupTheatreInfoEJB() throws NamingException {
		final Context context = new InitialContext(jndiProperties);
		return (TheatreInfo) context.lookup("ejb:/ticket-agencyejb/TheatreInfoBean!com.test.ejb.TheatreInfo");
	}
	
	private static TheatreBooker lookupTheatreBookerEJB() throws NamingException {
		final Context context = new InitialContext(jndiProperties);
		return (TheatreBooker) context.lookup("ejb:/ticket-agencyejb/TheatreBookerBean!com.test.ejb.TheatreBooker?stateful");
	}
}