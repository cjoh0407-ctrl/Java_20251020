package ex2;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	public Papers(String msg) {
		this.msg = msg; 
	}
	
	public Printable getPrinter() {	// 메서드안에 숨긴 로컬클래스
		
		class Printer implements Printable{
			
			public void print() {
				System.out.println(msg);
			}
		}
		
		return new Printer();
	}
	
	
	
	
}

public class L4_Localinner {

	public static void main(String[] args) {
		
		Papers p1 = new Papers("이 문장을 출력하고 싶어!");
		Printable prn = p1.getPrinter();
		prn.print();
		
	}

}
