package com.rays.oop.constructor;

public class Sum {

	public Sum() {
		System.out.println("this is default constructor provide by jvm");
	}

	public Sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public Sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}
