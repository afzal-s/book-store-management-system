package com.bl.bookstoremanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.bl.bookstoremanagementsystem.entity.User;
import com.bl.bookstoremanagementsystem.services.IUserDao;

public class UserDao implements IUserDao {
	private List<User> userList = new ArrayList<>();

	@Override
	public void add(User user) {
		userList.add(user);
	}

	@Override
	public void displayAll() {
		if (userList.isEmpty()) {
			System.out.println("Empty..");
		} else {
			userList.stream().forEach(System.out::println);
		}
	}

	@Override
	public void delete(User user) {

	}

	@Override
	public User searchByName(String name) {
		User user = userList.stream()
				.filter(userName -> userName.getName()
						.equalsIgnoreCase(name))
				.findFirst()
				.orElse(null);
		return user;
	}
	
	@Override
	public void update(User user) {

	}
}
