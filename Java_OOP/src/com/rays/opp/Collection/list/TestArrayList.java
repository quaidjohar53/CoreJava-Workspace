package com.rays.opp.Collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(0,"quaid");
		l.add(1,'a');
		l.add(2,2.3);
		l.add(3,true);
		l.add(4,45);
		l.add(5,"quaid");
		l.add(6,"quaid");
		
		
		System.out.println("list: "+l);
		
		System.out.println(l.get(3));
		
		System.out.println(l.remove(5));
		
		System.out.println("list : "+l);
		
		System.out.println(l.set(0, "johar"));
		
		System.out.println(l);
		System.out.println(l.indexOf(45));
		
		System.out.println(l.lastIndexOf("quaid"));
		
		System.out.println(l.subList(1, 5));
		
		
	}

}
