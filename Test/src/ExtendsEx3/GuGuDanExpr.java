package ExtendsEx3;

public class GuGuDanExpr extends Multiplication{

	public GuGuDanExpr() {};
	GuGuDanExpr(int dan) {
		super(dan);
	};
	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	};
	
	public static void printAll() {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
	
	
}
