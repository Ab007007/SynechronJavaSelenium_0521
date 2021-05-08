package com.synechron.javatraining.constructor;

public class Person {

	public String name;
	public int age;
	public double  weight;
	public double height;
	
	public Person() {

		System.out.println("--constructor is called ---");
	}
	
	public Person(String name, int age , double weight, double height)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	
	public static void main(String[] args) {
		
		Person p3 = new Person(); 
		Person p1 = new Person("Aravinda", 38, 70, 5.9); 
		Person p2 = new Person("Harish", 39, 85, 5); 
		Person p5 = new Person("Girish", 40, 78, 5); 
		
		p1.printAllDetails();
		p2.printAllDetails();
	}
	
	public void printAllDetails()
	{
		System.out.println("--- Printing Person Values ----");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.weight);
		System.out.println(this.height);
		System.out.println("--- ------------ ----");
		
	}
	
}
