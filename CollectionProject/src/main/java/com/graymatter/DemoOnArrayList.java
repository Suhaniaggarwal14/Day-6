package com.graymatter;

import java.util.ArrayList;
import java.util.Collections;

public class DemoOnArrayList {

	private static final String Iterator = null;

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee e1=new Employee("Suhani",123,50000,"delhi");
		Employee e2=new Employee("Amit",234,80000,"delhi");
		Employee e3=new Employee("Pooja",12,78000,"delhi");
		Employee e4=new Employee("Tina",189,23400,"delhi");
		Employee e5=new Employee("Karan",156,88800,"delhi");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		System.out.println("with tostring");
		System.out.println(empList);
		System.out.println("enhanced for loop");
		for(Employee emp:empList)
			System.out.println(emp);
		System.out.println("using iterator");
		java.util.Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println("Sort Operation");
//		Collections.sort(empList);
		empList.forEach((emp)->System.out.println(emp));
		
		
		
		
		
		

	}
}
