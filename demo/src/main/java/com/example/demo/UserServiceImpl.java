package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list =List.of(
			new User(1,"xyz","12567891"),
			new User(2,"abc","7891"),
			new User(3,"AAAAA","1291")
	);

	@Override
	public User getUser(Integer id) {
		return this.list.stream().filter(user-> user.getUserId()
				.equals(id)).findAny().orElse(null);
	}
	

}
