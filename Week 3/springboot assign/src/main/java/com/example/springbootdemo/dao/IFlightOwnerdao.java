package com.example.springbootdemo.dao;

import java.util.List;

import com.example.springbootdemo.entities.FlightOwner;

public interface IFlightOwnerdao {
	public int insert(FlightOwner owner);
    	
      public List<FlightOwner> getall();
	
}
