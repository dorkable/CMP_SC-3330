package edu.mu.cmpsc3330.assignment1;

public class TicketManager {
  private Ticket ticket;
  private TicketBook ticketBook;
  private int counter=1;
  
  public TicketManager(TicketBook ticketBook) {
	  this.ticketBook = ticketBook;
  }
  
  public void createTicket(Event event, TicketType type, String studentName){
    
    if(this.ticketBook.findById(counter) != null){
    	throw new IllegalStateException("This ID is already used! Something happened");
    }
      
    ticketBook.createTicket(counter, event, type, studentName);
    counter++;
  } 
  public void cancelTicket(int id){
	  private int ticketIndex = 0;
	  Ticket soonToBeSlain = this.ticketBook.findById(int id);
	  soontoBeSlain.cancel();
    
  
  public void admitTicket(int id){
    
  }
  

}
