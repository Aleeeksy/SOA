package soa.lab10;

import java.util.ArrayList;
import java.util.List;

import soa.lab10.model.Cat;

public class CatsManager {
	List<Cat> list = new ArrayList<>();
	public CatsManager() {
		list.add(new Cat(1,"pers",10));
		list.add(new Cat(2,"pers",12));
		list.add(new Cat(3,"pers",13));
	}
	
	public List<Cat> getCats(){
		return list;
	}
	
	public void setCats(List<Cat> list) {
		this.list = list;
	}
}
