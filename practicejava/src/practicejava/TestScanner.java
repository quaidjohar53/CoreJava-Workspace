package practicejava;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter first int= ");
		int a = sc.nextInt();
		
		System.out.println("enter second int= ");
		int b = sc.nextInt();
		
		System.out.println("your first interger is ="+a);
		System.out.println("your second integer is ="+b);
		
		System.out.println("select your opr.....(/,-,*,+,%)");
		String opr=sc.next();
		
		switch (opr) {
		case "+":
			System.out.println("result=" +(a+b));
			break;
			
		case "-" :
			System.out.println("result="+(a-b));
			break;
			
		case "/":
			System.out.println("result="+(a/b));
			break;
			
		case "*":
			System.out.println("result="+(a*b));
			break;
			
		case "%":
			System.out.println("result="+(b%a));
			break;
			
			
		
		
		
		}sc.close();
		
		
		

	}

}
