package com.classes;

public class Employee extends Person {
	
	private double annualSalary;
	private double weeklySalary;

	public Employee() {
		super();
		this.annualSalary = 00.00;
		this.weeklySalary = 00.00;
	}
	
	public Employee(String name, double annualSalary) {
		super(name);
		this.annualSalary = annualSalary;
		this.weeklySalary = calculateWeeklySalary();
	}
	
	public double annualSalary() {
		return this.annualSalary;
	}
	
	public double weeklySalary() {
		return this.weeklySalary;
	}
	
	public void setAnnualSalary(double newAnnualSalary) {
		this.annualSalary = newAnnualSalary;
		this.weeklySalary = newAnnualSalary / 52;
	}
	
	public void setWeeklySalary(double newWeeklySalary) {
		this.weeklySalary = newWeeklySalary;
		this.annualSalary = newWeeklySalary * 52;
	}
	
	private double calculateWeeklySalary() {
		return this.annualSalary / 52;
	}

}
