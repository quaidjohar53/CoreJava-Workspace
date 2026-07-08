package practicejava;

public class string {
	
	
	public static void main(String[]argc) {
		
		
		String name = new String("Quaid Johar saifee");
		
		
		System.out.println("name = "+ name);
		
		
		System.out.println("lenght = "+ name.length());
		
		
		System.out.println("first index of h is = "+ name.indexOf('h'));
		
		
		System.out.println("8 character of name is = "+name.charAt(9));
		
		
		System.out.println("last index of a = "+name.lastIndexOf('a'));
		
		
		System.out.println(name.replace('a','b'));
		
		
		System.out.println("lower case = "+name.toLowerCase());
		
		
		System.out.println("upper case ="+name.toUpperCase());
		
		
		System.out.println(name.startsWith("Quaid"));
		
		
		System.out.println(name.endsWith("feee"));
		
		
		System.out.println(name.substring(5,11));
		

		
		
	
	}

}
