package com.synechron.javatraining.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	
	public static void main(String[] args) {
		
		Set s  = new HashSet();
		
		s.add(200);
		s.add(100);
		s.add("ABCD");
		s.add(500);
		s.add(12);
		
		System.out.println("Total size of the array " + s.size());
		
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
