package com.example.demo.posts;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



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
	@Autowired
    PostServices us;
	@RequestMapping(value="/posts")
	public List<Post> getAllPosts1()
	{
		return us.getAllPosts();
	}
	@RequestMapping(value ="/Post/{id}")
	public Post getPost(@PathVariable String id) {
		return us.getPost(id);
	}
	//Post
	@RequestMapping(method=RequestMethod.POST, value = "/addposts")
	public void addPost(@RequestBody Post post) {
		us.addPost(post);
	}
	
	//Put
//	@RequestMapping(method=RequestMethod.PUT, value = "/putposts")
//	public void updatePost(@RequestBody Post post) {
//		us.updatePost(post);
//	}
//	

}
