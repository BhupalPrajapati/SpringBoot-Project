package com.example.demo.users;

import java.util.Arrays;
import java.util.List;

import org.jvnet.hk2.annotations.Service;

import com.example.demo.location.Location;

 @Service
public class UserService {

	 public List<User> getAllUsers(){
			User user1 = new User( 
					"u1",
					"Jany",
					"Lawrence",
					new Location("11","Lagos"),
					"jany@gmail.com");
			
		
		   User user2 = new User(
				   "u2",
				   "jadon",
				   "Mails",
				   new Location("12","Asba"),
				   "jadon@gmail.com");
		   return Arrays.asList(user1,user2);
		 
		
		// TODO Auto-generated method stub
	

	}
	 public User getUser(String id) {
		 User user = getAllUsers().stream()
				 .filter(t ->id.equals(t.getId()))
				 .findFirst()
				 .orElse(null);
		 return user;
	 }

}
