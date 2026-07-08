package practicejava;

public class CountDigit {
	
	public static void main(String[]argc) {
		
	String str = "vyv3213yu934u9fh889";
	
	
	int count = 0;
	
	for (int i = 0 ; i < str.length();i++  ) {
		
		if (Character.isDigit(str.charAt(i))) {
			
			count++;	
			
			
		}
		System.out.println("total digits in string =" + count);
	}
	
	
	
	
	
	}

}
