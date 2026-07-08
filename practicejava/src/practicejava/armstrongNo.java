package practicejava;

public class armstrongNo {

	public static void main(String[] argc) {

		int num = 153;

		int a = num % 10;
		int b = (num / 10) % 10;
		int c = num / 100;

		int sum = a * a * a + b * b * b + c * c * c;

		if (sum == num) {

			System.out.println("number is armstrong");

		} else {

			System.out.println("number is not srmstrong");

		}

	}

}
