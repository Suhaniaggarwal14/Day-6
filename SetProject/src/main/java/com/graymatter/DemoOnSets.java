package com.graymatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class DemoOnSets {
	
	public static void main(String[] args) {
//		hashSet to linkedhashSet
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
//		no duplicates
//		inserting order are preserved
		
		hs.add(56);
		hs.add(34);
		hs.add(88);
		hs.add(67);
		System.out.println(hs);
		
		hs.add(34);
		System.out.println(hs);
		
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		HashSet<Integer> hs1= (HashSet<Integer>) hs.clone();
		System.out.println(hs1);
		
//		LinkedHashSet
	    Object arr[]=hs.toArray();
		System.out.println(arr[2]);
		
//		change hashSet to list
		List<Object> alist=Arrays.asList(arr);
//		System.out.println(Collections.reverse(alist));
		
//		creating treeset
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(67);
		ts.add(12);
		ts.add(77);
		ts.add(90);
		System.out.println(ts);
		
		Iterator<Integer> itr1=ts.descendingIterator();
		while(itr1.hasNext());
			System.out.println(itr1.next());
			
			Employee e1=new Employee("Suhani",123,50000,"delhi");
			Employee e2=new Employee("Amit",234,80000,"delhi");
			Employee e3=new Employee("Pooja",12,78000,"delhi");
			Employee e4=new Employee("Tina",189,23400,"delhi");
			Employee e5=new Employee("Karan",156,88800,"delhi");
			TreeSet<Employee> empTree=new TreeSet<Employee>();
			empTree.add(e1);empTree.add(e2);empTree.add(e3);empTree.add(e4);empTree.add(e5);
			for(Employee emp:empTree)
			System.out.println(empTree);
			
			System.out.println(ts.ceiling(60));
			System.out.println(ts.floor(60));
		
			ts.add(56);
			ts.add(43);
			ts.add(89);
			System.out.println(ts.headSet(57));
			System.out.println(ts.tailSet(57));
			
			
			
			
		
		
		
	}

}
