package com.rays.opp.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	
	public static void main(String[] args) {
		
		Vector v= new Vector ();
		
		v.add(0,"quaid");
		v.add(1,'a');
		v.add(2,2.9);
		v.add(3,true);
		v.add(4,843);
		v.add(5,"quaid");
		v.add(6,"quaid");
		
		System.out.println("vector : "+v);
		System.out.println("--------enumeration--------");
		
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
		
		
		System.out.println("vector  : "+v);
		
	}

}
