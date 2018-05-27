package pl.agh.soa.webservice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "pl.agh.soa.webservice.DaysToHolidays")
public class DaysToHolidaysImpl implements DaysToHolidays {
	
	@WebMethod
	public String oneDayMore() throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

		Date dateFrom = new Date();
		String startDate = "01 07 2018";

		Date dateTo = dateFormat.parse(startDate);
		long difference = dateTo.getTime() - dateFrom.getTime();
		int daysBetween = (int) (difference / (1000 * 60 * 60 * 24));

		String statement = "It's only " + daysBetween + " days to HOLIDAYS!";
		System.out.println(statement);
		return statement;

	}
}
