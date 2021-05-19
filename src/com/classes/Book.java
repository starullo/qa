package com.classes;

public class Book {
	
	String title;
	String author;
	String genre;
	int pageCount;
	boolean isOpen = false;
	
	public Book(String title, String author, String genre, int pageCount) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
	}
}
