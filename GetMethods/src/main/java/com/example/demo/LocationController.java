package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Location;
@RestController

public class LocationController {
	@RequestMapping(value ="/Location")
	public List<Location> getAllLocation(){
		Location user1 = new Location( 
				"u1",
				"Bhupal"
				);
		
	
	   Location user2 = new Location(
			   "u2",
			   "jadon"
			   );
	   return Arrays.asList(user1,user2);
	}  
	@RequestMapping(value = "/locations/{id}")
	public Location getLocation(@PathVariable String id) {
		return us.getLocation(id);
	}

}
