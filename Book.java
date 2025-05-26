package com.book;

import com.publisher.Publisher;

public class Book {
	  
	private String title;
	private String author;
	private Publisher publisher;
	private double price;
	private Book(String title, String author, Publisher publisher, double price) {
		this.setTitle(title);
		this.setAuthor(author);
		this.publisher = publisher;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title==null||title.isEmpty()) {
			this.title=null;
		}
		else {
			this.title = title;
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
		if(author==null||author.isEmpty()) {
			this.author=null;
		}
		else {
			this.author = author;
		}
		
		
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>50 && price<1000) {
			this.price = price;
		}
		else {
			this.price=0;
		}
	}

	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price + "]";
	}
	public static Book getBookObject(String title, String author, Publisher publisher, double price) {
		
		return new Book(title,author,publisher,price);
	}
}
