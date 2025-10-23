package com.hoteldetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int empid;
	private String name;
	private String email;
	private String dob;
	private String doj;
	private long phoneNo;
	private String companyName;
	private String companyAddress;
	private String streetName;
	private String districtName;
	private String stateName;
	private int pinCode;
	

}
