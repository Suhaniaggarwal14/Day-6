package com.graymatter;

public class Item {
	private String name;
	private int Nou;
	private double price;
	private String brand;
	
	
	
	

	@Override
	public String toString() {
		return "Item [name=" + name + ", Nou=" + Nou + ", price=" + price + ", brand=" + brand + "]";
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getNou() {
		return Nou;
	}





	public void setNou(int nou) {
		Nou = nou;
	}





	public double getPrice() {
		return price;
	}





	public void setPrice(double price) {
		this.price = price;
	}





	public String getBrand() {
		return brand;
	}





	public void setBrand(String brand) {
		this.brand = brand;
	}





	public Item(String name, int nou, double price, String brand) {
		super();
		this.name = name;
		Nou = nou;
		this.price = price;
		this.brand = brand;
	}





	public Item() {
		super();
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
