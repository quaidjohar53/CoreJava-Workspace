package TestStream;

import java.util.ArrayList;

public class TestStream {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		

		list.add("Tarun");
		list.add("Raman");
		list.add("Bahubali");
		list.add("Karan");
		list.add("Kattappa");
		list.add("Kattappa");
		list.add("Kattappa");
		list.add("Uday");
		

		
		list.stream().filter(e -> e.endsWith("y")).distinct().forEach(System.out::println);



		


	}

}
