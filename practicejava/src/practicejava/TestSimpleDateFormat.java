package practicejava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TestSimpleDateFormat {
	
	public static void main(String[] args) throws ParseException{
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println("Default format date = " +d);
		
		String s = sdf.format(d);
		
		System.out.println("Format date = "+s);
		
	}

}
