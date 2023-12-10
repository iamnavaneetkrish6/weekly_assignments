package com.hexaware.mappingspractice.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Passenger {
	@Id
	private int passengerId;
	private String passengerName;
	
	@ManyToMany(mappedBy = "passengers", fetch = FetchType.LAZY)
	Set<Flight>  flights  = new  HashSet<Flight>();
	
	public Passenger() {
		super();
	}


	public Passenger(int passengerId, String passengerName) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
	}


	public int getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	
	
	
	
	

}
