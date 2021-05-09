package com.synechron.javatraining.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List al = new ArrayList();
		
		al.add(100);
		al.add("Aravinda");
		al.add(true);
		al.add(55.55);
		al.add(100);
		al.add("Aravinda");
		al.add(true);
		al.add(55.55);
		
		printElementsUsingIterator(al);
		
		
		
		//printUsingForEach(al);
		printUsingForloop(al);
		
		al.add(2, 1000);
		printUsingForloop(al);
		
		al.remove("Aravinda");
		printUsingForloop(al);
		
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
