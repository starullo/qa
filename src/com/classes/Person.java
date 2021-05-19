package com.classes;

public class Person {
 
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String currentlyReading;
	private int currentPage;
	
	public Person(String firstName, String lastName, int age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.currentlyReading = "???";
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setGender(String newGender) {
		this.gender = newGender;
	}
	
	public void read(Book b, int numOfPages) {
		if (!b.getIsOpen()) {
			System.out.println("The book is closed! It must be opened before it can be read");
		} else {
			int oldCurPage = b.getCurPage();
			b.setCurPage(numOfPages + oldCurPage);
			System.out.println(this.firstName + " read " + numOfPages + " pages of " + b.getTitle() + " by " + b.getAuthor()
			+ ". They are now on page " + b.getCurPage());
		}
	}
	
	public void openBook(Book b) {
		if (b.getIsOpen()) {
			System.out.println(b.getTitle() + " is already open");
		} else {
			b.setIsOpen(true);
			System.out.println(this.firstName + " has opened " + b.getTitle());
		}
	}
	
	public void closeBook(Book b) {
		if (!b.getIsOpen()) {
			System.out.println(b.getTitle() + " is already closed");
		} else {
			b.setIsOpen(false);
			System.out.println(this.firstName + " has closed " + b.getTitle());
		}
	}
}
