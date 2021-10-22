package com.bl.bookstoremanagementsystem.view;

import com.bl.bookstoremanagementsystem.common.UScanner;
import com.bl.bookstoremanagementsystem.servicesimpl.UserServicesImpl;

public class UserInterface {

	public void showOptionMenu() {
		boolean exit = true;
		while (exit) {
			int choice = UScanner.getInt("1. Book Info \n" + "2. User Info \n" + "3. Exit \n" + "Enter Your Choice: ");
			switch (choice) {
			case 1:
				UserInterface.bookMenu();
				break;
			case 2:
				UserInterface.userMenu();
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

	private static void bookMenu() {
		UserServicesImpl userServicesImpl = new UserServicesImpl();
		boolean exit = true;
		while (exit) {
			int choice = UScanner.getInt("1. Add Book: \n" + 
										 "2. Display Book \n" + 
										 "3. Delete Book \n" + 
										 "4. Update Book \n" + 
										 "5. Search Book" + 
										 "Enter Your Choice: ");
			switch (choice) {
			case 1:
				userServicesImpl.add();
				break;
			case 2:
				userServicesImpl.display();
				break;
			case 3:
				userServicesImpl.delete();
				break;
			case 4:
				userServicesImpl.update();
				break;
			case 5:
				userServicesImpl.search(null);
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

	private static void userMenu() {
		UserServicesImpl userServicesImpl = new UserServicesImpl();
		boolean exit = true;
		while (exit) {
			int choice = UScanner.getInt("1. Add User: \n" + 
										 "2. Display User: \n" + 
										 "3. Delete User: \n" + 
										 "4. Update User: \n" + 
										 "5. Search User: \n" + 
										 "6. Exit \n" + 
										 "Enter Your Choice: ");
			switch (choice) {
			case 1:
				userServicesImpl.add();
				break;
			case 2:
				userServicesImpl.display();
				break;
			case 3:
				userServicesImpl.delete();
				break;
			case 4:
				userServicesImpl.search(null);
				break;
			case 5:
				userServicesImpl.update();
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
