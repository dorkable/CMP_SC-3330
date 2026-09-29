package edu.mu.cmpsc3330.assignment1;

public class Main {

	public static void main(String[] args) {
		//Create at least 2 events
		Event myEvent1 = new Event("MSA Meetup","Tate Hall");
		Event myEvent2 = new Event("HomeComing","Faurot Field");
		
		//Create at least 2 ticket types
		TicketType myTicketType1 = new TicketType("Student", 0);
		TicketType myTicketType2 = new TicketType("Teacher", 10);
		
		//Need to create these for the tests to work
		TicketBook myTicketBook = new TicketBook(5);
		TicketManager myTicketManager = new TicketManager(myTicketBook);
		
		myTicketManager.createTicket(myEvent1, myTicketType1, "Dimitri");
		myTicketManager.createTicket(myEvent1, myTicketType1, "Gavin");
		myTicketManager.createTicket(myEvent2, myTicketType2, "JimR");
		myTicketManager.createTicket(myEvent1, myTicketType2, "Gavin Ball");
		myTicketManager.createTicket(myEvent2, myTicketType1, "Brooke");
		
		System.out.println("\nAll tickets before operations:");
		myTicketBook.printAll();

		//Admitting and canceling
		System.out.println("\nValid operations tickets:");
		System.out.println("Canceling Active Ticket, result: " + myTicketManager.cancelTicket(2));
		System.out.println("Admitting Active Ticket, result: " + myTicketManager.admitTicket(3));
		
		//Showing invalid operations
		System.out.println("\nInvalid operations tickets:");
		System.out.println("Admit when already canceled should show -1, result: " + myTicketManager.admitTicket(2));
		System.out.println("Cancel when already canceled should show 1, result: " + myTicketManager.cancelTicket(2));
		System.out.println("Cancel when already admitted should show -1, result: " + myTicketManager.cancelTicket(3));
		System.out.println("Admit when already admitted should show 1, result: " + myTicketManager.admitTicket(3));
		
		System.out.println("\nAll tickets after operations:");
		myTicketBook.printAll();
		
		System.out.println("\nAll tickets for myEvent1:");
		myTicketBook.printForEvent(myEvent1);
		
		System.out.println("\nAll tickets for myEvent2:");
		myTicketBook.printForEvent(myEvent2);
	}
}
