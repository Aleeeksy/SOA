package zadanie5;

import java.util.ArrayList;
import java.util.List;

public class FilmyController {
	List<Film> filmy = new ArrayList<Film>();
	
	public FilmyController() {
		filmy.add(new Film("Ojciec chrzestny", "dramat", 1972, 120000000));
		filmy.add(new Film("Pluton", "wojenny", 1986, 50000000));
		filmy.add(new Film("Nagi instynkt", "thriller", 1992, 100000000));
	}
	
	public List<Film> getFilmy() {
		return filmy;
	}
}
