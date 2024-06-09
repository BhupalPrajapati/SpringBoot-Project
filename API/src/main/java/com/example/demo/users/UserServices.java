package com.example.demo.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.locations.Location;



@Service
public class UserServices {
	public List<User> AllUsers=new ArrayList<User>();
	
//	 public List<User> getAllUsers(){
//			User user1 = new User( 
//					"u1",
//					"Jany",
//					"Lawrence",
//					new Location("11","Lagos"),
//					"jany@gmail.com");
//			
//		
//		   User user2 = new User(
//				   "u2",
//				   "jadon",
//				   "Mails",
//				   new Location("12","Asba"),
//				   "jadon@gmail.com");
//		   return Arrays.asList(user1,user2);
//		 
//		
//		// TODO Auto-generated method stub
//	
//
//	}
	 public User getUser(String id) {
		 User user = AllUsers().stream()
				 .filter(t ->id.equals(t.getId()))
				 .findFirst()
				 .orElse(null);
		 return user;
	 }
	 
	 //Post
	 public User addUser(User user) {
		 AllUsers.add(user);
		return user; 
	 }
	public List<User> AllUsers() {
		// TODO Auto-generated method stub
		return AllUsers;
	}
	
	
     //Delete
	
//	public User deleteUser(User user) {
//		AllUsers.
//	}
     //Put
	
	

	public void updateUser(String id, User user) {
		

	    for(int i = 0; i < user.size();i++) {

		User u = user.get(i);

		if(u.getId().equals(id)) {

		     user.set(i, user);

		     return;
		}
	    }
	}
	
	//Delete
	
	public void deleteUser(String id) {
	    AllUsers.removeIf(u -> u.getId().equals(id));		
	}
	 

}
