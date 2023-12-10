package com.spring.hibernateassignment.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.spring.hibernateassignment.entity.FlightOwner;

public class FOwnerDAOImp implements IFownerDAO {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	@Override
	public int insertFlightOwner(FlightOwner owner) {
		// TODO Auto-generated method stub
		session.save(owner);
		

		return 1;
	}

	@Override
	public int updateFlightOwner(FlightOwner owner) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(owner);
		


		return 0;
	}

	@Override
	public int deleteFlightOwner(FlightOwner owner) {
		// TODO Auto-generated method stub
		session.delete(owner);
		


		return 1;
	}

	@Override
	public FlightOwner getByOwnerId(int ownerId) {
		// TODO Auto-generated method stub
		FlightOwner ownerdet=session.get(FlightOwner.class, ownerId);
		

		return ownerdet;
	}

	@Override
	public List<FlightOwner> getAllOwner() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("select  e from FlightOwner e");

		List<FlightOwner> list = query.getResultList();
		

		return list;
	}
	
	@Override
	public List<FlightOwner> getOwners(){
		javax.persistence.Query query2 = session.createNamedQuery("getFlightRecord");

		List<FlightOwner> list2 = query2.getResultList();
        
		return list2;
		
	}
	public FlightOwner getByOwnerName(String name) {
		TypedQuery<FlightOwner> query1 = session.getNamedQuery("selectByName");
		query1.setParameter("name",name);
	    FlightOwner f1 = query1.getSingleResult();
		return f1;
	}
}
	

