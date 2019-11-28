package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;

import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;

public class ConfigurationBookCLass {
	
	@Bean(name="author")
	
	public Author getAuthor() {
		Author author = new Author();
		author.setName("abc");
		author.setPenname("aha");
		return author;
	}

	@Bean(name="book")
	
	public Book getBook() {
		
		Book book = new Book();
		book.setAuthor(getAuthor());
		book.setName("hij");
		book.setPrice(100);
		
		return book;
	}
}
