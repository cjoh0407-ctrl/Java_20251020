package ex12;

public class Account {

	private int balance;
	static final int MIN_BALANCE=0;  //대문자로 사용하는것은 상수를 뜻함. 고정된 값. 변경하지 말라고 알려주는 것.
	static final int MAX_BALANCE=1000000;
	
	public Account() {
		
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance) {
		
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			
			this.balance = balance;
		}
	}
	
	
}

