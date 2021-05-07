package com.synechron.javatraining.constructor;

public class Person {

	String name;
	int age;
	double weight;
	double height;
	
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
		
		printPerson(p1);
		printPerson(p2);
		printPerson(p3);
		printPerson(p5);
	}
	
	public static void printPerson(Person p)
	{
		System.out.println("--- Printing Person Values ----");
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.height);
		System.out.println("--- ------------ ----");
		
	}
	
}
