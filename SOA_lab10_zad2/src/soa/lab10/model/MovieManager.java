package soa.lab10.model;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	List<Movie> list = new ArrayList<>();
	public MovieManager() {
		list.add(new Movie(1,"Skazani na Shawshank"));
		list.add(new Movie(2,"Scott Pilgrim vs. the World"));
		list.add(new Movie(3,"Deadpool 2"));
	}
	
	public List<Movie> getMovies(){
		return list;
	}
	
	public void setMovies(List<Movie> list) {
		this.list = list;
	}
}
