package pl.lab5.library.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.lab5.library.bean.Library;
import pl.lab5.library.model.Book;

/**
 * Servlet implementation class LibraryServlet
 */
@ManagedBean
@RequestScoped
@Named("librarycontroller")
public class LibraryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @EJB
    Library library;
    List<Book> books;
    
    public List<Book> getBooks() {
    	List<Book> booksList = library.getBooks();
    	return booksList;
    }
	
	 public void reserveBook(int id) {
		 library.book(id);
	 }


	    public void rentBook(int id) {
	        library.borrow(id);
	    }

	    public void returning(int id) {
	        library.getBack(id);
	}

}
