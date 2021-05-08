package com.synechron.javatraining.inheritence;

public class Lion extends Animal 
{
	public static void main(String[] args) {
		Lion l = new Lion();
		
		l.getColor();
	}

	@Override
	public void getColor() {
		System.out.println("Brown");
	}

}
