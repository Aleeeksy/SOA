package pl.agh.soa.webservice;

import java.text.ParseException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface DaysToHolidays {
	
	@WebMethod
	public String oneDayMore() throws ParseException;
	
}	
