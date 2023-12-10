package com.hexaware.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.challenge.entity.PlayerInfromation;

import jakarta.transaction.Transactional;



@Repository
public interface PlayerInfromationRepository extends JpaRepository<PlayerInfromation, Integer> {

	public List<PlayerInfromation> findAllOrderByPlayerName(String playerName);
	
	
	

	
	@Query("SELECT p.playerName FROM PlayerInfromation p WHERE p.totalMatches < (SELECT MAX(p1.totalMatches) FROM PlayerInfromation p1)")
	List<String> findPlayersWithFewerMatches();
	




}
