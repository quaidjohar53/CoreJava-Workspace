package com.rays.opp.Collection.Sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add('c');
		s.add('b');
		s.add('d');
		s.add('a');
		s.add('s');
		s.add('f');
		s.add('t');
		
		System.out.println(s);
		
	}

}
