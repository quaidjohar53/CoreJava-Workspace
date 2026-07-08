package practicejava;

public class reversingString {
	
	
	public static void main(String[]argc) {
		
		String str = "google";
		str= "fscebook";
		
		      

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		
	}

}
