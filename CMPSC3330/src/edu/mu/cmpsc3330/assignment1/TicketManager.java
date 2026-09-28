package edu.mu.cmpsc3330.assignment1;

public class TicketManager {
  private Ticket ticket;
  private int counter=1;
  
  public void createTicket(Event event, TicketType type, String studentName){
    
    if (findById(counter)){
      throw new IllegalStateException("This ID is already used! Something happened"){
    }
      
    Ticket ticket = new Ticket(int counter, Event event, TicketType type, String studentName);
    counter++;
  }
  /*
  private void addTicketEvent(Ticket ticket, Event event){
    
  }
  
  
  public void cancelTicket(int id){
    
  }
  
  public void admitTicket(int id){
    
  }
  
  */

}
