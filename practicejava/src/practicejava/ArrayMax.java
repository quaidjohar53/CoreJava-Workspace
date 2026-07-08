package practicejava;

public class ArrayMax {
	
	public static void main(String[] args) {
		
		int []array= {78,65,24,399,18,6237,19};
		
		int max =0;
		for(int i =0;i<array.length;i++) {
			
			if (array[i]>max) {
				
				max = array[i];
				
			}
			
		}
		
		System.out.println("Maximum = "+ max);
		
	}

}
