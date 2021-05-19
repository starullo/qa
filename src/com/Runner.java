package com;

import com.classes.Book;
import com.classes.Person;

public class Runner {

	public static void main(String[] args) {
		Person personOne = new Person("Joe", "Jones", 45, "male");
		Person personTwo = new Person("Phil", "McSomething", 33, "male");
		
		Book bookOne = new Book("The Great Book", "D.H. McSomething", "Mystery", 222);
		Book bookTwo = new Book("The Big Book", "Professor Wow", "Science", 12345);
		
		personOne.read(bookOne, 12);
		personOne.openBook(bookOne);
		personOne.read(bookOne, 12);
		personOne.closeBook(bookOne);
		personOne.read(bookOne, 43);
		personOne.openBook(bookOne);
		personOne.read(bookOne, 43);
		personOne.closeBook(bookTwo);
		
		personTwo.closeBook(bookTwo);
		personTwo.openBook(bookTwo);
		personTwo.read(bookTwo, 24);
		personTwo.closeBook(bookTwo);
		personTwo.read(bookTwo, 13);
		personTwo.openBook(bookTwo);
		personTwo.read(bookTwo, 13);
		personTwo.closeBook(bookTwo);

	}

}
