package com.hexaware.scorecard.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.scorecard.dao.IScorecardDao;
import com.hexaware.scorecard.dao.ScorecardDaoImp;
import com.hexaware.scorecard.entities.Scorecard;


public class ScorecardServiceImp implements IScorecardService {

	
	IScorecardDao dao = new ScorecardDaoImp();
	
	
	
	@Override
	public boolean createScorecard(Scorecard scorecard) {
		// TODO Auto-generated method stub
		return dao.createScorecard(scorecard);
	}

	@Override
	public boolean updateScorecard(Scorecard scorecard) {
		// TODO Auto-generated method stub
		return dao.updateScorecard(scorecard);
	}

	@Override
	public boolean deleteByName(String name) {
		// TODO Auto-generated method stub
		return dao.deleteByName(name);
	}

	@Override
	public Scorecard getDetailsByName(String name) {
		// TODO Auto-generated method stub
		return dao.getDetailsByName(name);
	}

	@Override
	public List<Scorecard> getFullScorecard() {
		// TODO Auto-generated method stub
		return dao.getFullScorecard();
	}

}
