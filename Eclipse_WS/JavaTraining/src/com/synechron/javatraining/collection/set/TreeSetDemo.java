package com.synechron.javatraining.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	
	public static void main(String[] args) {
		
		Set s  = new TreeSet();
		
		s.add(200);
		s.add(100);
		s.add(500);
		s.add(12);
		s.add(200);
		s.add(100);
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
