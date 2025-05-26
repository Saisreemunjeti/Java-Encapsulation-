package com.main3;

import com.book.Book;

import com.publisher.Publisher;

public class BookMain {

	public static void main(String[] args) {
		
		Publisher publisherObject=Publisher.getPublisherObject("Roli Books","Hyderabad","PUB303ss");
		
		Book bookObject=Book.getBookObject("The great gatsby", "F.Scott Fitzgerald",publisherObject, 560);
		
		System.out.println(bookObject);
		if( publisherObject==null) {
			System.out.println("Invalid book details/Publisher Details");
		}
	}
}
