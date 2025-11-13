package ex04;

public class Main {

	public static void main(String[] args) {

	/*	Printer p = new LaserPrinter();
		Printer i = new InkjetPrinter();
		
		p.print("테스트 페이지 출력");
		i.print("테스트 페이지 출력");
	*/
		
		System.out.println();
		
		Printer p = new LaserPrinter();
				p.print("테스트 페이지 출력");
		
				p = new InkjetPrinter();
				p.print("테스트 페이지 출력");
	}

}
