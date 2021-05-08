package com.synechron.javatraining.strings;

public class StringFunctionsDemo {

	
	public static void main(String[] args) {
		
		String str = "aru03.info@gmail.com";

		System.out.println("Characher at 0th index  " + str.charAt(0));
		System.out.println("Index of a Character from 3rd index " + str.indexOf("a", 3));
		System.out.println("Index of a Character from 0rd index " + str.indexOf("a"));
		
		System.out.println("Last Index of a Character " +str.lastIndexOf("a"));
		System.out.println("Last Index of a Character from user name " +str.lastIndexOf("a", str.indexOf("@")));
		
		
		System.out.println(str.substring(0, str.indexOf("@")));
		
		String[] strArray = str.split("@");
		System.out.println("Length of the array " + strArray.length);
		System.out.println("User Name " + strArray[0]);
		System.out.println("Domain Name " + strArray[1].substring(0, str.indexOf(".")));
		
		System.out.println("Upper case " + str.toUpperCase());
		System.out.println("Lower case " + str.toLowerCase());
		
		System.out.println(" Length of the string " + str.length());
		
		System.out.println("Equals to " + str.equals("aru03.info@gmail.com"));
		System.out.println("Equals to " + str.equals("Aru03.info@gmail.com"));
		System.out.println("Equals Ignore case  " + str.equalsIgnoreCase("Aru03.info@gmail.com"));
		System.out.println(str.replace("gmail", "outlook"));
		System.out.println(str.replaceAll("gmail", "outlook"));
		
		System.out.println("Before updating string " + str.hashCode());
		str = str.concat(" is my email id");
		System.out.println("After updating string " + str.hashCode());
		
		
		System.out.println(str);
		
	}
}
