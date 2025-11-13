package ex04;

public class Main {

	public static void main(String[] args) {

		Archer a = new Archer();
		a.attack();
		a.defend();
		System.out.println("----------------");
		
		
		Warrior w = new Warrior();
		w.attack();
		w.defend();
		System.out.println("----------------");
	
		Action f = new Archer(); // Action interface 로 받는다?
		f.attack();
		f.defend();
	
	
	
	
	}

}
