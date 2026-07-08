package com.rays.opp.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(0, "quaid");
		l.add('a');
		l.add(6.1);
		l.add(98);
		l.add(false);
		l.add("johar");
		
		
		System.out.println("lists : "+ l);
		
		System.out.println("-------iterator--------");
		
		Iterator it = l.iterator();
		
		l.add("lightwala");//FailFast
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println("elements : "+o);
			it.remove();
		}
		
		System.out.println("lists : "+l);
		l.add("lightwala");
		
		System.out.println("lists : "+l);

		
	}

}
