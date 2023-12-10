package com.hexaware.challenge.service;

import java.util.List;

import com.hexaware.challenge.dto.PlayerInformationDTO;
import com.hexaware.challenge.entity.PlayerInfromation;

public interface IPlayerInformationService {

	
	public PlayerInfromation addPlayerInfo(PlayerInformationDTO playerInformationDTO);
	
	
	public List<String> getAllPlayerInfo();


	
	
	
	
	
}
