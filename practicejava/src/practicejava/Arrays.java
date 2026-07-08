package practicejava;

public class Arrays {
	
	
	public static void main(String[] args) {
		
		int[]a= {45,65,98,78,32,14,45,69,58};
	
		System.out.println("length of given number is = "+a.length);
		
		System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]);
		System.out.println(a[5]+a[3]+a[6]-a[2]);
		
		
		System.out.println("-----------------");
		
		
		for (int i=0;i<a.length;i++) {
			System.out.println(i+" = "+a[i]);
			
		}
		
		
	}		 

}
