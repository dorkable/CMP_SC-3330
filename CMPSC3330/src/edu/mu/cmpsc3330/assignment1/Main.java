package edu.mu.cmpsc3330.assignment1;

public class Main {

	public static void main(String[] args) {
		Event newEvent = new Event("MSA Meetup","Tate Hall");
		Event newEvent2 = new Event("HomeComing","Faurot Field");
		TicketType newTicketType = new TicketType("Student", 0);

		Ticket ticket = new Ticket(1, newEvent, Student);
		
		System.out.println("Event toString-- "+newEvent);
		System.out.println("TicketType toString-- "+newTicketType);
	}

}
