package com.bl.bookstoremanagementsystem.view;

import com.bl.bookstoremanagementsystem.common.UScanner;
import com.bl.bookstoremanagementsystem.entity.Address;
import com.bl.bookstoremanagementsystem.entity.User;
import com.bl.bookstoremanagementsystem.servicesimpl.UserServicesImpl;

public class UserController {

	public User getUserInfo() {
		User user = new User();
		user.setId(UScanner.getInt("Enter User Id: "));
		user.setName(UScanner.getString("Enter User Name: "));
		user.setEmail(UScanner.getString("Enter User Email: "));
		user.setMobile(UScanner.getString("Enter Mobile: "));
		
		Address address = new Address();
		address.setCity(UScanner.getString("Enter City: "));
		address.setLandmark(UScanner.getString("Enter Landmark: "));
		address.setState(UScanner.getString("Enter State: "));
		address.setZipCode(UScanner.getInt("Enter Zip Code: "));
		user.setAddress(address);
		
		return user;
	}
	
	public void searchUser() {
		String name = UScanner.getString("Enter User Name: ");
		UserServicesImpl userServicesImpl = new UserServicesImpl();
		userServicesImpl.search(name);
	}
}
