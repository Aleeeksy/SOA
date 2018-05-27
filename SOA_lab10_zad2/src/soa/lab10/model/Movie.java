package soa.lab10.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
	private int id;
	private String title;
	private String uri;
	
	public Movie(){}
	
	public Movie(int id, String title) {
		super();
		this.id = id;
		this.title = title;
		this.uri = "http://localhost:8080/SOA_lab10_zad2/rest/movies/" + id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
	
}
