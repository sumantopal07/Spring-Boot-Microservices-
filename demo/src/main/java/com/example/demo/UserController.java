package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	
	@Autowired	
	private UserService userservice;
	
	@Autowired	
	private RestTemplate restTemplate;
	
	@GetMapping("/{userID}")
	public User getUser(@PathVariable("userID") int userId)
	{
		User user =  this.userservice.getUser(userId);
		
		List contacts= this.restTemplate.getForObject("http://Contact-service/contact/user/"+userId,
			List.class);
		user.setContacts(contacts);
		return user;
	}
}
