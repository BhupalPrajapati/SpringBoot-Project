package com.example.demo.location;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public class LocationService {
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
	public Location getLocation(String id) {
	    Location location =getAllusers().stream()
		.filter(t -> id.equals(t.getId()))
		.findFirst()
		.orElse(null);
			
	    return location;
	}

}
