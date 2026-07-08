package Java_OOPs_Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("------Businessman------");
		
		Businessman b = new Businessman ();
		
		b.setAddress("london");
		b.setDob(sdf.parse("2001-01-01"));
		b.setIncome(50000);
		b.setName("sanjeev");
		
		System.out.println("Address : "+b.getAddress());
		System.out.println("Dob : "+b.getDob());
		System.out.println("income : "+b.getIncome());
		System.out.println("Name : 0"+b.getName());
		
		
		System.out.println("------Doctor------");
		
		Doctor d =new Doctor();

		d.setName("raj");
		d.setAddress("new york");
		d.setRegistrationNO("BEEP001");
		d.setDob(sdf.parse("2001-01-01"));
		
		System.out.println("Name : "+d.getName());
		System.out.println("address : "+d.getAddress());
		System.out.println("registrationNo : "+d.getRegistrationNo());
		System.out.println("dob : "+d.getDob());
		
		System.out.println("------Student------");
		
		Student s = new Student ();
		
		s.setName("rohan");
		s.setAddress("delhi");
		s.setMarks(500);
		s.setRollNo("R001");
		s.setDob(sdf.parse("2001-01-01"));
		
		
		System.out.println("Name : "+s.getName());
		System.out.println("address : "+ s.getAddress());
		System.out.println("Marks : "+s.getMarks());
		System.out.println("roll no : "+s.getRollNo());
		System.out.println("dob : "+ s.getDob());
		
		
	}

}
