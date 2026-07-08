package com.rays.oop.ExceptionHandling;

public class InsufficentFundException extends RuntimeException {
	
	public InsufficentFundException() {
		super("Insufficent Fund transfer");
	}
}
