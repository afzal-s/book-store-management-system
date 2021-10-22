package com.bl.bookstoremanagementsystem.servicesimpl;

import com.bl.bookstoremanagementsystem.common.UScanner;
import com.bl.bookstoremanagementsystem.dao.BookDao;
import com.bl.bookstoremanagementsystem.entity.Book;
import com.bl.bookstoremanagementsystem.services.IBookDao;
import com.bl.bookstoremanagementsystem.services.IBookServices;
import com.bl.bookstoremanagementsystem.view.UserController;

public class BookServicesImpl implements IBookServices{
	IBookDao bookDao = new BookDao();

	@Override
	public void addBook() {
		UserController userController = new UserController();
		Book bookInfo = userController.getBookInfo();
		bookDao.add(bookInfo);
	}

	@Override
	public void displayBook() {
		bookDao.displayAllBooks();
	}

	@Override
	public void deleteBook() {
		String bookId = UScanner.getString("Enter Book Id To Delete Book: ");
		if (bookId != null) {
			boolean deleteBookById = bookDao.delete(bookId);
			if (deleteBookById) {
				System.out.println("Book Deleted Successfully");
			} else {
				System.out.println("Book Not Found!");
			}
		}
	}

	@Override
	public void updateBook() {}

	@Override
	public void searchBook() {
		String bookId = UScanner.getString("Enter Id To Search Book: ");
		bookDao.search(bookId);
	}

}
