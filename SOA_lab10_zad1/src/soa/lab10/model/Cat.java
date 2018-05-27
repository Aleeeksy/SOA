package soa.lab10.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cat {
	private int id;
	private String race;
	private int age;
	
	public Cat(int id,String race, int age) {
		super();
		this.id = id;
		this.race = race;
		this.age = age;
	}
	
	public Cat() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", race=" + race + ", age=" + age + "]";
	}
	
}
