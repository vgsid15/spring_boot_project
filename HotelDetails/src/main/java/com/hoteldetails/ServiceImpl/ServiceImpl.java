package com.hoteldetails.ServiceImpl;

import org.springframework.stereotype.Component;

import com.hoteldetails.model.Employee;
import com.hoteldetails.service.HotelService;

@Component
public class ServiceImpl implements HotelService {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Employee Name is Ramesh";
	}

	@Override
	public Employee getHotelDetails() {
		Employee emp = new Employee(100, "Siddhaarth", "vgsid15@gmail.com", "15-Jun-02", "1-Dec-23", 8637454993l, "Mphasis", "Porur", "Indira Nagar 3rd Avenue", "Chennai", "TamilNadu", 600020);
		return emp;
	}
	

}
