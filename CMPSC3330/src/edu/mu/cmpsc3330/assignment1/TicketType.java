package edu.mu.cmpsc3330.assignment1;

public class TicketType {
	private final String name;
	private final double price;
	
	public TicketType(String name, double price) {
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("name cannot be blank or null");
		}
		if(price < 0) {
			throw new IllegalArgumentException("price cannot be less than zero");
		}
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "Type: " + this.name + ", cost: " + this.price;
	}
}
