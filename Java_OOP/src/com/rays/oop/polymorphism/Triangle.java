package com.rays.oop.polymorphism;

public class Triangle extends Shape{


	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHight() {
		return height;
	}

	public void setHight(int height) {
		this.height = height;
	}

	@Override
	public double area() {
		return ((base * height) / 2.0);
	}
	

	
}
