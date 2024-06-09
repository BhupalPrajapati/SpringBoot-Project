package com.example.demo.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;





public class PostController {
	@Autowired
    PostService us;

	@RequestMapping(value = "/post/{id}")
	public Post getPost(@PathVariable String id) {
	   
		return us.getPost( id);
	}

}
