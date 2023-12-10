package com.hexaware.mappingspractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.mappingspractice.entites.Ticket;


public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
