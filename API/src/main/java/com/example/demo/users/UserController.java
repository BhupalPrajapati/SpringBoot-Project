package com.example.demo.users;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.locations.Location;


@RestController
public class UserController {
	//@RequestMapping(value ="/User")
//	public List<User> getAllUsers(){
//		User user1 = new User( 
//				"u1",
//				"Jany",
//				"Lawrence",
//				new Location("11","Lagos"),
//				"jany@gmail.com");
//		
//	
//	   User user2 = new User(
//			   "u2",
//			   "jadon",
//			   "Mails",
//			   new Location("12","Asba"),
//			   "jadon@gmail.com");
//	   return Arrays.asList(user1,user2);
//	}  
	
	@Autowired
    UserServices us;
	@RequestMapping(value="/users")
	public List<User> getAllUsers1()
	{
		return us.AllUsers();
	}
	@RequestMapping(value ="/User/{id}")
	public User getUser(@PathVariable String id) {
		return us.getUser(id);
	}
	
	//Post
	@RequestMapping(method=RequestMethod.POST, value = "/addusers")
	public void addUser(@RequestBody User user) {
		us.addUser(user);
	}
	
//	@PostMapping("/add")
//	public User add(@RequestBody User user) {
//		System.out.println("in add");
//		return us.addUser(user);
//	}
	
	// Put
	
	@RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
	public void getUser(@PathVariable String id, @RequestBody User user) {

	    us.updateUser(id, user);

	}
	
	//Delete
	
	 @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	 public void deleteUser(@PathVariable String id) {
	      us.deleteUser(id);
	 }

	
}
