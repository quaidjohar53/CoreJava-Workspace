package com.rays.oop.constructor;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class TestPerson {
	
	public static void main(String[] args)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p = new Person("hello",sdf.parse("2006-02-02"), "delhi");
		
		System.out.println(p.getAddress());
		System.out.println(p.getName());
		System.out.println(p.getDob());
	}

}
