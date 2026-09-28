package edu.mu.cmpsc3330.assignment1;

public class Main {

	public static void main(String[] args) {
		Event newEvent = new Event("MSA Meetup","Tate Hall");
		Event newEvent2 = new Event("HomeComing","Faurot Field");
		TicketType newTicketType = new TicketType("Student", 0);
		TicketType newTicketType2 = new TicketType("Teacher", 10);
		

		Ticket ticket1 = new Ticket(1, newEvent, Student);
		Ticket ticket2 = new Ticket(2, newEvent, Teacher);
		Ticket ticket3 = new Ticket(3, newEvent2, Student);
		Ticket ticket4 = new Ticket(4, newEvent2, Student);
		Ticket ticket5 = new Ticket(5, newEvent, Teacher);
		
		System.out.println("Event toString-- "+newEvent);
		System.out.println("TicketType toString-- "+newTicketType);
	}

}
