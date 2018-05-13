package zadanie5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FilmyServlet
 */
@WebServlet("/filmy")
public class FilmyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FilmyController filmy = new FilmyController();
		request.setAttribute("filmy", filmy.getFilmy());
		RequestDispatcher view = request.getRequestDispatcher("lab3_5.jsp");
		view.forward(request, response);
	}


}
