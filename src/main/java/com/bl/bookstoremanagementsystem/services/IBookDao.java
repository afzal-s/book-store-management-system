package com.bl.bookstoremanagementsystem.services;

import com.bl.bookstoremanagementsystem.entity.Book;

public interface IBookDao {

	void add(Book bookInfo);
	void displayAllBooks();
	boolean delete(String bookId);
	void search(String bookId);

}
