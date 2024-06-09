package com.example.demo.posts;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;








@Service
public class PostServices {
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
	 public Post getPost(String id) {
		 Post post = getAllPosts().stream()
				 .filter(t ->id.equals(t.getId()))
				 .findFirst()
				 .orElse(null);
		 return post;
	 }
	 
	 //POST
	 public Post addPost(Post post) {
		 getAllPosts().add(post);
		return post; 
	 }
	 
	 //PUT
//	 public void updatePost(Post post) {
//		  getAllPosts().update(post);
		
//	 }
	

}
