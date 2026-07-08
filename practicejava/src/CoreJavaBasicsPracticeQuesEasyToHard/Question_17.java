package CoreJavaBasicsPracticeQuesEasyToHard;
//Print a right-angled triangle of stars with 5 rows using nested for loops.


public class Question_17 {
	
	public static void main(String[] args) {
		for (int i = 1 ; i<=50;i++) {
			for (int j =1 ; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
