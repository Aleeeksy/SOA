package pl.lab5.library.bean;

import java.util.ArrayList;
import java.util.List;

import pl.lab5.library.model.Book;

public interface Library {
	public boolean borrow(int id);
    public boolean book(int id);
    public boolean getBack(int id);
    public List<Book> getBooks();
}
