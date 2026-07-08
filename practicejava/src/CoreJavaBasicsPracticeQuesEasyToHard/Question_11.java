package CoreJavaBasicsPracticeQuesEasyToHard;
//Reverse a String without using built-in methods

public class Question_11 {
	public static void main(String[] args) {
		
		String s = "advance java";
		String rev = "";
		
		for (int i = s.length()-1; i>=0;i--) {
			rev += s.charAt(i);
			
			
		}System.out.println("reverse = "+rev);
		
	}

}
