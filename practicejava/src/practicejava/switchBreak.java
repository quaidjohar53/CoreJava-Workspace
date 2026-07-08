package practicejava;

public class switchBreak {
	
	
public static void main(String[]argc) {
	
	String day = "tuesday";
	
	switch (day) {
	
	case "monday" :
		System.out.println("first day of week ");
		break;
		
	case "tuesday":
		System.out.println("second day of week ");
		break;
		
	case "wednesday":
		System.out.println("third day of week");
		break;
		
	case"thursday":
		System.out.println("fourth day of week");
		break;
		
	case "friday":
		System.out.println("fifth day of week ");
		break;
		
	case"saturday":
		System.out.println("sixth day of the week ");
		break;
		
	default:
		System.out.println("today is sunday ");
		break;
		
		
		
		
	}
}

}
