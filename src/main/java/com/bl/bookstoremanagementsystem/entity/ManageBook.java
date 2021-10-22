package com.bl.bookstoremanagementsystem.entity;

import java.util.Date;

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
public class ManageBook {
	private String id;
	private String userId;
	private String bookId;
	private Date dateOfIssue;
	private int quantity;
	private int totalPrice;
	private Date dateOfReturn;
}
