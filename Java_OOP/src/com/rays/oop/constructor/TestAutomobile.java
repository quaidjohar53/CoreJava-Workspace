package com.rays.oop.constructor;   

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile a = new Automobile("blue", 123, "djabdj");
		
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
		System.out.println(a.getMake());
		
		
	}


}
        