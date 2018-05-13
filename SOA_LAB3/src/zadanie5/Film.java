package zadanie5;

public class Film {
	String tytul;
	String gatunek;
	int rok;
	int dochod;
	public Film(String tytul, String gatunek, int rok, int dochod) {
		super();
		this.tytul = tytul;
		this.gatunek = gatunek;
		this.rok = rok;
		this.dochod = dochod;
	}
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getGatunek() {
		return gatunek;
	}
	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}
	public int getRok() {
		return rok;
	}
	public void setRok(int rok) {
		this.rok = rok;
	}
	public int getDochod() {
		return dochod;
	}
	public void setDochod(int dochod) {
		this.dochod = dochod;
	}
}
