package com.rays.oop.overriding;

public class hdfcBank extends Bank {
	
	@Override
	public String getName() {
		return "HDFC bank";
		
		
	}
	
	@Override
	public double interestRate() {
		
		return 10.10;
	}
	
	

}
