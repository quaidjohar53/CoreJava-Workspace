package practicejava;
//Calculate the sum of all even numbers from 1 to 100 using a for loop.


public class practiceQ3 {
	
	public static void main(String[]argc) {
		
		
		int sum = 0;
		for (int i =1 ; i<=100; i++);{
			int i = 0;
			if (i%2==0) {
				sum +=i;	}
		}
		System.out.println("sum od even number ="+sum);
		
	}

}
