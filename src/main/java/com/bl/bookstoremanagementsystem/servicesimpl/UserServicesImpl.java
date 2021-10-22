package com.bl.bookstoremanagementsystem.servicesimpl;

import com.bl.bookstoremanagementsystem.common.UScanner;
import com.bl.bookstoremanagementsystem.dao.UserDao;
import com.bl.bookstoremanagementsystem.entity.User;
import com.bl.bookstoremanagementsystem.services.IUserDao;
import com.bl.bookstoremanagementsystem.services.IUserServices;
import com.bl.bookstoremanagementsystem.view.UserController;

public class UserServicesImpl implements IUserServices {

	IUserDao userDao = new UserDao();
	
	@Override
	public void add() {
		UserController userController = new UserController();
		User userInfo = userController.getUserInfo();
		userDao.add(userInfo);
	}

	@Override
	public void display() {
		userDao.displayAll();
	}

	@Override
	public void delete() {
		String name = UScanner.getString("Enter User Name: ");
		User user = search(name);
		if (user != null) {
			userDao.delete(user);
		}	
	}

	@Override
	public User search(String name) {
		String name1 = UScanner.getString("Enter User Name: ");
		if (userDao.searchByName(name1) != null) {
			return userDao.searchByName(name1);
		} else {
			System.out.println("This User Is Not Present");
		}
		return null;
	}
	
	@Override
	public void update() {
		
	}

}
