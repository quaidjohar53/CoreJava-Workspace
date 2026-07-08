package com.rays.oop.constructor;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account("54545454", "current", 500.00);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		
	}

}
