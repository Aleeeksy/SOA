package pl.lab5.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.lab5.exam.beans.Exam;
import pl.lab5.exam.scheduler.ExamScheduler;


public class ExecuteEjbServlet extends HttpServlet {
	
	@EJB
	private ExamScheduler examScheduler;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = "/index.jsp";
		List<Exam> exams = examScheduler.getExams();
		request.setAttribute("exams", exams);
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}
}
