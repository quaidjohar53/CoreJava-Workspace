package Java_OOPsEncapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		Person p1 = new Person ();
		
		p1.setName("Quaid Johar");
		p1.setDob(sdf.parse("2001-01-25"));
		p1.setAddress("sharjah");
		
		System.out.println("p1 name : "+p1.getName());
		System.out.println("p1 dob : "+p1.getDob());
		System.out.println("p1 address : "+p1.getAddress());
		
		System.out.println("---------------------");
		
		Person p2 = new Person ();
		p2.setName("Quaid");
		p2.setDob(sdf.parse("2012-02-08"));
		p2.setAddress("Dubai");
		
		System.out.println("p2 name : "+p2.getName());
		System.out.println("p2 dob : "+p2.getDob());
		System.out.println("p2 address : "+p2.getAddress());
	}

}
