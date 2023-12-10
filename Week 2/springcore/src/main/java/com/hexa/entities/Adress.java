package com.hexa.entities;

import org.springframework.stereotype.Component;

@Component
public class Adress {
	private String Adress;
	public Adress() {
		super();
	}

	public Adress(String adress) {
		super();
		Adress = adress;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}
	

}
