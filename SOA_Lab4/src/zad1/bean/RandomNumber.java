package zad1.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RandomNumber {
	static int random = (int)(Math.random()* 5 + 1);

	public static int getRandom() {
		return random;
	}

}
