package com.hoteldetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hoteldetails.controller.Controller;

@SpringBootApplication
public class HotelDetailsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(HotelDetailsApplication.class, args);
		
		
	}

}
