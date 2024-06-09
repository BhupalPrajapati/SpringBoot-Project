package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Post;

@RestController

public class PostController {
	@RequestMapping(value="/Post")
	public List<Post> getAllPosts(){
		Post user1 = new Post( 
				"u1",
				"2022",
				"Laws",
			"Mumbai");
		
	
	   Post user2 = new Post(
			   "u2",
			   "jadon",
			   "2021",
			   "ambala");
	   return Arrays.asList(user1,user2);
	}  


}
