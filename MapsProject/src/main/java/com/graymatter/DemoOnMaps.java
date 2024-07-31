package com.graymatter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(11, "Mohan");
		map.put(9, "Ram");
		map.put(23, "Harsh");
		System.out.println(map);
		System.out.println(map.get(11));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		map.put(null, "abc");
		System.out.println(map);
		System.out.println(map.get(null));
		
		map.put(4, "hello");
		map.put(6, "hey");
		System.out.println(map);
		
		Set<Entry<Integer, String>> entSet=map.entrySet();
		Iterator<Entry<Integer, String>> itr=entSet.iterator();
	
		while(itr.hasNext())
			System.out.println(itr.next().getKey());
		
		Employee e1=new Employee("Suhani",123,50000,"delhi");
		Employee e2=new Employee("Amit",234,80000,"delhi");
		Employee e4=new Employee("Tina",189,23400,"delhi");
		Employee e3=new Employee("Pooja",12,78000,"delhi");
		
		Employee e5=new Employee("Karan",156,88800,"delhi");
		
		TreeMap<Integer, Employee> treeMap=new TreeMap<Integer,Employee>();
		treeMap.put(1, e1);
		treeMap.put(2, e2);
		treeMap.put(3, e3);
		treeMap.put(4, e4);
		treeMap.put(5, e5);
		for(Entry<Integer,Employee> e:treeMap.entrySet())
		System.out.println(e);
		
//		treeset will not do replacement when encounters same elements
		
	}

}
