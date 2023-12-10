package com.hexaware.mappingspractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.mappingspractice.entites.Passenger;

public interface PassengerRepository  extends JpaRepository<Passenger,Integer> {

}
