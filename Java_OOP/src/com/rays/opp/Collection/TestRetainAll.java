package com.rays.opp.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
	
	public static void main(String[] args) {Collection c1 = new ArrayList();

	c1.add(45);
	c1.add("quaid");
	c1.add('a');
	c1.add(4.9);
	c1.add(true);

	System.out.println("c1: " + c1);

	System.out.println("------------");

	Collection c2 = new ArrayList();

	c2.add(78);
	c2.add("johar");
	c2.add('b');
	c2.add("quaid");
	c2.add('a');

	System.out.println("c2: " + c2);

	c1.retainAll(c2);
	System.out.println("------------");
	System.out.println(c1);
	
	System.out.println(c1.isEmpty());


		
		
	}

}
