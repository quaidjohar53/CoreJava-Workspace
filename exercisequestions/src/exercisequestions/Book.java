package exercisequestions;
//Create a default constructor that initializes default values.

public class Book {
	
	
	String title;
	Book (){
		title = "mumbai";
		System.out.println("constructor called ");
		
	}
	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println(b1.title);
		
	}

}
