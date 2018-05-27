package pl.agh.soa.webservice.main;

import pl.agh.soa.webservice.DaysToHolidaysImplService;
import pl.agh.soa.webservice.ParseException_Exception;
import pl.agh.soa.webservice.DaysToHolidays;
public class DaysToHolidaysClient {

	public static void main(String[] args) throws ParseException_Exception {
		DaysToHolidaysImplService daysToHolidaysService = new DaysToHolidaysImplService();
		DaysToHolidays daysToHolidays = daysToHolidaysService.getDaysToHolidaysImplPort();
		System.out.println(daysToHolidays.oneDayMore());
		
	}

}
