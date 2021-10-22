package com.bl.bookstoremanagementsystem.services;

import com.bl.bookstoremanagementsystem.entity.User;

public interface IUserDao {
	void add(User user);
	void delete(User user);
	void displayAll();
	User searchByName(String name);
	void update(User user);
}
