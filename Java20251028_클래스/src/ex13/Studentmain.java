package ex13;

public class Studentmain {

	public static void main(String[] args) {

		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage()); // 소수점 둘째자리에서 반올림. 78.67
		System.out.printf("평균2 : %.2f" , s.getAverage2()); // 두번째 방법
		
		System.out.println();
		System.out.println(s.info());
		
		
		
		
	}

}


//int num = 100;
//float num = 100.22f;
//System.out.println("점수 : %d" , num); // 정수출력
//System.out.printf("점수 : %f" , num); // 실수출력
//System.out.printf("점수 : %.2f" , num); // 실수출력 소수점 2번째 자리까지
//                     실수 출력 때는 printf다.