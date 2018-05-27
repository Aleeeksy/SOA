package pl.agh.soa.webservice;

import javax.xml.ws.Endpoint;

public class DaysToHolidaysPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/days/ToHolidays", new DaysToHolidaysImpl());
	}
}
