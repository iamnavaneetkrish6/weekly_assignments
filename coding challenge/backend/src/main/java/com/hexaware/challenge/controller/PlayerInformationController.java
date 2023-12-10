package com.hexaware.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.challenge.dto.PlayerInformationDTO;
import com.hexaware.challenge.entity.PlayerInfromation;
import com.hexaware.challenge.service.IPlayerInformationService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/playerinfo/")
public class PlayerInformationController {

	@Autowired
	IPlayerInformationService playerInformationService;
	
	
	
	@PostMapping("add")
	public PlayerInfromation addplayerInfo( @RequestBody @Valid  PlayerInformationDTO playerInformationDTO) {
		
		
		
		return playerInformationService.addPlayerInfo(playerInformationDTO);
	}
	
	@GetMapping("getall")
	public List<String> getAllPlayerInfo(){
		
		return playerInformationService.getAllPlayerInfo();
	}
	

}
	
	
	
	
	
	
