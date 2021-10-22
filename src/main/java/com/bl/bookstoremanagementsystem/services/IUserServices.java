package com.bl.bookstoremanagementsystem.services;

import com.bl.bookstoremanagementsystem.entity.User;

public interface IUserServices {
	
	void addUser();
	void displayUser();
	void deleteUser();
	void updateUser();
	User searchUser();
}
