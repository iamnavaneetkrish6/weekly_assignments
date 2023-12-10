package com.hexaware.mappingspractice.entites;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Ticket {
	@Id
	private int ticketId;
	private String source;
	private String destination;
	
	@ManyToOne
	@JoinColumn(name = "uid") 
	User user;
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Ticket() {
		super();
	}
	public Ticket(int ticketId, String source, String destination) {
		super();
		this.ticketId = ticketId;
		this.source = source;
		this.destination = destination;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	

}
