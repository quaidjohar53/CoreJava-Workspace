package practicejava;

public class FindNumberArrays {
	
	public static void main(String[] args) {
		
		int []arr = {89,56,14,23,47,49,68,18};
		
		int number = 59;
		int count = 0 ;
		
		for ( int i = 0 ; i<arr.length;i++) {
			if (arr[i]== number) {
				
				count++;
			}
			
		}
		if (count==0) {
			
			System.out.println("number does not exit ");
			
			
		}else{
			System.out.println("number exits ");
			
		}
		
	}

}
