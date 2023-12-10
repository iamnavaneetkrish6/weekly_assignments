package com.spring.hibernateassignment.service;

import java.util.List;

import com.spring.hibernateassignment.entity.FlightOwner;

public interface IFownerService {
	public int insertFlightOwner(FlightOwner owner);
	public int updateFlightOwner(FlightOwner owner);
	public int deleteFlightOwner(FlightOwner owner );
	public FlightOwner getByOwnerId(int ownerId);
	public List<FlightOwner> getAllOwner();
	public FlightOwner getByOwnerName(String name);
	public List<FlightOwner> getOwners();
}
