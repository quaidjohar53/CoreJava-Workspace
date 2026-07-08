package CoreJavaBasicsPracticeQuesEasyToHard;
//Count how many times a given character (e.g., "a") appears in a String.


public class Question_12 {
	
	public static void main(String[] args) {
		
		String str =  "Quaid Johar Saifee";
		int count = 0 ;
		char c = 'i';
		
		for ( int i = 0; i<str.length();i++) {
			if (c==str.charAt(i)) {
				
				count++;
			}
			
			
		}System.out.println("Count of "+c+" is : "+count);
		
		
	}

}
