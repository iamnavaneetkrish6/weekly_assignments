package com.hexaware.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.hexaware.challenge.dto.PlayerInformationDTO;
import com.hexaware.challenge.entity.PlayerInfromation;
import com.hexaware.challenge.repository.PlayerInfromationRepository;

@Service
public class PlayerInformationServiceImp  implements IPlayerInformationService{

	@Autowired
	PlayerInfromationRepository playerInfromationRepository;
	
	
	@Override
	public PlayerInfromation addPlayerInfo(PlayerInformationDTO playerInformationDTO) {

		PlayerInfromation playerInfromation = new PlayerInfromation();
		playerInfromation.setPlayerName(playerInformationDTO.getPlayerName());
		playerInfromation.setJerseyNumber(playerInformationDTO.getJerseyNumber());
		playerInfromation.setPlayerRole(playerInformationDTO.getPlayerRole());
		playerInfromation.setTotalMatches(playerInformationDTO.getTotalMatches());
		playerInfromation.setCountry(playerInformationDTO.getCountry());
		playerInfromation.setTeamName(playerInformationDTO.getTeamName());
		
		
		return    playerInfromationRepository.save(playerInfromation)   ;
	}

	@Override
	public List<String> getAllPlayerInfo() {
		
		
		return playerInfromationRepository.findPlayersWithFewerMatches();
	}


	
	
	
	
	
}


