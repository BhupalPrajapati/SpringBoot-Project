package com.example.demo.locations;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;




@Service
public class LocationServices {
	List<Location>list;
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
		 Location location = getAllLocation().stream()
				 .filter(t ->id.equals(t.getId()))
				 .findFirst()
				 .orElse(null);
		 return location;
	 }
//	 public Location addLocation(Location location) {
//		 getAllLocation().add(location);
//		return location;
//	 }
//	 public Location addLocation(Location location) {
//		 list.add(location);
//		 return location;
//	 }
	 public void addLocation(Location location) {
		 getAllLocation().add(location); 
	 }
	 
	 

}
