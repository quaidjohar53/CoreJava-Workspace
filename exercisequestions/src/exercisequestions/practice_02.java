package exercisequestions;
// find the smaller of two numbers using conditional operator 

import java.util.Scanner;


public class practice_02 {
	
	
	public static void main(String[]argc) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter first number =");
		int a = sc.nextInt();
		
		System.out.println("enter second number=");
		int b = sc.nextInt();
	
		int smaller =(a<b)? a : b ;
		
		System.out.println("smaller number is =" + smaller);
		
		sc.close();
	}
	

}
