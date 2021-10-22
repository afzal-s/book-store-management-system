package com.bl.bookstoremanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
	private String bookName;
	private String bookId;
	private String bookAuthor;
	private String bookType;
	private String bookPrice;
	private String bookDesc;
}
