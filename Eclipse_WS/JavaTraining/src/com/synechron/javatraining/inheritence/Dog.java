package com.synechron.javatraining.inheritence;

public class Dog extends Animal implements BasicBehaviour
{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.getColor();
		d.communicate();
		d.see();
		d.run();
		d.maxAge();
	}

	@Override
	public void getColor() {
		System.out.println("Black");
	}

	@Override
	public void see() {
		System.out.println("Can differenciate family members and outsiders");
		
	}

	@Override
	public void communicate() {
		System.out.println("yes, with its own language");
		
	}

	@Override
	public void run() {
		System.out.println("No.., it Bite");
		
	}
	
	public void maxAge() {
		//MAX_AGE = MAX_AGE - 120;
		System.out.println(MAX_AGE - 120);
	}
	
}
