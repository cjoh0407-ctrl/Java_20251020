

class Outer{
	
	private static int num=0;
	
	static class Nexted1{
		void add(int n) { num = n; }
	}
	
	static class Nested2{
		int get() { return num; }
	}
}

public class L1_StaticNested {

	public static void main(String[] args) {

		Outer.Nexted1 nst1 = new Outer.Nexted1();
		nst1.add(5);
		
		Outer.Nested2 nst2 = new Outer.Nested2();
		int n = nst2.get();
		System.out.println(n);
		
		
	}

}
