package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Location;
import com.example.demo.Entity.User;

@RestController
public class UserController {

	@RequestMapping(value ="/User")
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
	}  

}
