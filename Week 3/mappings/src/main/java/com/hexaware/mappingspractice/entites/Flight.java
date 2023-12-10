package com.hexaware.mappingspractice.entites;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Flight {
	@Id
	private int flightId;
	private String flightname;
	private String source;
	private String destination;
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(name="Booking", joinColumns = {@JoinColumn(name="flightId")} , inverseJoinColumns = {@JoinColumn(name="passengerId")})
	private  Set<Passenger>  passengers = new HashSet<Passenger>();
	
	
	
	public Set<Passenger> getPassengers() {
		return passengers;
	}



	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}



	public Flight() {
		super();
	}



	public int getFlightId() {
		return flightId;
	}



	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}



	public String getFlightname() {
		return flightname;
	}



	public void setFlightname(String flightname) {
		this.flightname = flightname;
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
	
	public void addPassenger(Passenger passenger) {
		
		
		Set<Passenger> set =	getPassengers();
		
				set.add(passenger);
	
}
	

}
