package com.spring.hibernateassignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="selectByName",query = "select h from FlightOwner h where h.flightOwnerName = :name "),
	@NamedQuery(name="getFlightRecord",query = "select e from FlightOwner e") 
})

public class FlightOwner {
	@Id
	private int flightOwnerId;
	private String flightOwnerPassword;
	private String flightOwnerName;
	private String flightOwnerContact;
	private String flightOwnerEmail;
	public FlightOwner() {
		super();
	}
	public FlightOwner(int flightOwnerId, String flightOwnerPassword, String flightOwnerName, String flightOwnerContact,
			String flightOwnerEmail) {
		super();
		this.flightOwnerId = flightOwnerId;
		this.flightOwnerPassword = flightOwnerPassword;
		this.flightOwnerName = flightOwnerName;
		this.flightOwnerContact = flightOwnerContact;
		this.flightOwnerEmail = flightOwnerEmail;
	}
	public int getFlightOwnerId() {
		return flightOwnerId;
	}
	public void setFlightOwnerId(int flightOwnerId) {
		this.flightOwnerId = flightOwnerId;
	}
	public String getFlightOwnerPassword() {
		return flightOwnerPassword;
	}
	public void setFlightOwnerPassword(String flightOwnerPassword) {
		this.flightOwnerPassword = flightOwnerPassword;
	}
	public String getFlightOwnerName() {
		return flightOwnerName;
	}
	public void setFlightOwnerName(String flightOwnerName) {
		this.flightOwnerName = flightOwnerName;
	}
	public String getFlightOwnerContact() {
		return flightOwnerContact;
	}
	public void setFlightOwnerContact(String flightOwnerContact) {
		this.flightOwnerContact = flightOwnerContact;
	}
	public String getFlightOwnerEmail() {
		return flightOwnerEmail;
	}
	public void setFlightOwnerEmail(String flightOwnerEmail) {
		this.flightOwnerEmail = flightOwnerEmail;
	}
	@Override
	public String toString() {
		return "FlightOwner [flightOwnerId=" + flightOwnerId + ", flightOwnerPassword=" + flightOwnerPassword
				+ ", flightOwnerName=" + flightOwnerName + ", flightOwnerContact=" + flightOwnerContact
				+ ", flightOwnerEmail=" + flightOwnerEmail + "]";
	}
	

}
