package edu.mu.cmpsc3330.assignment1;

public class Event {
	private final String name;
	private final String location;
	
	public Event(String name, String location) {
		if(name == null || name == "") {
			throw new IllegalArgumentException("name cannot be blank or null");
		}
		if(location == null || location == "") {
			throw new IllegalArgumentException("location cannot be blank or null");
		}
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public String toString() {
		return this.name + " @ " + this.location;
	}
}
