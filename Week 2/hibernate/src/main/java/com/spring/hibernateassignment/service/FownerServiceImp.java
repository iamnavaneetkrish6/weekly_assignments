package com.spring.hibernateassignment.service;

import java.util.List;

import com.spring.hibernateassignment.entity.FlightOwner;
import com.spring.hibernateassignment.dao.*;

public class FownerServiceImp implements IFownerService{
	IFownerDAO dao=new FOwnerDAOImp();
	@Override
	public int insertFlightOwner(FlightOwner owner) {
		// TODO Auto-generated method stub
		dao.insertFlightOwner(owner);
		return 1;
	}

	@Override
	public int updateFlightOwner(FlightOwner owner) {
		// TODO Auto-generated method stub
		dao.updateFlightOwner(owner);
		return 1;
	}

	@Override
	public int deleteFlightOwner(FlightOwner owner) {
		// TODO Auto-generated method 
        dao.deleteFlightOwner(owner);
		return 1;
	}

	@Override
	public FlightOwner getByOwnerId(int ownerId) {
		// TODO Auto-generated method stub
		FlightOwner owndet=dao.getByOwnerId(ownerId);
		return owndet;
	}

	@Override
	public List<FlightOwner> getAllOwner() {
		List<FlightOwner> ls=dao.getAllOwner();
		return ls;
	}
	@Override
	public FlightOwner getByOwnerName(String name) {
		FlightOwner ff=dao.getByOwnerName(name);
		return ff;
		
	}
	public List<FlightOwner> getOwners(){
		List<FlightOwner> ls=dao.getOwners();
		return ls;
	}

}
