package com.rays.oop.constructor;

import java.util.Date;

public class Person {
	
	private String name ;
	private Date dob ;
	private String Address;
	
	public Person (String name , Date dob , String Address ) {
		this.name= name ;
		this.dob=dob;
		this.Address=Address;
		
	}
	
	public String getName () {
		return name;
	}
	
	public Date getDob() {
		return dob;
		
	}
	
	public  String getAddress() {
		return Address;
	}
	

}
