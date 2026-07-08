package exercisequestions;
//Create multiple objects in an array and loop through them.
public class Student  {
	
	
	 String name;
	 

	public static void main(String[] args) {
		Student []students = new Student [2];
		students [0]= new Student ();
		students [0].name = "aman ";
		students[1]= new Student ();
		students [1].name= "sara";
		
		for (int i = 0 ; i<students.length;i++) {
			
			System.out.println(students[i].name);
		}
		
	}

}
