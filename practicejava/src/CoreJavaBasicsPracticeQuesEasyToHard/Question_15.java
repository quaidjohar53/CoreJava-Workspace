package CoreJavaBasicsPracticeQuesEasyToHard;
//Count digits in a number

public class Question_15 {
	
	public static void main(String[] args) {
		
		int n = 27547472;
		int count = 0 ;
		while (n!=0) {
			n/=10;
			count++;
			
		}
		System.out.println("Digits = "+count);
	}

}
