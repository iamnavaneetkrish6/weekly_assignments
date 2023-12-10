package com.hexaware.mappingspractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.mappingspractice.entites.Flight;

public interface FlightRepository  extends JpaRepository<Flight,Integer>  {

}
