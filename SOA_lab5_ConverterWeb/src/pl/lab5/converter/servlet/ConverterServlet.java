package pl.lab5.converter.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.lab5.converter.Converter;

/**
 * Servlet implementation class ConverterServlet
 */
@WebServlet("/ConverterServlet")
public class ConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @EJB
    private Converter converter;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double temperatureAfterConversion;
		double temperatureBeforeConversion = Double.valueOf(request.getParameter("temperature"));
		String symbol;
		String symbol2;
		if(request.getParameter("conversion").equals("Cel2Fahr")) {
			temperatureAfterConversion = converter.Cels2Fahr(temperatureBeforeConversion);
			symbol = "C";
			symbol2 = "F";
		} else {
			temperatureAfterConversion = converter.Fahr2Cels(temperatureBeforeConversion);
			symbol = "F";
			symbol2 = "C";
		}

		response.getWriter().println("<br/><br/><br/> <h3> " + request.getParameter("temperature") + " " + symbol + " = " + temperatureAfterConversion + symbol2+"</h3>");
		request.getRequestDispatcher("./index.html").include(request, response);
	}
}
