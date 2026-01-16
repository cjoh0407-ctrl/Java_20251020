package ex1;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	public Papers(String msg) {
		this.msg = msg; 
	}
	
	public Printable getPrinter() {
		return new Printer(); // 이 자리에 올 수 있는 대상은?
	}
	
	private class Printer implements Printable{
		public void print() {
			System.out.println(msg);
		}
	}
	
	
}

public class L3_MemberInner {

	public static void main(String[] args) {
		
		Papers p1 = new Papers("이 문장을 출력하고 싶어!");
		Printable prn = p1.getPrinter();
		prn.print();
		
	}

}
