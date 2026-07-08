package com.rays.oop.ExceptionHandling;

public class MultiException {
	
	
	public static void main(String[] args) {
		
	
	
	String name = "Quaid Johar";
	
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(21));
		
	}catch (NullPointerException e) {
		System.out.println("exception1: "+ e.getMessage());
		
	}catch (IndexOutOfBoundsException e) {
		System.out.println("exception2 :"+e.getMessage());
	}
	
	}

}


