package com.bl.bookstoremanagementsystem.common;

import java.util.Scanner;

public class UScanner {
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static int getInt(String message) {
		message(message);
		return SCANNER.nextInt();
	}

	public static String getString(String message) {
		message(message);
		return SCANNER.next();
	}
	
	private static void message(String message) {
		System.out.print(message);
	}

}
