package exercisequestions;
// Create a `Car` class with fields `brand` and `speed`, then create an object and print its values.
public class car {
	
	private int speed;
	private String brand;

	public static void main(String[] args) {
		
		car c1 = new car ();
		c1.brand= "toyota ";
		c1.speed= 1;
		System.out.println(c1.brand+" "+c1.speed);
	}

}

