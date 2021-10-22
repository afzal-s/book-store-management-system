package com.bl.bookstoremanagementsystem.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bl.bookstoremanagementsystem.entity.Book;
import com.bl.bookstoremanagementsystem.services.IBookDao;

public class BookDao implements IBookDao {
	private List<Book> bookList = new ArrayList<>();
	
	@Override
	public void add(Book bookInfo) {
		bookList.add(bookInfo);
	}

	@Override
	public void displayAllBooks() {
		Iterator<Book> iterator = bookList.iterator();
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			if(bookList.isEmpty()) {
				System.out.println("Book Is Empty...");
			} else {				
				System.out.println(book);
			}
		}
	}

	@Override
	public boolean delete(String bookId) {
		Iterator<Book> iteratorToDelete = bookList.iterator();
		while (iteratorToDelete.hasNext()) {
			Book book = (Book) iteratorToDelete.next();
			if (book.getBookId().equalsIgnoreCase(bookId)) {
				return bookList.remove(book);
			}
		}
		return false;	
	}

	@Override
	public void search(String bookId) {
		Iterator<Book> iteratorToSearch = bookList.iterator();
		while (iteratorToSearch.hasNext()) {
			Book book = (Book) iteratorToSearch.next();
			if (book.getBookId().equalsIgnoreCase(bookId)) {
				System.out.println(book);
			} else {
				System.out.println("Check Id..");
			}
		}
	}
}
