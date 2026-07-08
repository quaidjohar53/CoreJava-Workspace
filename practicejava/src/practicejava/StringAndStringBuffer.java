package practicejava;

public class StringAndStringBuffer {
	
	public static void main(String[] args) {
		
		String name = "quaid ";
		
		System.out.println(name);
		System.out.println(name.replace('a','e'));
		System.out.println(name);
		
		
		System.out.println("-------------------------");

		StringBuffer sb = new StringBuffer("johar");
		
		System.out.println(sb);
		System.out.println(sb.append("saifee"));
		System.out.println(sb);
		
		
	}
	
	
	
	
	

}
