package edu.mu.cmpsc3330.assignment1;

public class Main {

	public static void main(String[] args) {
		Event newEvent = new Event("MSA Meetup","Tate Hall");
		TicketType newTicketType = new TicketType("Student", 0);
		
		
		System.out.println("Event toString-- "+newEvent);
		System.out.println("TicketType toString-- "+newTicketType);
	}

}
