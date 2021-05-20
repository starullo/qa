package com.classes;

import java.util.ArrayList;

public class Trainee extends Person {
	
	private double bursary;
	private ArrayList <String> subjectsLearned = new ArrayList<String>();

	public Trainee() {
		super();
		this.bursary = 00.00;
	}
	
	public Trainee(String name, double bursary) {
		super(name);
		this.bursary = bursary;
	}
	
	public double bursary() {
		return this.bursary;
	}
	
	public ArrayList<String> subjectsLearned() {
		return this.subjectsLearned;
	}
	
	public void setBursary(double newBursary) {
		this.bursary = newBursary;
	}
	
	public void addSubject(String newSubject) {
		this.subjectsLearned.add(newSubject);
	}

}
