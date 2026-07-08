package com.rays.oop.ExceptionHandling;

public class TestArithmeticWitTryCatch {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("c: "+c);
		}catch (ArithmeticException e ) {
			System.out.println("exception :" + e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("program is finish");
		
	}

}
