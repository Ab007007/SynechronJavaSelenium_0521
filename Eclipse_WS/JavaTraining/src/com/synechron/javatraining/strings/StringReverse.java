package com.synechron.javatraining.strings;

public class StringReverse
{
	
	public static void main(String[] args) {
		String str = "ARAVINDA IS A TECHNICAL TRAINER";
		
		for (int i = str.length()-1; i >=0  ; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
		
	}

}
