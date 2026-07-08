package com.rays.oop.overriding;

public class axisBank extends Bank {
	
	@Override
	public String getName() {
		return "Axisbank";	
	}
	
	@Override
	public double interestRate() {
		return 11.25;
		
	}
	

}
