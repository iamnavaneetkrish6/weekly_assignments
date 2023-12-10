package com.hexaware.scorecard.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.stereotype.Component;

@Entity
@NamedQueries({@NamedQuery(name="getScoreardByName", query = "select s from Scorecard s where s.name= :name"),
		@NamedQuery(name="getScorecard", query = "select s from Scorecard s")})
public class Scorecard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sno;
	private String batsmanName;
	private int score;
	private int ballsFaced;
	
	
	public Scorecard() {
		// TODO Auto-generated constructor stub
	}


	public Scorecard(int sno, String batsmanName, int score, int ballsFaced) {
		super();
		this.sno = sno;
		this.batsmanName = batsmanName;
		this.score = score;
		this.ballsFaced = ballsFaced;
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getBatsmanName() {
		return batsmanName;
	}


	public void setBatsmanName(String batsmanName) {
		this.batsmanName = batsmanName;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getBallsFaced() {
		return ballsFaced;
	}


	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}


	@Override
	public String toString() {
		return "Scorecard [sno=" + sno + ", batsmanName=" + batsmanName + ", score=" + score + ", ballsFaced="
				+ ballsFaced + "]";
	}

	
	
}
