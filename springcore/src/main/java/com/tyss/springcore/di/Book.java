package com.tyss.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {

	
	@Autowired
	public Author author;
	public String Name;
	public int price;
	

	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}