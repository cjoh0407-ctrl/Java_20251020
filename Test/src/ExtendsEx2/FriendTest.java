package ExtendsEx2;

public class FriendTest {

	public static void main(String[] args) {
		
		Friend[] f1 = new Friend[5];
		
		System.out.println("이름 " + "전화번호   " + "메일주소");
		System.out.println("---------------------------");
		
		for(int i = 0; i < f1.length; i++) {
			f1[i] = new Friend("xxx", " xxxxxxxx", " xxx@xxxxx");
			System.out.println(f1[i].getInfo());
		}
		
//		f1[0] = new Friend();
//		f1[1] = new Friend();
//		f1[2] = new Friend();
//		f1[3] = new Friend();
//		f1[4] = new Friend();
		
		
	}

}
