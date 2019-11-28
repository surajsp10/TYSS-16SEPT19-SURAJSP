package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;

public class BookAuthor {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BookBeans.xml");
		
		
		
		
		Book book = context.getBean(Book.class);
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenname());
		System.out.println(book.getPrice());
	}

}
