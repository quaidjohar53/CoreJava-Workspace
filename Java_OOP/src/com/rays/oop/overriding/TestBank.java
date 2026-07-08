package com.rays.oop.overriding;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank b1 = new axisBank();
		
		System.out.println(b1.getName());
		System.out.println(b1.interestRate());
		
		System.out.println("-----------------");
		
		Bank b2 = new hdfcBank();
		
		System.out.println(b2.getName());
		System.out.println(b2.interestRate());
		
		System.out.println("-----------------");
		
		Bank b3= new ICICIbank();
		
		System.out.println();
		
		System.out.println(b3.getName());
		System.out.println(b3.interestRate());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
