package ex05Ref;

public class PayMain {

	public static void main(String[] args) {

		CreditCard cr = new CreditCard();
		cr.fare(10000);
				
		SamsungPay sa = new SamsungPay();
		sa.charge(10000);
		
		System.out.println("-----------------------------");
		
		Payment p = new kakoPay();
		p.pay(50000);	
		
		//PayMain pa = new PayMain(); // Static을 안쓰면 이렇게 객체 생성 후 호출해야함
		//pa.func(10000);
		
		func(new kakoPay(), 10000);
		
	}

	public static void func(Payment p, int money) {
		p.pay(money);
		System.out.println();
	}
}
