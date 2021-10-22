package com.bl.bookstoremanagementsystem.view;

import com.bl.bookstoremanagementsystem.common.UScanner;
import com.bl.bookstoremanagementsystem.entity.Address;
import com.bl.bookstoremanagementsystem.entity.Book;
import com.bl.bookstoremanagementsystem.entity.User;
import com.bl.bookstoremanagementsystem.servicesimpl.UserServicesImpl;

public class UserController {

	public User getUserInfo() {
		User user = new User();
		user.setId(UScanner.getString("Enter User Id: "));
		user.setName(UScanner.getString("Enter User Name: "));
		user.setEmail(UScanner.getString("Enter User Email: "));
		user.setMobile(UScanner.getString("Enter Mobile: "));
		
		Address address = new Address();
		address.setCity(UScanner.getString("Enter City: "));
		address.setLandmark(UScanner.getString("Enter Landmark: "));
		address.setState(UScanner.getString("Enter State: "));
		address.setZipCode(UScanner.getString("Enter Zip Code: "));
		user.setAddress(address);
		
		return user;
	}

	public Book getBookInfo() {
		Book book = new Book();
		book.setBookId(UScanner.getString("Enter Book Id: "));
		book.setBookName(UScanner.getString("Enter Book Name: "));
		book.setBookAuthor(UScanner.getString("Enter Book Author: "));
		book.setBookPrice(UScanner.getString("Enter Book Price: "));
		book.setBookType(UScanner.getString("Enter Book Type: "));
		book.setBookDesc(UScanner.getString("Enter Book Description: "));
		
		return book;
	}
	
//	public void searchUser() {
//		String name = UScanner.getString("Enter User Name: ");
//		UserServicesImpl userServicesImpl = new UserServicesImpl();
//		userServicesImpl.search(name);
//	}
}
