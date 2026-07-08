package exercisequestions;
//Create a parameterized constructor to set values at creation time.
public class Books {
	
	String title ;
	Double price ;
	Books (String t , double p){
		title = t ;
		price = p;
		
	}
	
	public static void main(String[] args) {
		
		Books b1 = new Books  ("java basics ",299.99) ;
		System.out.println(b1.title+" , "+b1.price);
		
			
			
		
	}

}
