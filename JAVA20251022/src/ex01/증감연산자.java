package ex01;

/*
 * ++(변수) : 선위 연산자 (증가)
 * (변수)++ : 후위 연산자
 * 
 * --(변수) : (감소)
 * (변수)--
 */
public class 증감연산자 {

	public static void main(String[] args) {

		int iNum = 10;
		System.out.println(iNum);
		
		System.out.println("iNum 1 증가 --- 1");
		iNum = iNum + 1;   //이렇게 쓰는 경우는 거의 없다.
		System.out.println(iNum);
		
		System.out.println("iNum 1 증가 --- 2");
		iNum += 1;			// 이렇게 실무에서 많이 활용.
		System.out.println(iNum);
		
		System.out.println("iNum 1 증가 --- 3");
		++iNum;				// 이렇게 실무에서 많이 활용.
		System.out.println(iNum);
		
		System.out.println("iNum 1 증가 --- 4");
		iNum++;				// 이렇게 실무에서 많이 활용.
		System.out.println(iNum);
		System.out.println("-----------------------------");
		
		System.out.println("선위연산자 1 증가 --- 5");
		int iNum2 = 1;
		int iA = ++iNum2;
		/*
		 * iNum2 += 1;
		 * int iA= iNum2;
		 */
		
		System.out.println(iA);
		System.out.println(iNum2);
		
		System.out.println("선위연산자 1 증가 --- 6");
		iNum2 = 1;
		int iB = iNum2++;
		/*
		 * int iB = iNum2;
		 * iNum2 += 1;
		 */
		
		System.out.println(iB);
		System.out.println(iNum2);
		
		int x = 1;
		int y = 1;
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
