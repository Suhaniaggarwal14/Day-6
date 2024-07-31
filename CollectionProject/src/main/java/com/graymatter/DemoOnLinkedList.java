package com.graymatter;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> fruitList=new LinkedList<String>();
		fruitList.add("Orange");
	    fruitList.add("Apple");		
				
	    System.out.println(fruitList);
	    
	    Iterator<String> itr=fruitList.listIterator();
	    while(itr.hasNext())
	    	System.out.println(itr.next());
	    
	   
	    	
	    	
	    	
	    	
	  

	}

}
