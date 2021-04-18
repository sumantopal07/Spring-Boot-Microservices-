package com.contacts.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private Service1 contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Integer userId)
	{
		return this.contactService.getcontacts(userId);
	}
}
