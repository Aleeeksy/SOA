

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChceckServlet
 */
@WebServlet("/check")
public class ChceckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			out.println("<html lang=\"en\">" + "<head><title>Servlet Hello</title></head>"
					+ "<form method=\"get\">"
	                + "<input title=\"My name is: \"type=\"text\" "
	                + "name=\"username\" size=\"25\">"
	                + "<input title=\"My age is: \"type=\"text\" "
	                + "name=\"age\" size=\"25\">"
	                + "<p></p>"
	                + "<input type=\"submit\" value=\"Submit\">"
	                + "<input type=\"reset\" value=\"Reset\">"
	                + "</form>");
			
			String username = request.getParameter("username");
			int age = Integer.parseInt(request.getParameter("age"));
			
			if(username != null && username.length() > 0) {
				if(age >= 18 && username.endsWith("a")) {
					out.println("<h2>Tak</h2>");
				}
				else {
					out.println("<h2>Nie</h2>");
				}
			}
			out.print("</body></html>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
