package com.synechron.javatraining.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		Map mp = new TreeMap();
		mp.put("name", "Aravinda");
		mp.put("age", 25);
		mp.put("phone", 99558858);
		
		System.out.println(mp.get("name"));
		mp.put("name", "xxxxxxxx");
		System.out.println(mp.get("name"));
		
		System.out.println("Total Elements "  + mp.size());
		
		System.out.println(mp.values());
		
		Set keys = mp.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext())
		{
			System.out.println(mp.get(it.next()));
		}
		
		
		
	}

}
