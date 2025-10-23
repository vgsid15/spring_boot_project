package com.hoteldetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoteldetails.ServiceImpl.ServiceImpl;
import com.hoteldetails.model.Employee;

@RestController
public class Controller {

	@Autowired
	ServiceImpl serviceimpl;
	
	
	
	@GetMapping(value="/hotelName")
	public String getNameInfo() {
		// TODO Auto-generated method stub
		String name = serviceimpl.getName();
		return name;

	}
	
	@GetMapping(value="/hotel")
	public Employee getHotelInfo() {
		Employee hotelDetails = serviceimpl.getHotelDetails();
		return hotelDetails;
		
	}
	
}
