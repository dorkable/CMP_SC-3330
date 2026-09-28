package edu.mu.cmpsc3330.assignment1;

public class Ticket {
	private final int id;
	private Event event;
	private TicketType ticketType;
	private String studentName;
	private boolean canceled;
	private boolean admitted;
	
	public Ticket(int id, Event event, TicketType ticketType, String studentName) {
		if(event == null) {
			throw new IllegalArgumentException("event cannot be null");
		}
		if(ticketType == null) {
			throw new IllegalArgumentException("ticketType cannot be null");
		}
		if(studentName == null || studentName.isBlank()) {
			throw new IllegalArgumentException("studentName cannot be blank or null");
		}
		
		this.id = id;
		this.event = event;
		this.ticketType = ticketType;
		this.studentName = studentName;
		this.canceled = false;
		this.admitted = false;
	}
	
	public int getId() {
		return this.id;
	}
	
	public TicketType getTicketType() {
		return this.ticketType;
	}
	
	public Event getEvent() {
		return this.event;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public boolean isCanceled() {
		return this.canceled;
	}
	
	public boolean isAdmitted() {
		return this.admitted;
	}
	
	public boolean isActive() {
		if(!this.canceled & !this.admitted) {
			return true;
		}
		return false;
	}
	
	public int cancel() {
		if(!this.canceled & !this.admitted) {
			this.canceled = true;
			return 0;
		} else if(this.admitted) {
			return -1; //Cannot cancel an admitted ticket
		} else {
			return 1; //Won't crash the program but indicates that the ticket was already canceled
		}
	}
	
	public int admit() {
		if(!this.admitted & !this.canceled) {
			this.admitted = true;
			return 0;
		} else if(this.canceled) {
			return -1; //Cannot admit a canceled ticket
		} else {
			return 1; //Won't crash the program but indicates that the ticket was already canceled
		}
	}
	
	public String toString() {
		String output = "Id: " +this.id+ ", Student: " +this.studentName+ ", Event: {" +this.event+ "}, Ticket Type: {" +this.ticketType+ "}, Active? " + isActive();
		if(isActive() == false) {
			if(this.admitted) {
				output += ", Admitted";
			} else if(this.canceled) {
				output += ", Canceled";
			}
		}
		return output;
	}
}
