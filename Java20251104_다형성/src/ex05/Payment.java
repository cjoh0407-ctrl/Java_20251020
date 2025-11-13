package ex05;

public interface Payment {

	void pay(int amount); 
	//interface 메소드에는 public abstract가 저절로 들어간다
	
}


class CreditCard{
	void fare(int amount) { // 교통요금
		System.out.printf("신용카드로 %d원 결제했습니다.\n", amount);
	}
	
}

class kakoPay{
	void fee(int amount) { // 서비스요금, 팁
		System.out.printf("카카오페이로 %d원 결제했습니다.\n", amount);
		
	}
	
}

class SamsungPay{
	void charge(int amount) { // 일반요금
		System.out.printf("삼성페이로 %d원 결제했습니다.\n", amount);
		
	}
	
}
