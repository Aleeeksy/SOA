package zad3.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Car {
	String model;
	String brand;
	String price;
	String fuel;
	
	public Car() {}
	
	public Car(String model, String brand, String price, String fuel) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.fuel = fuel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}	
}
