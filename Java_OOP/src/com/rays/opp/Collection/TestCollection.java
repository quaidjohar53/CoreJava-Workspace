package com.rays.opp.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	
	public static void main(String[] args) {
		
		Collection c =new ArrayList();
		
		c.add(45);
		c.add("quaid");
		c.add("a");
		c.add(3.4);
		c.add(true);
		
		System.out.println(c);
		System.out.println("size of c : "+c.size());
		
		System.out.println("------------");
		
		for (Object o : c ) {
			System.out.println(o);
			
		}
		
		System.out.println("-------------");
		
		System.out.println(c.contains(21));
		System.out.println(c.contains('a'));
		System.out.println("--------------");
		System.out.println(c.remove(87));
		System.out.println(c.remove('a'));
		System.out.println("--------------");
		System.out.println(c);
		System.out.println("size of c : "+c.size());
		
	}
	
	
	
	

}
