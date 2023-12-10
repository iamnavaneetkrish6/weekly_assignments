package com.example.springbootdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.springbootdemo.entities.FlightOwner;

public class FlightMapper implements RowMapper<FlightOwner> {

	@Override
	public FlightOwner mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		FlightOwner f=new FlightOwner();
		f.setFlightOwnerId(rs.getInt("flightOwnerId"));
		f.setFlightOwnerPassword(rs.getString("flightOwnerPassword"));
		f.setFlightOwnerName(rs.getString("flightOwnerName"));
		f.setFlightOwnerContact(rs.getString("flightOwnerContact"));
		f.setFlightOwnerEmail(rs.getString("flightOwnerEmail"));
		return f;
	}

}
