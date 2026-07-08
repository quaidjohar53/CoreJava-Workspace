package exercisequestions;
//Create a class `Rectangle` with a method `area()` that returns the area.
public class Rectangle {
	
	int length ;
	int width ;
	int area () {
		return length * width ;
		
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle ();
		
		r.length= 5;
		r.width=4;
		 System.out.println("area : "+ r.area());
	}

}
