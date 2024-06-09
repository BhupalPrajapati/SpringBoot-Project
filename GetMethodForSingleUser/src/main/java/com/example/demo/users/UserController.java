package com.example.demo.users;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
    UserService us;

	@RequestMapping(value ="/User/{id}")
	public User getUser(@PathVariable String id) {
		return us.getUser(id);
	}
	
}