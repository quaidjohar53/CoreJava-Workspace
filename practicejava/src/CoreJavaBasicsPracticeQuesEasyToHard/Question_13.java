package CoreJavaBasicsPracticeQuesEasyToHard;
//Print how many times each unique character appears in the given String.


public class Question_13 {
	
	public static void main(String[] args) {
		
		
		String str = " minimum maximum";
		
		int count = 0 ;
		
		for ( char c = 'a' ; c <= 'z';c++) {
			
			for (int i = 0 ;  i<str.length();i++) {
				
				if ( str.charAt(i)==c) {
					
					count ++;
					
				}
			}
			if ( count >0 ) {
					
					System.out.println(c+" = "+ count);
				
				count = 0;
				
				
				}
			
			
		}
		
		
		
	}

}
