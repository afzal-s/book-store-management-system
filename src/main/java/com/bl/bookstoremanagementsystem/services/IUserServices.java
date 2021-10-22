package com.bl.bookstoremanagementsystem.services;

import com.bl.bookstoremanagementsystem.entity.User;

public interface IUserServices {
	
	void add();
	void display();
	void delete();
	void update();
	User search(String name);
}
