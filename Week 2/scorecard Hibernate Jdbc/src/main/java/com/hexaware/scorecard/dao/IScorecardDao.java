package com.hexaware.scorecard.dao;

import java.util.List;

import com.hexaware.scorecard.entities.Scorecard;

public interface IScorecardDao {

	public boolean createScorecard(Scorecard scorecard);
	public boolean updateScorecard(Scorecard scorecard);
	
	public boolean deleteByName (String name);
	
	public Scorecard getDetailsByName(String name);
	public List<Scorecard> getFullScorecard();
	
}
