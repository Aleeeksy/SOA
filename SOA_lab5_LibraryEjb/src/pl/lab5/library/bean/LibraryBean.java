package pl.lab5.library.bean;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pl.lab5.library.model.Book;
import pl.lab5.library.model.Books;

@Stateless
public class LibraryBean implements Library {
	
	private List<Book> books = new LinkedList<Book>();
	
	public LibraryBean() throws JAXBException {
    	JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
         
        //We had written this file in marshalling example
        Books list = (Books) jaxbUnmarshaller.unmarshal( new File("C:\\Users\\Aleks\\workspacejee\\SOA_lab5_LibraryEjb\\xml\\books.xml") );
        books = list.getBooks();
	}
	
	public boolean borrow(int id) {
		for(Book book: books) {
			if(book.getId() == id && book.isRented() == false) {
				book.setRented(true);
				return true;
			}
		}
		return false;
	}
    public boolean book(int id) {
    	for(Book book: books) {
			if(book.getId() == id && book.isReserved() == false) {
				book.setReserved(true);
				return true;
			}
		}
		return false;
    }
    public boolean getBack(int id) {
    	for(Book book: books) {
			if(book.getId() == id && book.isRented()) {
				book.setRented(false);
				return true;
			}
		}
		return false;
    }
	
    public List<Book> getBooks(){
    	return books;
    }
}
