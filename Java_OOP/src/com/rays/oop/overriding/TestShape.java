package com.rays.oop.overriding;

public class TestShape {
	
	
	public static void main(String[] args) {
		
		shape s1 = new circle();

		circle c = (circle) s1;
		c.setColor("red");
		c.setBorderWidth(2);
		c.setRadius(2);

		System.out.println("color: " + c.getColor());
		System.out.println("borderwidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();
		
	}
	
	

}
