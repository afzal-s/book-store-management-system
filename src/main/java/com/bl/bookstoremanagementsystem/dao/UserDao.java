package com.bl.bookstoremanagementsystem.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bl.bookstoremanagementsystem.entity.User;
import com.bl.bookstoremanagementsystem.services.IUserDao;
import com.bl.bookstoremanagementsystem.view.UserInterface;

public class UserDao implements IUserDao {
	private List<User> userList = new ArrayList<>();

	@Override
	public void add(User user) {
		userList.add(user);
	}

	@Override
	public void displayAllUsers() {
		if (userList.isEmpty()) {
			System.out.println("Empty..");
		} else {
			userList.stream().forEach(System.out::println);
		}
	}

	@Override
	public boolean delete(String userId) {
		for (User user : userList) {
			if (user.getId().equalsIgnoreCase(userId)) {
				return userList.remove(user);
			}
		}
		return false;
	}

	@Override
	public boolean update(String userId) {
		UserInterface userInterface = new UserInterface();
		for (User user : userList) {
			if (user.getId().equalsIgnoreCase(userId)) {
				
			}
		}
		return false;
	}

	@Override
	public boolean search(String userId) {
		boolean found = false;
		Iterator<User> iterator = userList.iterator();
		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			if (user.getId().equalsIgnoreCase(userId)) {
				System.out.println(user);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Record Not Found..");
		}
		return false;
	}

}
