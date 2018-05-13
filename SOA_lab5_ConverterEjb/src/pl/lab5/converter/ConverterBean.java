package pl.lab5.converter;

import javax.ejb.Stateless;

@Stateless
public class ConverterBean implements Converter {

	public double Fahr2Cels(double temperature) {
		return (temperature - 32) / 1.8;
	}
	
	public double Cels2Fahr(double temperature) {
		return (temperature * 1.8) + 32;
	}
}
