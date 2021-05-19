package com.classes;

public class Book {
	
	private String title;
	private String author;
	private String genre;
	private int pageCount;
	private boolean isOpen = false;
	private String reader = "???";
	private int curPage = 000;
	
	public Book() {
		this.title = "???";
		this.author = "???";
		this.genre = "???";
		this.pageCount = 000;
	}
	
	public Book(String title, String author, String genre, int pageCount) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public int getPageCount() {
		return this.pageCount;
	}
	
	public boolean getIsOpen() {
		return this.isOpen;
	}
	
	public String getReader() {
		return this.reader;
	}
	
	public int getCurPage() {
		return this.curPage;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	public void setGenre(String newGenre) {
		this.genre = newGenre;
	}
	
	public void setPageCount(int newPageCount) {
		this.pageCount = newPageCount;
	}
	
	public void setIsOpen(boolean newIsOpen) {
		this.isOpen = (newIsOpen);
	}
	
	public void setReader(Person p) {
		this.reader = p.getFirstName();
	}
	
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	
}





