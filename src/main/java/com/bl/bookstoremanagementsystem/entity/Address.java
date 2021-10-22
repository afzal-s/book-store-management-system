package com.bl.bookstoremanagementsystem.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
	private String city;
	private String landmark;
	private String state;
	private String zipCode;
}
