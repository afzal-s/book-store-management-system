package com.bl.bookstoremanagementsystem.view;

import com.bl.bookstoremanagementsystem.common.UScanner;
import com.bl.bookstoremanagementsystem.entity.Address;
import com.bl.bookstoremanagementsystem.entity.User;
import com.bl.bookstoremanagementsystem.services.IBookServices;
import com.bl.bookstoremanagementsystem.services.IUserServices;
import com.bl.bookstoremanagementsystem.servicesimpl.BookServicesImpl;
import com.bl.bookstoremanagementsystem.servicesimpl.UserServicesImpl;

public class UserInterface {

	public void showOptionMenu() {
		boolean exit = true;
		while (exit) {
			int choice = UScanner.getInt("1. User Info \n" + "2. Book Info \n" + "3. Exit \n" + "Enter Your Choice: ");
			switch (choice) {
			case 1:
				UserInterface.userMenu();
				break;
			case 2:
				UserInterface.bookMenu();
				break;
			case 3:
				exit = false;
				break;
			default:
				System.out.println("Enter Valid Data..");
				break;
			}
		}
	}

	private static void userMenu() {
		IUserServices userServices = new UserServicesImpl();
		boolean exit = true;
		while (exit) {
			int choice = UScanner.getInt("1. Add User: \n" + "2. Display User: \n" + "3. Search User: \n"
					+ "4. Delete User: \n" + "5. Update User: \n" + "6. Exit \n" + "Enter Your Choice: ");
			switch (choice) {
			case 1:
				userServices.addUser(); // Done
				break;
			case 2:
				userServices.displayUser(); // Done
				break;
			case 3:
				userServices.searchUser(); // Done
				break;
			case 4:
				userServices.deleteUser(); // Done
				break;
			case 5:
				userServices.updateUser();
				break;
			case 6:
				exit = false;
				break;
			default:
				System.out.println("Enter Valid Data..");
				break;
			}
		}
	}

	private static void bookMenu() {
		IBookServices bookServices = new BookServicesImpl();
		boolean exit = true;
		while (exit) {
			int choice = UScanner.getInt("1. Add Book: \n" + "2. Display Book \n" + "3. Search Book \n"
					+ "4. Delete Book \n" + "5. Update Book \n" + "6. Exit \n" + "Enter Your Choice: ");
			switch (choice) {
			case 1:
				bookServices.addBook(); // Done
				break;
			case 2:
				bookServices.displayBook(); // Done
				break;
			case 3:
				bookServices.searchBook(); // Done
				break;
			case 4:
				bookServices.deleteBook(); // Done
				break;
			case 5:
				bookServices.updateBook();
				break;
			case 6:
				exit = false;
				break;
			default:
				System.out.println("Enter Valid Data..");
				break;
			}
		}
	}
}