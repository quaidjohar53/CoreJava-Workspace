package com.rays.oop.ExceptionHandling;

public class ParentCatchBlock {
	
	public static void main(String[] args) {
		
		String name = "HelloWorld";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(5));
			
		}catch(Exception e) {
			System.out.println("exception : "+e.getMessage());
			
		}finally {
			System.out.println("Always Executes");
		}
		
	}

}
