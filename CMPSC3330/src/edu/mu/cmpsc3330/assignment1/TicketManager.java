package edu.mu.cmpsc3330.assignment1;

public class TicketManager {
  private TicketBook ticketBook;
  private int counter=1;
  
  public TicketManager(TicketBook ticketBook) {
	  this.ticketBook = ticketBook;
  }
  
  public void createTicket(Event event, TicketType type, String studentName){
    
    // if(this.ticketBook.findById(counter) == null){
    // 	throw new IllegalStateException("This ID is already used! Something happened");
    // }
      
    ticketBook.createTicket(counter, event, type, studentName);
    counter++;
  } 
  public int cancelTicket(int id){
	  Ticket cancelledTicket = this.ticketBook.findById(int id);
	  if (canceledTicket == null){ 				// if the ticket doesn't exist throw exception
		  throw new IllegalArgumentException("ticket id was not found");
	  }
	  return canceledTicket.cancel();
    
  }
  public int admitTicket(int id){
	  Ticket admittedTicket = this.ticketBook.findById(int id);
	  if (admittedTicket == null){ 				// if the ticket doesn't exist throw exception
		  throw new IllegalArgumentException("ticket was null");
	  }
	  return admittedTicket.admit();
  }
  

}
