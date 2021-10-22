package com.bl.bookstoremanagementsystem;

import com.bl.bookstoremanagementsystem.view.UserInterface;

public class App {
	static {System.out.println("Welcome To Book Store Management System");}
   
	public static void main( String[] args ) {
    	UserInterface userInterface = new UserInterface();
    	userInterface.showOptionMenu();
    }
}
