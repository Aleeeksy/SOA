package zadanie4;

import java.util.HashMap;
import java.util.Map;

public class Koszyk {
	private
		Map<Integer, Integer> koszyk = new HashMap<Integer, Integer>();
	
	public void add(int id) {
		if(koszyk.containsKey(id)) {
			koszyk.put(id, koszyk.get(id) + 1);
		}
		else {
			koszyk.put(id, 1);
		}
	}
	
	public void delete(int id) {
		if(koszyk.containsKey(id)) {
			koszyk.remove(id);
		}
	}
	
	public int numberOfProduct(int id) {
		if(koszyk.containsKey(id)) {
			System.out.println(koszyk.get(id));
			return koszyk.get(id);
		}
		return 0;
	}
	
	public int numberOfAllProducts(){
		int suma = 0;
		for (Map.Entry<Integer, Integer> entry : koszyk.entrySet())
		{
		    suma += entry.getValue();
		}
		return suma;
	}
	
	
}
