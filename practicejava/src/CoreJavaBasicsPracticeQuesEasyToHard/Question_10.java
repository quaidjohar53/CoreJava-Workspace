package CoreJavaBasicsPracticeQuesEasyToHard;

public class Question_10 {
	
	public static void main(String[] args) {
		
		int marks = 75;
		switch (marks/10) {
		
		case 10 : case 9: System.out.println("grade is A");
		break;
		case 8 : 
			System.out.println("grade id B");
			break;
		case 7:
			System.out.println("grade is C");
			break;
		case 6:
			System.out.println("grade is D");
			break;
			
			default : System.out.println("grade is F ");
		
		
		}
		
		
	}

}
