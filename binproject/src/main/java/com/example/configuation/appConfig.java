package com.example.configuation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.servicesclasss.CarvehicalService;
import com.example.servicesclasss.PlaneVehicleService;
import com.example.servicesclasss.VehicleService;

@Configuration
public class appConfig {
	@Bean
	public CarvehicalService carveVehicleServiceconfiguration() {
		
		return new CarvehicalService();
	}
	@Bean
	
	public VehicleService planVehicleService() {
		return new PlaneVehicleService();
	}
	

}
