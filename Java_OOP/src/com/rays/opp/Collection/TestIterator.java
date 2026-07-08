package com.rays.opp.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(0,"quaid");
		l.add(1,'a');
		l.add(2, 9.8);
		l.add(3,true);
		l.add(4, 82);
		l.add(5,"quaid");
		l.add(6,"quaid");
		
		System.out.println("list : "+l);
		
		System.out.println("------for each loop-------");
		
		for (Object o: l) {
			System.out.println(o);
		}
		
		System.out.println("----iterator-------");
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println("elements : "+o);
			it.remove();
		}
		
		System.out.println("lists : "+l);
		
		
	} 

}
