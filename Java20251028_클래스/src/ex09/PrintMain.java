package ex09;

public class PrintMain {

	public static void main(String[] args) {
		
		Printer pt = new Printer();
		
		pt.println(10);
		pt.println(true);
		pt.println(5.7);
		pt.println("홍길동");
		
		
		pt.println(10, 20);
		
	}

}
