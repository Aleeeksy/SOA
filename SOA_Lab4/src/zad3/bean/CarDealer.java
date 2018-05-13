package zad3.bean;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;

import zad3.model.Car;

@ManagedBean
@ViewScoped
public class CarDealer {
	List<Car> cars = new LinkedList<Car>(); 
	List<String> models = new LinkedList<String>();
	List<Car> availableCars = new LinkedList<Car>();
	
	String model;
	String brand;
	String price;
	String fuel;
	String name;
	String phone;
	boolean disable = true;
	
	public CarDealer(){
		cars.add(new Car("A4", "Audi", "10000", "benzyna"));
		cars.add(new Car("A4", "Audi", "19000", "diesel"));
		cars.add(new Car("A3", "Audi", "29000", "diesel"));
		cars.add(new Car("A3", "Audi", "23000", "benzyna"));
		cars.add(new Car("S5", "Audi", "99000", "benzyna"));
		cars.add(new Car("M5", "BMW", "99000", "benzyna"));
	}
	
	public List<String> getBrands() {
		List<String> avalibleBrands = cars.stream().map(object -> object.getBrand()).distinct().collect(Collectors.toList());

		return avalibleBrands;
	}
	
	
	public void changeListOfModel(AjaxBehaviorEvent event) {
			models.clear();
			models =  cars.stream().filter(object -> object.getBrand().equals(brand)).map(object -> object.getModel()).distinct().collect(Collectors.toList());
	}
	
	public void makeDisable(AjaxBehaviorEvent event) {
		if((price != null && !price.equals("")) 
				&& (model != null && !model.equals(""))
				&& (brand != null && !brand.equals(""))
				&& (fuel != null && !fuel.equals(""))
				&& (name != null && !name.equals(""))
				&& (phone != null && !phone.equals(""))) {
			this.disable = false;
		} 
		else {
			this.disable = true;
		}
	}
	
	public void showCars(AjaxBehaviorEvent event) {
		String[] priceParts = price.split("-");
		availableCars.clear();
		availableCars = cars.stream().filter(object -> object.getBrand().equals(brand))
									.filter(object -> object.getModel().equals(model))
									.filter(object -> Integer.valueOf(object.getPrice()) >= Integer.valueOf(priceParts[0]))
									.filter(object -> Integer.valueOf(object.getPrice()) <= Integer.valueOf(priceParts[1]))
									.filter(object -> object.getFuel().equals(fuel))
									.collect(Collectors.toList());
	
	}
	
	public void resetCars(AjaxBehaviorEvent event) {
		price = "";
		model = "";
		brand = "";
		phone = "";
		name = "";
		fuel = "";
		availableCars.clear();
	}
	
	public boolean isDisable() {
		return disable;
	}
	
	public List<Car> getAvailableCars() {
		return availableCars;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}
	public List<Car> getCars() {
		return cars;
	}

	public String getModel() {
		return model;
	}
	public List<String> getModels() {
		return models;
	}
}
