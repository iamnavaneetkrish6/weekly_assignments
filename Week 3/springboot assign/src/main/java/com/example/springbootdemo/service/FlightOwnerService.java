package com.example.springbootdemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootdemo.dao.IFlightOwnerdao;
import com.example.springbootdemo.entities.FlightOwner;
@Service
public class FlightOwnerService {
	@Autowired
	IFlightOwnerdao dao;
    public int insert(FlightOwner owner) {
    	System.out.println(dao);
    	  int b=dao.insert(owner);
    	  return b;
      }
      public List<FlightOwner> getall() {
    	  List<FlightOwner> ownerls=dao.getall();
    	  return ownerls;
      }
	
} 
