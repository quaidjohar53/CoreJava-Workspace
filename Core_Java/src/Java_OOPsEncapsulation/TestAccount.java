package Java_OOPsEncapsulation;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setNumber("9100025007865");
		a1.setAccountType("Current");
		a1.setBalance(9600.00);
		
		System.out.println("a1 account type no : "+a1.getNumber());
		System.out.println("a1 account type : "+a1.getAccountType());
		System.out.println("a1 current balance : "+a1.getBalance());
	
	
	
	
	}
	

}
