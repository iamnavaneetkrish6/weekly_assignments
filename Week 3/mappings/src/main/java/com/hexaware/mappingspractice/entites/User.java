package com.hexaware.mappingspractice.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
	private int userId;
	private String username;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Ticket> tickets = new HashSet<Ticket>();
	
	
	public Set<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	public User(int userId, String username) {
		super();
		this.userId = userId;
		this.username = username;
	}
	public User() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void addTicket(Ticket ticket) {

		// here employee need dept obj so adding current dept obj to employee obj 
				
		 ticket.setUser(this); // in main() dept.addEmployee(e1);

				Set<Ticket> set = getTickets();

				set.add(ticket);

			}

	

}
