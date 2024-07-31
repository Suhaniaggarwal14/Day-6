package com.graymatter;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		
		 ArrayDeque<Customer> deque = new ArrayDeque<>();
		    deque.add(new Customer(1, "Suhani", 25));
	        deque.add(new Customer(2, "Kiran", 30));
	        deque.add(new Customer(3, "Harsh", 28));
	        
	        System.out.println("Deque after adding customers:");
	        System.out.println("deque.forEach");
	        
	        // Remove a customer
	        Customer customerToRemove = new Customer(2, "Kiran", 30);
	        deque.remove(customerToRemove);
	        
	     // Display dequeue after removal
	        System.out.println("Deque after removing customer Kiran:");
	        System.out.println("deque.forEach");
	        
	        
	        
	    
	        
	        
	}

}

