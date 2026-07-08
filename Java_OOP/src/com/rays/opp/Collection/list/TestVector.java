package com.rays.opp.Collection.list;

import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		
		Vector v = new Vector ();
		
		v.addElement("quaid");
		
		v.addElement(34);
		
		System.out.println(v.elementAt(1));
		
		System.out.println(v.get(1));
	}

}
