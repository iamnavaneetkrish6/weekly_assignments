package com.example.springbootdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.entities.FlightOwner;

@Repository
public class FlightOwnerdao implements IFlightOwnerdao {
	JdbcTemplate jdbcTemplate;
	public FlightOwnerdao(@Autowired DataSource datasource) {
		
		jdbcTemplate = new JdbcTemplate(datasource);
		
    
	}
      @Override
      public int insert(FlightOwner owner) {
    	 
    	 String insert = "insert into FlightOwner(flightOwnerId,flightOwnerPassword,flightOwnerName,flightOwnerContact,flightOwnerEmail) values(?,?,?,?,?)";

  		int count = jdbcTemplate.update(insert, owner.getFlightOwnerId(), owner.getFlightOwnerPassword(), owner.getFlightOwnerName(),owner.getFlightOwnerContact(),owner.getFlightOwnerEmail());
  		

  		return count;
      }
      @Override
      public List<FlightOwner> getall() {
    	 String selectall="select * from FlightOwner";
  		List<FlightOwner> pro=jdbcTemplate.query(selectall, new FlightMapper());
  		return pro;
      }
}
