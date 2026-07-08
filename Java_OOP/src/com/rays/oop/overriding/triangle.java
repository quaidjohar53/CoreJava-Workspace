package com.rays.oop.overriding;

public class triangle extends shape {
	
	private int base ;
	private int height;
	
	public int getBase() {
		return base ;

	}
	
	public void setBase(int base) {
		this.base=base;
		
	}
	
	public int getHeight() {
		return height;
		
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	@Override
	public void area() {
		
		System.out.println("area of triangle : "+((base *height)/2.0));
	}

}
