package edu.mu.cmpsc3330.assignment1;

public class Main {

	public static void main(String[] args) {
		Event newEvent = new Event("MSA Meetup","Tate Hall");
		Event newEvent2 = new Event("HomeComing","Faurot Field");
		TicketType newTicketType = new TicketType("Student", 0);
		

		Ticket ticket1 = new Ticket(1, newEvent, Student);
		Ticket ticket2 = new Ticket(1, newEvent, Student);
		Ticket ticket3 = new Ticket(1, newEvent2, Student);
		Ticket ticket4 = new Ticket(1, newEvent2, Student);
		Ticket ticket5 = new Ticket(1, newEvent, Student);
		
		System.out.println("Event toString-- "+newEvent);
		System.out.println("TicketType toString-- "+newTicketType);
	}

}
