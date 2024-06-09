package com.example.demo.locations;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	@Autowired
    LocationServices us;
	@RequestMapping(value="/locations")
	public List<Location> getAllLocations()
	{
		return us.getAllLocation();
	}
	@RequestMapping(value ="/Location/{id}")
	public Location getLocation(@PathVariable String id) {
		return us.getLocation(id);
	}

	 // Post 
//	@PostMapping(value = "/addlocations")
//	public Location addLocation(@RequestBody Location location) {
//		return us.addLocation(location);
//	}
//	
	@RequestMapping(method=RequestMethod.POST, value = "/addlocations")
	public void addLocation(@RequestBody Location location) {
		us.addLocation(location);
	}
	

}
