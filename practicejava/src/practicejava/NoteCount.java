package practicejava;

public class NoteCount {
	
	public static void main(String[] args) {
		
		float amt = 5000000 ;
		 
		float []notes = {500,200,100,50,20,10};
		
		float count = 0 ;
		 
		for ( int i = 0 ; i<notes.length;  i++) {
			
			count = amt / notes[i];
			
			if (count>0) {
				
				System.out.println(notes[i]+ " = "+ count );  
			}
			
	
		}
		
	}

}
