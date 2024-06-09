package com.example.demo.post;

import java.util.Arrays;
import java.util.List;





public class PostService {
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
    	Post post = ((Object) post.stream())
		.filter(t -> id.equals(t.getId()))
		.findFirst()
		.orElse(null);
		
	return post;
}
	
	

}
