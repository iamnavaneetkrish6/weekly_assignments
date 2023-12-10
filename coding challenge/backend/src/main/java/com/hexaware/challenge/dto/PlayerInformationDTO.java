package com.hexaware.challenge.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;

public class PlayerInformationDTO {

	private int playerId;
	
	@NotBlank(message = "Enter the player name")
	private String playerName;
	
	@PositiveOrZero
	private int jerseyNumber;
	
	@Pattern(regexp = "^(BAT|BOWL|WK)$")
	@NotBlank(message = "Enter the player role")
	private String playerRole;
	
	@PositiveOrZero
	private int totalMatches;
	
	@Pattern(regexp = "^[A-Z]{4,20}$")
	@NotBlank(message = "Enter the Team Name")
	private String teamName;
	
	@Pattern(regexp = "^[A-Z]{4,20}$")
	@NotBlank(message = "Enter the Country")
	private String country;
	
	
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getPlayerRole() {
		return playerRole;
	}
	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public PlayerInformationDTO(int playerId, String playerName, int jerseyNumber, String playerRole, int totalMatches,
			String teamName, String country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.playerRole = playerRole;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
	}

	
	
	

}
