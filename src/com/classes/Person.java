package com.classes;

public class Person {
 
	public String name;
	public int age;
	public String gender;
	
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void read(Book b) {
		if (!b.isOpen) {
			System.out.println("The book is closed! It must be opened before it can be read");
		} else {
			System.out.println(this.name + " is reading " + b.title + " by " + b.author);
		}
	}
	
	public void openBook(Book b) {
		if (b.isOpen) {
			System.out.println("Book is already open");
		} else {
			System.out.println("Book is now open");
			b.isOpen = true;
		}
	}
	
	public void closeBook(Book b) {
		if (!b.isOpen) {
			System.out.println("Book is already closed");
		} else {
			System.out.println("Book is now closed");
			b.isOpen = false;
		}
	}
}
