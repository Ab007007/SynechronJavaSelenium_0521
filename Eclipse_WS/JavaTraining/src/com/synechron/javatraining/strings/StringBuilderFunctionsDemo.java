package com.synechron.javatraining.strings;

public class StringBuilderFunctionsDemo {

	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("aru03.info@gmail.com");

		System.out.println("Characher at 0th index  " + str.charAt(0));
		System.out.println("Index of a Character from 3rd index " + str.indexOf("a", 3));
		System.out.println("Index of a Character from 0rd index " + str.indexOf("a"));
		
		System.out.println("Last Index of a Character " +str.lastIndexOf("a"));
		System.out.println("Last Index of a Character from user name " +str.lastIndexOf("a", str.indexOf("@")));
		
		
		System.out.println(str.substring(0, str.indexOf("@")));
		
		System.out.println(" Length of the string " + str.length());
		
		System.out.println("Equals to " + str.equals("aru03.info@gmail.com"));
		System.out.println("Equals to " + str.equals("Aru03.info@gmail.com"));
		
		System.out.println("Before updating string " + str.hashCode());
		str = str.append(" is my email id");
		System.out.println("After updating string " + str.hashCode());
		
		
		System.out.println("Actual String " + str);
		System.out.println("String after reverse " + str.reverse());
		System.out.println("String after reverse " + str.reverse());
		
		System.out.println(str.capacity());
		System.out.println(str.delete(str.indexOf("is"), str.length()));
		System.out.println(str.replace(str.indexOf("@")+1, str.indexOf(".",str.indexOf("@")+1 ), "yahoo"));
		
		System.out.println(str.insert(0, "My Email id is " ));
		
		
		
	}
}
