package practicejava;

public class IfElseIf {
	
	public static void main(String[] args) {
		int x = 17 ;
		int y = 8 ;
		int z = 16;
		
		if (x>y &&  x>z) {
			System.out.println(x);
			
			
		}
		
		else if (y>x && y>z) {
			System.out.println(y);
			
		}
		
		else {
			System.out.println(z);
		}
			
		
	}

}
