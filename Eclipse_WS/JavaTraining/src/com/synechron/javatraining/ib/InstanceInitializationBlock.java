package com.synechron.javatraining.ib;

public class InstanceInitializationBlock {

	static int count =0 ;
	
	{
		System.out.println("IIB");
		++count;
	}
	
	public InstanceInitializationBlock() {
		System.out.println("Constructor");
	}
	
	
	public static void main(String[] args) {
		
		InstanceInitializationBlock ib1 = new InstanceInitializationBlock();
		InstanceInitializationBlock ib2 = new InstanceInitializationBlock();
		InstanceInitializationBlock ib3 = new InstanceInitializationBlock();
		InstanceInitializationBlock ib4 = new InstanceInitializationBlock();
		InstanceInitializationBlock ib5 = new InstanceInitializationBlock();
		
		System.out.println("Total number of objects to the class is " + count);
	}
	
	
	
}
