package com.hoteldetails.service;

import org.springframework.stereotype.Service;

import com.hoteldetails.model.Employee;

@Service
public interface HotelService {
	
	String getName();
	
	Employee getHotelDetails();

}
