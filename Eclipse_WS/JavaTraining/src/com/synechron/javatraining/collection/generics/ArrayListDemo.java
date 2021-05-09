package com.synechron.javatraining.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.synechron.javatraining.constructor.Person;
import com.synechron.javatraining.inheritence.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Aditya");
		names.add("Ajit");
		names.add("Bhagyashri");
		names.add("Chetan");
		names.add("Devendra");
		names.add("Dinesh");
		printUsingForloop(names);
		
		
		
	}

	public static void printElementsUsingIterator(List al) {
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

	public static void printUsingForEach(List al) {
		for (Object obj : al) {
			System.out.println(obj);
		}
	}

	public static void printUsingForloop(List al) {
		System.out.println("--- Using basic For loop ----");
		System.out.println("Total elements " + al.size());
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("Element at index " + i + " is " + al.get(i));
		}
	}
}
