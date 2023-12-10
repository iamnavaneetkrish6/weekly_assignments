package com.example.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springbootdemo.entities.FlightOwner;
import com.example.springbootdemo.service.FlightOwnerService;


@Controller
@RequestMapping("/flightowner")
public class FlightOwnerController {
	@Autowired
	FlightOwnerService service;
	@GetMapping("/open")
	public String openForm() {
		return "add_flightowner";
	}
	@PostMapping("/add")
	@ResponseBody
	public int addFlightOwner(@RequestParam int flightOwnerId, @RequestParam String flightOwnerPassword, @RequestParam String flightOwnerName, @RequestParam String flightOwnerContact,@RequestParam String flightOwnerEmail)
	
	{
		
		FlightOwner owner= new FlightOwner(flightOwnerId,flightOwnerPassword,flightOwnerName,flightOwnerContact,flightOwnerEmail);
		System.out.println(owner);
		int a= service.insert(owner);
		return a;
		
	}
	@GetMapping("/get")
	@ResponseBody
	public List<FlightOwner> getall() {
		List<FlightOwner> owner=service.getall();
		System.out.println(owner);
		return owner;
		
	}

}
