package com;

import com.classes.Book;
import com.classes.Employee;
import com.classes.Trainee;
import com.classes.Person;

public class Runner {

	public static void main(String[] args) {
		
		Person personOne = new Person("Bill");
		Employee empOne = new Employee("Fred", 99000.00);
		Trainee trOne = new Trainee("Sally", 9900.00);
		
		System.out.println(personOne.getName());
		System.out.println(empOne.getName());
		System.out.println(empOne.annualSalary());
		System.out.println(empOne.weeklySalary());
		empOne.setWeeklySalary(5000.00);
		System.out.println(empOne.weeklySalary());
		System.out.println(empOne.annualSalary());
		System.out.println(trOne.subjectsLearned());
		trOne.addSubject("Math");
		System.out.println(trOne.subjectsLearned());
		trOne.addSubject("Science");
		System.out.println(trOne.subjectsLearned());
		

	}

}
