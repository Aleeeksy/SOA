package lab4.test;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Szansa {
	public String wyslij() {
		if(Math.random() < 0.3) {
			return "wygrana";
		}
		else {
			return "przegrana";
		}
	}
}
