package com.example.springbootdemo.entities;

import java.util.Objects;

import org.springframework.stereotype.Component;
@Component
public class FlightOwner {
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
	@Override
	public String toString() {
		return "FlightOwner [flightOwnerId=" + flightOwnerId + ", flightOwnerPassword=" + flightOwnerPassword
				+ ", flightOwnerName=" + flightOwnerName + ", flightOwnerContact=" + flightOwnerContact
				+ ", flightOwnerEmail=" + flightOwnerEmail + "]";
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
	public int hashCode() {
		return Objects.hash(flightOwnerContact, flightOwnerEmail, flightOwnerId, flightOwnerName, flightOwnerPassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightOwner other = (FlightOwner) obj;
		return Objects.equals(flightOwnerContact, other.flightOwnerContact)
				&& Objects.equals(flightOwnerEmail, other.flightOwnerEmail) && flightOwnerId == other.flightOwnerId
				&& Objects.equals(flightOwnerName, other.flightOwnerName)
				&& Objects.equals(flightOwnerPassword, other.flightOwnerPassword);
	}
	

}
