package com.hexaware.scorecard.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hexaware.scorecard.entities.Scorecard;
import com.hexaware.scorecard.util.ScorecardUtil;



public class ScorecardDaoImp implements IScorecardDao {

	
	SessionFactory sessionFactory = ScorecardUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	
	
	
	
	
	@Override
	public boolean createScorecard(Scorecard scorecard) {
		
		session.save(scorecard);
		
		tr.commit();
		return false;
	}

	@Override
	public boolean updateScorecard(Scorecard scorecard) {
		
		session.saveOrUpdate(scorecard);
		tr.commit();
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		
		Scorecard sc = session.get(Scorecard.class, name);
		session.delete(sc);
		tr.commit();
		return false;
	}

	@Override
	public Scorecard getDetailsByName(String name) {
		
		TypedQuery<Scorecard> query1 = session.getNamedQuery("getScoreardByName");
		query1.setParameter(1, name);
		Scorecard s1 = query1.getSingleResult();
		tr.commit();
		return s1;
	}

	@Override
	public List<Scorecard> getFullScorecard() {
		
		javax.persistence.Query query3 = session.createNamedQuery("getScorecard");
		List <Scorecard> list = query3.getResultList();

		tr.commit();
		
		
		return list;
	}

}
