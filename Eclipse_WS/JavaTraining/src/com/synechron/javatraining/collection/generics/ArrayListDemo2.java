package com.synechron.javatraining.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.synechron.javatraining.constructor.Person;
import com.synechron.javatraining.inheritence.Employee;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Person> al = new ArrayList<Person>();
		
		
		al.add(new Person("Aravinda", 38, 70, 5.8));
		al.add(new Person("Mahesh", 38, 70, 5.8));
		al.add(new Person("Suresh", 38, 70, 5.8));
		al.add(new Person("Ganesh", 38, 70, 5.8));

		printElementsUsingIterator(al);
		
		
		
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
