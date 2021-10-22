package com.bl.bookstoremanagementsystem.services;

import com.bl.bookstoremanagementsystem.entity.User;

public interface IUserDao {
	void add(User user);
	boolean delete(String userId);
	void displayAllUsers();
	boolean update(String userId);
	boolean search(String userId);
}
