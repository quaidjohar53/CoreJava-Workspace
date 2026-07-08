package exercisequestions;
//Write a program to find the sum of all integers that are greater than 100 and less than 200 that are divisible by 7
public class practice_Q7 {
	
	public static void main(String[]argc) {
		
		int sum =0;
		
		for (int i =101;i<200 ; i++) {
			if(i%7==0) {
				
				sum+=i;
				
				System.out.println(i+" is divisible by 7");
				
			}
			
		}        System.out.println("\nSum = " + sum);

		
		
	}

}
