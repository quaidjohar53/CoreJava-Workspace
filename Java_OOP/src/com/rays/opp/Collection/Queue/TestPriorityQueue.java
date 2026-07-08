package com.rays.opp.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.add("quaid");
		q.add(96);// runtime exception ClassCastException beacuse it contains data type same as first one used 
		
		System.out.println(q);
		
		
	}

}
