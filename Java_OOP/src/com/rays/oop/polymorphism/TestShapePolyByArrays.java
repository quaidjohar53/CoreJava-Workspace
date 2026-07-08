package com.rays.oop.polymorphism;

public class TestShapePolyByArrays {
	
	public static void main(String[] args) {
		
		Shape []s= new Shape[3];
		
		System.out.println("length of shape array : "+ s.length);
		
		s[0]= new Circle();
		s[1]= new Rectangle ();
		s[2]= new Triangle ();
		
		
		Circle c = (Circle)s[0];
		
		c.setRadius(9);
		
		Rectangle r = (Rectangle)s[1];
		r.setLength(7);
		r.setWidth(3);
		
		Triangle t = (Triangle )s[2];
		
		t.setBase(5);
		t.setHight(4);
		
		
		for (int i =0 ;i < s.length;i++) {
			System.out.println(s[i].area());
		}
		
		
	}

}
