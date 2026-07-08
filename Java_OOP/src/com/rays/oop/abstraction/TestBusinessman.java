package com.rays.oop.abstraction;

public class TestBusinessman {
	
	public static void main(String[] args) {
		
		Richman r = new Businessman();
		
		r.donation();
		r.earnmoney();
		r.party();
		
		System.out.println("--------------");
		
		SocialWorker s = new Businessman();
		
		s.helpToOthers();
		
		System.out.println("--------------");
		
		Businessman b = new Businessman();
		
		b.donation();
		b.earnmoney();
		b.helpToOthers();
		b.party();
		
	}
	
	

}
