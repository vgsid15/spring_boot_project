package com.greens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GreensBranchApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext greens = SpringApplication.run(GreensBranchApplication.class, args);
		
		GreensOmr omr = greens.getBean(GreensOmr.class);
		GreensPerungudi perungudi = greens.getBean(GreensPerungudi.class);
		GreensNavalur navalur = greens.getBean(GreensNavalur.class);
		
		omr.Address();
		perungudi.Address2();
		navalur.address3();
		
	}

}
