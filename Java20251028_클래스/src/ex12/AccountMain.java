package ex12;

public class AccountMain {

	public static void main(String[] args) {

		Account account = new Account();
		account.setBalance(10000);
		
		System.out.println(account.getBalance()); // 10000;
		
		account.setBalance(-100);
		System.out.println(account.getBalance()); 
		
		account.setBalance(2000000);
		System.out.println(account.getBalance()); 
		
		account.setBalance(300000);
		System.out.println(account.getBalance()); 
			
		
		
		
		
		
		
		
		
		
		
	}

}
