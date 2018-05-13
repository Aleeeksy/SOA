package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Piwo;

public class EkspertPiwny {
	private
		List<Piwo> lista = new ArrayList<Piwo>();

	public EkspertPiwny() {
		super();
		lista.add(new Piwo("jasne", "¯ywiec"));
		lista.add(new Piwo("ciemne", "Ksi¹¿êce"));
	}

	public List<String> getMarki(String typ) {
		List<String> listaMarek = new ArrayList<String>();
		for(Piwo x: lista.stream().filter(a -> a.getTyp().equals(typ)).collect(Collectors.toList())) {
			listaMarek.add(x.getMarka());
		}
		return listaMarek;
	}


	
}
