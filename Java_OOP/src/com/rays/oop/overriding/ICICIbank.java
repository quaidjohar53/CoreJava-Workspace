package com.rays.oop.overriding;

public class ICICIbank extends Bank{
	
	@Override
	public String getName() {
		return "ICICI bank";
		
	}
	
	@Override
	public double interestRate() {
		
		return 12.05;
	}

}
