package com;

import com.classes.Book;
import com.classes.Person;

public class Runner {

	public static void main(String[] args) {
		Person personOne = new Person("Joe", 45, "male");
		Person personTwo = new Person("Phil", 33, "male");
		
		Book bookOne = new Book("The Great Book", "D.H. McSomething", "Mystery", 222);
		Book bookTwo = new Book("The Big Book", "Professor Wow", "Science", 12345);
		
		personOne.read(bookOne);
		personOne.openBook(bookOne);
		personOne.read(bookOne);
		personOne.closeBook(bookOne);
		
		personTwo.closeBook(bookTwo);
		personTwo.openBook(bookTwo);
		personTwo.read(bookTwo);
		personTwo.closeBook(bookTwo);

	}

}
