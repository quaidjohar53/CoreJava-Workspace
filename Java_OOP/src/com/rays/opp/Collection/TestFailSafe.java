package com.rays.opp.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		
		v.add("quaid johar");
		v.add('a');
		v.add(7.7);
		v.add(true);
		v.add(98);
		v.add("quaid");
		v.add("johar");
		
		System.out.println("vector : "+v);
		
		System.out.println("-----enumeration-----");
		
		Enumeration e = v.elements();
		
		v.add("hello");
		
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
		
		System.out.println("vector : "+v);
		
	}

}
