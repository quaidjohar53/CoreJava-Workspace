package com.rays.opp.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add("quaid");
		c1.add(3);
		c1.add('a');
		c1.add(4.8);
		c1.add(true);
		
		System.out.println("c1 size : "+c1.size());
		System.out.println("c1 : "+c1);
		
		Collection c2 = new ArrayList();
		
		
		c2.add("johar");
		c2.add(8);
		c2.add('b');
		c2.add(9.8);
		c2.add(false);
		
		System.out.println("c2 size :" +c2.size());
		System.out.println("c2 : "+c2);
		
		System.out.println("------------");
		System.out.println(c1.containsAll(c2));
		c1.addAll(c2);
		
		
		System.out.println(c1.containsAll(c2));
		System.out.println("c1 after addAll c2 : "+c1);
		c1.removeAll(c2);
		System.out.println("c1 after removing all : "+c1);
		
		
		
		
		
		
		
		
	}

}
