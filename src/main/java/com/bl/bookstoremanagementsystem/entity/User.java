package com.bl.bookstoremanagementsystem.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
	private String id;
	private String name;
	private String email;
	private String mobile;
	private Address address;
}
