package com.bl.bookstoremanagementsystem.servicesimpl;

import com.bl.bookstoremanagementsystem.common.UScanner;
import com.bl.bookstoremanagementsystem.dao.UserDao;
import com.bl.bookstoremanagementsystem.entity.User;
import com.bl.bookstoremanagementsystem.services.IUserDao;
import com.bl.bookstoremanagementsystem.services.IUserServices;
import com.bl.bookstoremanagementsystem.view.UserController;

public class UserServicesImpl implements IUserServices {

	IUserDao userDao = new UserDao();
	
	public void addUser() {
		UserController userController = new UserController();
		User userInfo = userController.getUserInfo();
		userDao.add(userInfo);		
	}

	@Override
	public void displayUser() {
		userDao.displayAllUsers();
	}

	@Override
	public void deleteUser() {
		String userId = UScanner.getString("To Delete Enter User ID: ");
		if (userId != null) {
			boolean deleteUserById = userDao.delete(userId);
			if (deleteUserById) {
				System.out.println("User Deleted Successfully..");
			} else {
				System.out.println("User Not Found..");
			}
		}	
	}

	@Override
	public void updateUser() {
		String userId = UScanner.getString("To Update Enter User ID: ");
		if (userId != null) {
			boolean updateUserById = userDao.update(userId);
			if (updateUserById) {
				System.out.println("User Updated Successfully..");
			} else {
				System.out.println("User Not Found..");
			}
		}
	}

	@Override
	public User searchUser() {
		String userId = UScanner.getString("Enter Id To Search: ");
		if (userId != null) {
			userDao.search(userId);
		}
		return null;
	}

}
