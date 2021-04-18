package com.contacts.contacts;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class Service1 {
	
	List<Contact> list = List.of(
			new Contact (1L,"x","y",1),
			new Contact (2L,"z","ee",1),
			new Contact (3L,"ui","qq",2)
			);
	public List<Contact> getcontacts(Integer userId)
	{
		return list.stream().filter(
			contact -> contact.getUserId().equals(userId))
				.collect(Collectors.toList());
	}
}
